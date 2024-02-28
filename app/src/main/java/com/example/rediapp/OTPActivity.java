package com.example.rediapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OTPActivity extends AppCompatActivity {

    TextView count;
    Button otpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpactivity);

        count = (TextView) findViewById(R.id.count);
        otpBtn = (Button) findViewById(R.id.button_send_otp);

        new CountDownTimer(60000, 1000){

            @Override
            public void onTick(long l) {
                count.setText(""+(l/1000));
            }

            @Override
            public void onFinish() {
                count.setText("resent");
                count.setTextColor(getColor(R.color.blue));
                count.setClickable(true);

            }
        }.start();

        otpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OTPActivity.this, NewPasswordActivity.class);
                startActivity(intent);
            }
        });
    }
}