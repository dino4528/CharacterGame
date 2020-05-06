package com.example.charactergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import java.util.Random;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.charactergame.utilities;

public class MainActivity extends AppCompatActivity {
    public Button button;

    Random number = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //make for loop 10 times
        int[] array = new int[10];
        String[] pokeList = new String[10];

        for(int i = 0; i < 10; i++) {
            array[i] = number.nextInt(150);
            utilities api = new utilities(array[i]);

        }

        //json file to what we want from url
        //execute


        button = (Button) findViewById(R.id.goToMain);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity2();
            }
        });
    }

    public void openActivity2() {
        Intent intent = new Intent(this, StartPoke.class);
        startActivity(intent);
    }
}