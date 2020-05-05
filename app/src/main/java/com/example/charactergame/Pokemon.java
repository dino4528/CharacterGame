package com.example.charactergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.Random;

import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Pokemon extends AppCompatActivity {
    public String characterName;
    public EditText nameInput;
    public Button submitButton;

    public Button restartButton;

    List<Pokemon> pokeList;

    public Random number = new Random();

    JSONParser jsonParser = new JSONParser();
    private static final String JSON_URL = "https://pokeapi.co/api/v2/pokmon/";

    List<NameValuePair> param = new ArrayList<NameValuePair>();
    JSONObject json = jParser.makeHttpRequest(JSON_URL, "GET", param);

    JSONObject songs = json.getJSONObject("songs");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        pokeList = new ArrayList<>();

        restartButton = (Button) findViewById(R.id.restart);
        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRestart();
            }
        });

        nameInput = (EditText) findViewById(R.id.nameInput);
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                characterName = nameInput.getText().toString();
            }
        });
    }

    public void openRestart() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
