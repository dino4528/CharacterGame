package com.example.charactergame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Pokemon extends AppCompatActivity {
    public String characterName;
    public EditText nameInput;
    public Button submitButton;
    public TextView msg;

    public static int count = 0;
    public Button restartButton;

    public static Random number = new Random();
    /**
     * URL
     */
    private static final String JSON_URL = "https://pokeapi.co/api/v2/pokmon/";

    @SerializedName("name")
    private String name;

    public Pokemon() {
    }

    // Getter
    public String getName() {
        return name;
    }


    /**
     * set json array
     * @param j json url
     * @throws JSONException
     */
    public static JSONArray setJson(String j) throws JSONException{
        JSONObject obj = new JSONObject(j);
        JSONArray jar = obj.getJSONArray("pokemon");
        return jar;
    }

    /**
     * get pokemon of index given
     * @param index index of pokemon from json file
     * @return name of pokemon of index given
     * @throws JSONException
     */
    public static String indexPokemon(int index) throws JSONException {
        JSONArray jar = setJson(JSON_URL);
        return (String) jar.getJSONObject(index).get("name");
    }

    public static void main(String[] args) throws JSONException {
        setJson(JSON_URL);
        JSONArray jar = setJson(JSON_URL);
        int index = number.nextInt(jar.length());


    }

    public static String getType(String url, int index) throws JSONException {
        JSONArray jar = new JSONArray();
        jar.put(setJson(url).getJSONObject(index).get("types"));
        return null;
    }

    public static String getUrl(int index) throws  JSONException {
        JSONArray jar = setJson(JSON_URL);
        return (String) jar.getJSONObject(index).get("url");
    }


    /**------------------------------------------------------------------------------------*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pokemon);

        msg = (TextView) findViewById(R.id.changeText);
        try {
            msg.setText(indexPokemon(0));
        } catch (JSONException e) {
            msg.setText("This is wrong");
        }

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
                count++;
                characterName = nameInput.getText().toString();

            }
        });
    }

    public void openRestart() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}