package com.example.charactergame;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.InputStreamReader;

import java.io.IOException;

import com.example.charactergame.PokeAssist.Poke;

import com.google.gson.Gson;

public class PokemonAsyncTask extends AsyncTask<String, Integer, Poke[]> {

    private Context context;

    public PokemonAsyncTask(Context context) { this.context = context; }

    @Override
    protected Poke[] doInBackground(String... params) {

        Poke pokeArray[] = new Poke[10];


        try {
            int count = 0;
            for (String i : params) {

                InputStreamReader inputStreamReader = utilities.getFromUrl(i);

                Gson gson = new Gson();
                Poke getPokemon = gson.fromJson(inputStreamReader, Poke.class);
                pokeArray[count] = getPokemon;
                count++;
            }

            return pokeArray;
        } catch (IOException e) {
            Toast.makeText(context, "Network Error.", Toast.LENGTH_LONG).show();
        }
        return null;
    }
}