package com.example.rediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class SignActivity extends AppCompatActivity {

    TextView sign_text;
    ImageView googleSign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        sign_text = (TextView) findViewById(R.id.sign_text);
        sign_text.setClickable(true);
        sign_text.setMovementMethod(LinkMovementMethod.getInstance());
        sign_text.setTextColor(getColor(R.color.blue));
        sign_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });

        googleSign = (ImageView) findViewById(R.id.google_sign);
        googleSign.setClickable(true);
        googleSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent link = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(link);
            }
        });

    }
}