package com.example.quizgame;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ChooseCategory extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.choose_category);


    }

    public void onCategory9Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=9&type=multiple");
        startActivity(intent);

    }

    public void onCategory10Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=10&type=multiple");
        startActivity(intent);

    }

    public void onCategory11Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=11&type=multiple");
        startActivity(intent);

    }

    public void onCategory12Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=12&type=multiple");
        startActivity(intent);

    }

    public void onCategory13Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=13&type=multiple");
        startActivity(intent);

    }

    public void onCategory14Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=14&type=multiple");
        startActivity(intent);

    }

    public void onCategory15Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=15&type=multiple");
        startActivity(intent);

    }

    public void onCategory16Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=16&type=multiple");
        startActivity(intent);

    }

    public void onCategory17Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=17&type=multiple");
        startActivity(intent);

    }

    public void onCategory18Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=18&type=multiple");
        startActivity(intent);

    }

    public void onCategory19Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=19&type=multiple");
        startActivity(intent);

    }

    public void onCategory20Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=20&type=multiple");
        startActivity(intent);

    }

    public void onCategory21Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=21&type=multiple");
        startActivity(intent);

    }

    public void onCategory22Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=22&type=multiple");
        startActivity(intent);

    }

    public void onCategory23Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=23&type=multiple");
        startActivity(intent);

    }

    public void onCategory24Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=24&type=multiple");
        startActivity(intent);

    }

    public void onCategory25Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=25&type=multiple");
        startActivity(intent);

    }

    public void onCategory26Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=26&type=multiple");
        startActivity(intent);

    }

    public void onCategory27Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=27&type=multiple");
        startActivity(intent);

    }

    public void onCategory28Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=28&type=multiple");
        startActivity(intent);

    }

    public void onCategory29Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=29&type=multiple");
        startActivity(intent);

    }

    public void onCategory30Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=30&type=multiple");
        startActivity(intent);

    }

    public void onCategory31Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=31&type=multiple");
        startActivity(intent);

    }

    public void onCategory32Click(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&category=32&type=multiple");
        startActivity(intent);

    }

    public void onCategoryDefaultClick(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("category","https://opentdb.com/api.php?amount=10&type=multiple");
        startActivity(intent);
    }
}
