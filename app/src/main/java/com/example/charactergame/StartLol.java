package com.example.charactergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartLol extends AppCompatActivity {
    public Button start;
    public Button restart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_lol);

        start = (Button) findViewById(R.id.startButton);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openStart();
            }
        });

        restart = (Button) findViewById(R.id.restartButton);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRestart();
            }
        });
    }
    public void openStart() {
        Intent intent = new Intent(this, League.class);
        startActivity(intent);
    }

    public void openRestart() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
