package com.example.rediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetStarted extends AppCompatActivity {

    Button sign_btn;
    TextView sign_text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        sign_btn = findViewById(R.id.sign_btn);

        sign_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetStarted.this, SignActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sign_text = (TextView) findViewById(R.id.signtext_getstarted);
        sign_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GetStarted.this, SignActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}