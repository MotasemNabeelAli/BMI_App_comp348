package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Number tfHeight;
    private Number tfWeight;
    private Button btnCalculate;
    private TextView textResult;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO: complete this code please
        tfHeight = R.id.tfHeight;
        tfWeight = R.id.tfWeight;
        btnCalculate = findViewById(R.id.btnShow);
        textResult = findViewById(R.id.textResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float height = tfHeight.floatValue();
                float weight = tfWeight.floatValue();
                float result = weight / (height * height);
                textResult.setText(String.valueOf(result));
            }
        });


    }
}