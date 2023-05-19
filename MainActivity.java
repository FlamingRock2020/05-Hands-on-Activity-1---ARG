package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText text1, text2;
    private Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.txtField1);
        text2 = (EditText) findViewById(R.id.txtField2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                swapText();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkText();
            }
        });


    }

    public void swapText() {
        String inputTxt1 = text1.getText().toString();
        String inputTxt2 = text2.getText().toString();
        text1.setText(inputTxt2);
        text2.setText(inputTxt1);
    }
    private void checkText() {
        String output = "";
        String inputTxt1 = text1.getText().toString();
        String inputTxt2 = text2.getText().toString();

        if (inputTxt1.equals(inputTxt2)){
            output = "SAME";
        }

        else {
            output = "NOT THE SAME";
        }

        Intent i = new Intent(this,Checker.class);
        i.putExtra("output", output);
        startActivity(i);
    }


}