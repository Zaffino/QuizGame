package com.example.quizgame;

import android.os.Bundle;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;


import androidx.appcompat.app.AppCompatActivity;


import android.util.Log;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import org.apache.commons.text.StringEscapeUtils;

public class MainActivity extends AppCompatActivity {

    TextView responseView ;
    RequestQueue queue;
    Button button;
    String url;

    String risposta;
    JSONObject rispostaJSON;

    String question;
    String correct_answer;
    ArrayList <String> incorrect_answers;


    public void onButtonClick(View view) {


        jsonParse();

        risposta = question + "\n" + correct_answer + "\n"
                + incorrect_answers.get(0) + "\n"
                + incorrect_answers.get(1) + "\n"
                + incorrect_answers.get(2);

        incorrect_answers.clear();

        risposta = StringEscapeUtils.unescapeHtml4(risposta);

        responseView.setText(risposta);


        getQuestion();

    }


    protected void getQuestion(){
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        rispostaJSON = response;

                        //risposta = response.toString();

                        Log.e("Rest response",response.toString());
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.e("Rest response",error.toString());
                    }
                }
        );


        queue.add(jsonObjectRequest);
    }


    protected void jsonParse(){

        try {
            rispostaJSON = rispostaJSON.getJSONArray("results").getJSONObject(0);

            question = rispostaJSON.getString("question");
            correct_answer = rispostaJSON.getString("correct_answer");
            incorrect_answers.add(rispostaJSON.getJSONArray("incorrect_answers").getString(0));
            incorrect_answers.add(rispostaJSON.getJSONArray("incorrect_answers").getString(1));
            incorrect_answers.add(rispostaJSON.getJSONArray("incorrect_answers").getString(2));

        } catch (JSONException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        responseView = findViewById(R.id.responseView);
        button =  findViewById(R.id.queryButton);
        queue = Volley.newRequestQueue(this);
        incorrect_answers = new ArrayList<>();


        url = "https://opentdb.com/api.php?amount=1&type=multiple";

        getQuestion();

    }

}
