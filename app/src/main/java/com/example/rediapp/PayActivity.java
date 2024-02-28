package com.example.rediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.rediapp.ui.HomeFragment;
import com.example.rediapp.ui.TrackFragment;

public class PayActivity extends AppCompatActivity {

    Button trackButton, homeButton;
    TextView trackText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);

        trackButton = (Button) findViewById(R.id.track_button);
        homeButton = (Button) findViewById(R.id.home_button);
        trackText = (TextView) findViewById(R.id.track_text);

        trackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayActivity.this, TrackFragment.class);
                startActivity(intent);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayActivity.this, HomeFragment.class);
                startActivity(intent);
            }
        });

        trackText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PayActivity.this, TrackFragment.class);
                startActivity(intent);
            }
        });
    }
}