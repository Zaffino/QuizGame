package com.example.quizgame;


import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.apache.commons.text.StringEscapeUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Question {

    int correctAnswerCount;
    int questionCount;

    String risposta;
    JSONObject rispostaJSON;

    String question;
    String correct_answer;
    ArrayList<String> incorrect_answers;



    public Question() {
        this.questionCount = 0;
        this.rispostaJSON = new JSONObject();
        this.incorrect_answers = new ArrayList<>();
    }

    public Question(String s) throws JSONException {
        this.questionCount = 0;
        this.rispostaJSON = new JSONObject(s);
        this.incorrect_answers = new ArrayList<>();

    }

    protected void fetchRispostaJSON(final RequestQueue queue, final String url){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {

                        rispostaJSON = response;

                        Log.e("Rest response",response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //fetchRispostaJSON(queue, url);
                        Log.e("Rest response",error.toString());
                    }
                }
        );

        jsonObjectRequest.setRetryPolicy(new DefaultRetryPolicy(
                500,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));


        queue.add(jsonObjectRequest);



    }

    protected void responseParse() throws NullPointerException{


        try {
            JSONObject temp;
            temp = rispostaJSON.getJSONArray("results").getJSONObject(questionCount);

            question = temp.getString("question");
            correct_answer = temp.getString("correct_answer");
            incorrect_answers.add(temp.getJSONArray("incorrect_answers").getString(0));
            incorrect_answers.add(temp.getJSONArray("incorrect_answers").getString(1));
            incorrect_answers.add(temp.getJSONArray("incorrect_answers").getString(2));

            question = StringEscapeUtils.unescapeHtml4(question);
            correct_answer = StringEscapeUtils.unescapeHtml4(correct_answer);
            incorrect_answers.set(0, StringEscapeUtils.unescapeHtml4(incorrect_answers.get(0)));
            incorrect_answers.set(1, StringEscapeUtils.unescapeHtml4(incorrect_answers.get(1)));
            incorrect_answers.set(2, StringEscapeUtils.unescapeHtml4(incorrect_answers.get(2)));

        } catch (JSONException e) {
            e.printStackTrace();
        }



    }

    protected void randomizeOrder(Button r1, Button r2, Button r3, Button r4){
        r1.setText(correct_answer);
        r2.setText(incorrect_answers.get(0));
        r3.setText(incorrect_answers.get(1));
        r4.setText(incorrect_answers.get(2));
    }


    protected void writeResponse(TextView textView, Button r1, Button r2, Button r3, Button r4){
        responseParse();

        textView.setText(question);

        int random = (int) (Math.random()*4);

        if(random == 0)
            randomizeOrder(r1, r2, r3, r4);
        else if(random == 1)
            randomizeOrder(r2, r1, r3, r4);
        else if(random == 2)
            randomizeOrder(r2, r3, r1, r4);
        else if(random == 3)
            randomizeOrder(r2, r3, r4, r1);


        incorrect_answers.clear();

    }

    public String getCorrect_answer() {
        return correct_answer;
    }

    public int getQuestionCount() {
        return questionCount;
    }

    public void incrementQuestionCount() {
        questionCount++;
    }

    public void resetQuestionCount() {
        questionCount = 0;
    }

    public void incrementCorrectAnswerCount(){
        correctAnswerCount++;
    }

    public void resetCorrectAnswerCount(){
        correctAnswerCount = 0;
    }

    public int getCorrectAnswerCount(){
        return correctAnswerCount;
    }

    public JSONObject getRispostaJSON() {
        return rispostaJSON;
    }


}
