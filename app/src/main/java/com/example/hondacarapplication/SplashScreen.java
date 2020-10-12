package com.example.hondacarapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    MediaPlayer carAudio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        carAudio = new MediaPlayer();
        carAudio = MediaPlayer.create(this, R.raw.carsoundeffect);
        carAudio.start();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                finish();
                carAudio.stop();
                startActivity(new Intent(SplashScreen.this, CarListActivity.class));
            }
        };
        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}