package com.example.welcomeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {
    LuncherManager luncherManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //CLEAR THE WINDOW STATUS BAR
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        luncherManager = new LuncherManager(this);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(luncherManager.isFirstTime()){
                    luncherManager.setIsFirstLunch(false);
                    startActivity(new Intent(getApplicationContext(),Slider.class));
                    finish();
                }
                else {
                    startActivity(new Intent(getApplicationContext(),MainActivity.class));
                    finish();
                }
            }
        },2000);
    }
}