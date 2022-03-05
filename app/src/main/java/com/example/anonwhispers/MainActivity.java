package com.example.anonwhispers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void goLogin(View view){
        Intent intent = new Intent(this, loginActivity.class);
        startActivity(intent);
    }

    public void goRegister(View view){
        Intent intent = new Intent(this, registroActivity.class);
        startActivity(intent);
    }
}