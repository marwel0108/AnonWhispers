package com.example.anonwhispers;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class registroActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_registro);
    }
}
