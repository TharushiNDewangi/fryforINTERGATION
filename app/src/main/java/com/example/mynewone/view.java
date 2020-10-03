package com.example.mynewone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class view extends AppCompatActivity {
    EditText viewName,viewQuestion,viewAnswer1,viewAnswer2;
    Button show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        viewName=findViewById(R.id.editTextTextPersonName2);
        viewQuestion=findViewById(R.id.editTextTextPersonName3);
        viewAnswer1=findViewById(R.id.editTextTextPersonName5);
        viewAnswer2=findViewById(R.id.editTextTextPersonName6);
        show=findViewById(R.id.button2);
    }
}