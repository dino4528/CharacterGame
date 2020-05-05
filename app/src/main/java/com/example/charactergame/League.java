package com.example.charactergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class League extends AppCompatActivity {
    public Button restartButton;

    public String input;
    public String characterName;
    public EditText nameInput;
    public Button submit;

    public TextView msg;

    Random number = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);
        msg = (TextView) findViewById(R.id.changeText);
        int randomNumber = number.nextInt(147) + 1;
        msg.setText("");

        restartButton = (Button) findViewById(R.id.restart);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRestart();
            }
        });

        nameInput = (EditText) findViewById(R.id.nameInput);
        submit = (Button) findViewById(R.id.submitButton);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input = nameInput.getText().toString();
                characterName = input.toLowerCase();
            }
        });
    }

    public void openRestart() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
