package com.example.charactergame;

import android.content.Context;
import android.net.NetworkRequest;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import java.io.IOException;

import com.example.charactergame.utilities;
import com.example.charactergame.PokeAssist.PokemonHolder;

import com.google.gson.Gson;

public class PokemonAsyncTask extends AsyncTask<Integer, Integer, List<String>> {

    private Context context;

    public PokemonAsyncTask(Context context) { this.context = context; }

    @Override
    protected List<String> doInBackground(Integer... params) {

        List<PokemonHolder> pokemon = new ArrayList<>();

        try {


        } catch (IOException e) {
            Toast.makeText(context, "Network Error.", Toast.LENGTH_LONG).show();
        }
        return null;
    }
}