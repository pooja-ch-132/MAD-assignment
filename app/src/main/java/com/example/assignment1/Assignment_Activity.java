package com.example.assignment1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Assignment_Activity extends AppCompatActivity {
    Button Assignment1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_assignment1);
        Assignment1=findViewById(R.id.assignment1Btn);

        Assignment1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent switchActivityAssignment1= new Intent(Assignment_Activity.this,Assignment_Activity.class);
                startActivity(switchActivityAssignment1);
            }
        });

    }
}