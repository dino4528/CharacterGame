package com.example.charactergame;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


import java.io.BufferedReader;



public class utilities {
    protected String Name;

    private String pokeUrl = "https://pokeapi.co/api/v2/pokmon/";
    private String baseUrl = "https://pokeapi.co/api/v2/pokemon/?limit=150";

    public utilities() {
    }

    public utilities(int pokeNum) {
        pokeUrl += pokeNum;
    }

    public JSONObject parseString(String p) throws JSONException {
        JSONObject pm = new JSONObject(p);
        return pm;
    }




    /**
     * Make a connection with the url and receive the response in input stream.
     * @param inputUrl destination url
     * @return data from the inputUrl
     * @throws IOException exception that can caused by bad networking
     */
    public static String getFromUrl(String inputUrl) throws IOException {
        StringBuffer sBuffer = new StringBuffer();
        try {
            URL pokemonUrl = new URL(inputUrl);
            HttpURLConnection connection = (HttpURLConnection) pokemonUrl.openConnection();

            connection.setRequestMethod("GET");
            connection.setRequestProperty("Content-Type", "application/json");

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine = in.readLine();

            while (inputLine != null)
            {
                sBuffer.append(inputLine);
            }

            return sBuffer.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}