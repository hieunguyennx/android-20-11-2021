package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class listSongActivity extends AppCompatActivity {
    Button song1, song2, song3, song4, song5, song6, selectSong;
    TextView songTitle;
    int numOfSong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_song);

        song1 = findViewById(R.id.btnFirstSong);
        song2 = findViewById(R.id.btnSecondSong);
        song3 = findViewById(R.id.btnThirdSong);
        song4 = findViewById(R.id.btnFourthSong);
        song5 = findViewById(R.id.btnfifthSong);
        song6 = findViewById(R.id.btnfifthSong);
        selectSong = findViewById(R.id.btnSelectSong);
        songTitle = findViewById(R.id.songTitle);

        song1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numOfSong = 1;
            }
        });



        song2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numOfSong = 2;
            }
        });

        song3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numOfSong = 3;
            }
        });

        song4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numOfSong = 4;
            }
        });

        song5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numOfSong = 5;
            }
        });

        song6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numOfSong = 6;
            }
        });
        selectSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numOfSong != 0) {
                    Intent intent = new Intent(listSongActivity.this, MainActivity.class);
                    intent.putExtra("numOfSong", String.valueOf(numOfSong));
                    startActivity(intent);
                    System.out.println(numOfSong);
                } else {

                }
            }
        });
    }
}
