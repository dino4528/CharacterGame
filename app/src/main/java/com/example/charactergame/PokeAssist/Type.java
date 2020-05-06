package com.example.charactergame.PokeAssist;

import android.os.Parcelable;

import com.example.charactergame.utilities;
import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import java.io.IOException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

public abstract class Type extends utilities {
    public Type(int ID) throws IOException, JSONException {
        String data = "";
        data = getFromUrl("type/" + ID);

        JSONObject root = parseString(data);
        try {
            //Define properties
            Name = root.getString("name");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
