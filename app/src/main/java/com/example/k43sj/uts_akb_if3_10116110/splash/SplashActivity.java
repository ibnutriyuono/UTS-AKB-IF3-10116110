package com.example.k43sj.uts_akb_if3_10116110.splash;
/*
 * 16 Mei 2019
 * 10116110
 * Muhamad Ibnu Tri Yuono
 * IF-3
*/
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.k43sj.uts_akb_if3_10116110.MainActivity;
import com.example.k43sj.uts_akb_if3_10116110.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashActivity.this,MainActivity.class));
                finish();
            }
        },3000);
    }
}
