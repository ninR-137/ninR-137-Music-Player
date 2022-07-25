package com.rdioneo.personalmusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


//SIMPLE PROTOTYPE
public class MainActivity extends AppCompatActivity {

    MediaPlayer music;
    Button playButton, pauseButton, stopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        music = MediaPlayer.create(this, R.raw.live_another_day);
        initOnclick();
    }

    public void initOnclick(){
        playButton = findViewById(R.id.start);
        pauseButton = findViewById(R.id.pause);
        stopButton = findViewById(R.id.stop);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.start();
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                music.pause();
            }
        });

        stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                musicstop();
            }
        });
    }

    // Stoping the music
    public void musicstop()
    {
        music.stop();
        music = MediaPlayer.create(this, R.raw.live_another_day);
    }

}