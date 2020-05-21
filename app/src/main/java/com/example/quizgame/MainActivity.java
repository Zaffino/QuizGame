package com.example.quizgame;

import android.content.Intent;


import android.os.Bundle;

import android.view.View;


import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {



    TextView textView;

    RequestQueue queue;
    String url;

    Question q;


    public void onMainMenuButtonClick(View view) {
        Intent intent = new Intent(this,QuizSession.class);
        intent.putExtra("questions",q.getRispostaJSON().toString());

        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        textView = findViewById(R.id.textView);


        queue = Volley.newRequestQueue(this);


        if(getIntent().getStringExtra("category") == null)
            url = "https://opentdb.com/api.php?amount=10&type=multiple";
        else
            url = getIntent().getStringExtra("category");

        if(getIntent().getStringExtra("sessionResult") != null)
            textView.setText(getIntent().getStringExtra("sessionResult"));


        q = new Question();
        q.fetchRispostaJSON(queue,url);


    }


    public void onCategiorieButtonClick(View view) {
        Intent intent = new Intent(this,ChooseCategory.class);
        startActivity(intent);
    }
}