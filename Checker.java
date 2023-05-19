package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class Checker extends AppCompatActivity {
    TextView outputDialog;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checker);
        outputDialog = findViewById((R.id.outputDialog));

        String output = getIntent().getExtras().getString("output");
        outputDialog.setText(output);
    }
}