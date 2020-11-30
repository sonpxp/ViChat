package com.sonmob.vichat.view.auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sonmob.vichat.R;
import com.sonmob.vichat.view.MainActivity;
import com.sonmob.vichat.view.startup.SplashSceenActivity;
import com.sonmob.vichat.view.startup.WelcomeScreenActivity;

public class PhoneLoginActivity extends AppCompatActivity {

    private Button btnNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_login);

        btnNext = findViewById(R.id.btn_next);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PhoneLoginActivity.this, MainActivity.class));
            }
        });
    }
}