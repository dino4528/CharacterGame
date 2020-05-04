package com.example.charactergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    public Button buttonOne;
    public Button buttonTwo;
    public Button restartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonOne = (Button) findViewById(R.id.goToLeague);
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLeague();
            }
        });

        buttonTwo = (Button) findViewById(R.id.goToPokemon);
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPokemon();
            }
        });

        restartButton = (Button) findViewById(R.id.restart);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRestart();
            }
        });
    }
    public void openLeague() {
        Intent intent = new Intent(this, League.class);
        startActivity(intent);
    }
    public void openPokemon() {
        Intent intent = new Intent(this, Pokemon.class);
        startActivity(intent);
    }
    public void openRestart() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
