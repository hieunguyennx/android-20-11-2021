package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button select = (Button) findViewById(R.id.btnSelect);
        Button play = (Button) findViewById(R.id.btnPlay);
        Button pause = (Button) findViewById(R.id.btnPause);
        select.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, listSongActivity.class));
            }
        }));

        String value = "10";
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            value = bundle.getString("numOfSong");
        }

        switch (Integer.parseInt(value)) {
            case 1: {
                music = MediaPlayer.create(this, R.raw.song1);
                break;
            }
            case 2: {
                music = MediaPlayer.create(this, R.raw.song2);
                break;

            }
            case 3: {
                music = MediaPlayer.create(this, R.raw.song3);
                break;

            }
            case 4: {
                music = MediaPlayer.create(this, R.raw.song4);
                break;

            }
            case 5: {
                music = MediaPlayer.create(this, R.raw.song5);
                break;

            }
            case 6: {
                music = MediaPlayer.create(this, R.raw.song6);
                break;
            }
            default: break;
        }

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               music.start();
            }
        });

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                music.pause();
            }
        });


    }
}