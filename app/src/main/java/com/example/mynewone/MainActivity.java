package com.example.mynewone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText etName,etQuestion;
    Button add;

     FirebaseDatabase rootNode;
     DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        etQuestion=findViewById(R.id.editTextTextPersonName);
        etName=findViewById(R.id.editTextTextPersonName4);
        add=findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                 reference=rootNode.getReference("Questions");
                String name=etName.getText().toString();
                String  question =etQuestion.getText().toString();

                Question questionClass = new Question(name,question);
                reference.child(name).setValue(questionClass);
           }
        });
    }
}