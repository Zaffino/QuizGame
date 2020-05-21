package com.example.quizgame;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


import org.json.JSONException;


public class QuizSession extends AppCompatActivity {

    Button response1;
    Button response2;
    Button response3;
    Button response4;
    TextView responseView ;

    Question q;

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
                if(q.getQuestionCount() != 10)
                    q.writeResponse(responseView,response1,response2,response3,response4);
            }
        }, 300);

        if(q.getQuestionCount() == 10){
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("sessionResult","hai ottenuto " + q.getCorrectAnswerCount() + " punti");
            startActivity(intent);

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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        responseView = findViewById(R.id.responseView);
        response1 = findViewById(R.id.response1);
        response2 = findViewById(R.id.response2);
        response3 = findViewById(R.id.response3);
        response4 = findViewById(R.id.response4);





        try {
            q = new Question(getIntent().getStringExtra("questions"));
        } catch (JSONException e) {
            e.printStackTrace();
        }



        q.resetQuestionCount();
        q.resetCorrectAnswerCount();

        q.writeResponse(responseView,response1,response2,response3,response4);

    }



}
