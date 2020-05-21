package com.example.quizgame;

import android.content.Intent;
import android.graphics.Color;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONObject;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {



    TextView responseView ;
    TextView textView;

    RequestQueue queue;

    Button response1;
    Button response2;
    Button response3;
    Button response4;

    String url;

    String risposta;
    JSONObject rispostaJSON;

    String question;
    String correct_answer;
    ArrayList <String> incorrect_answers;
    Question q;


    public void onMainMenuButtonClick(View view){
        setContentView(R.layout.activity_main);

        responseView = findViewById(R.id.responseView);
        response1 = findViewById(R.id.response1);
        response2 = findViewById(R.id.response2);
        response3 = findViewById(R.id.response3);
        response4 = findViewById(R.id.response4);



        q.writeResponse(responseView,response1,response2,response3,response4);



        q.fetchRispostaJSON(queue,url);

    }

    public void buttonClickEvent(final Button b){
        q.incrementQuestionCount();
        if(b.getText() == q.getCorrect_answer()){
            b.setBackgroundColor(Color.GREEN);
            q.incrementCorrectAnswerCount();
        }
        else
            b.setBackgroundColor(Color.RED);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                b.setBackgroundColor(Color.LTGRAY);
                q.writeResponse(responseView,response1,response2,response3,response4);
                q.fetchRispostaJSON(queue,url);
            }
        }, 300);

        if(q.getQuestionCount() == 10){
            setContentView(R.layout.main_menu);
            textView = findViewById(R.id.textView);
            textView.setText("hai ottenuto " + q.getCorrectAnswerCount() + " punti");
            q.resetQuestionCount();
            q.resetCorrectAnswerCount();
        }


    }

    public void response1Click(View view) {
        buttonClickEvent(response1);
    }

    public void response2Click(View view) {
        buttonClickEvent(response2);
    }

    public void response3Click(View view) {
        buttonClickEvent(response3);
    }

    public void response4Click(View view) {
        buttonClickEvent(response4);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);


        queue = Volley.newRequestQueue(this);
        incorrect_answers = new ArrayList<String>();


        if(getIntent().getStringExtra("category") == null)
            url = "https://opentdb.com/api.php?amount=1&type=multiple";
        else
            url = getIntent().getStringExtra("category");


        rispostaJSON = new JSONObject();

        q = new Question();


        q.fetchRispostaJSON(queue,url);


    }


    public void onCategiorieButtonClick(View view) {
        Intent intent = new Intent(this,ChooseCategory.class);
        startActivity(intent);
    }
}