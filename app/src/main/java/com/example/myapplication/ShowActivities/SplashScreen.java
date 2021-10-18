package com.example.myapplication.ShowActivities;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import gr.net.maroulis.library.EasySplashScreen;


public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        EasySplashScreen configurations = new EasySplashScreen(SplashScreen.this);
        configurations.withFullScreen();
        configurations.withTargetActivity(Users.class);
        configurations.withSplashTimeOut(1000);
        configurations.withBackgroundColor(Color.parseColor("#ffffff"));
        configurations.withLogo(R.drawable.ic_speech_bubble_large);
        configurations.withAfterLogoText("Chat :)");

        configurations.getAfterLogoTextView().setTextColor(getResources().getColor(R.color.colorPrimary));
        configurations.getAfterLogoTextView().setTextSize(24);
        configurations.getLogo().setPadding(0, 0, 0, 10);
        View v = configurations.create();
        setContentView(v);
    }
}
