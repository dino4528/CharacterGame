package com.example.charactergame.PokeAssist;

import android.os.Parcel;
import android.os.Parcelable;

import com.example.charactergame.PokemonAsyncTask;
import com.google.gson.annotations.SerializedName;

public abstract class Poke implements Parcelable {

    @SerializedName("name")
    private String name;

    private String type1;
    private String type2;

    public String getName() {
        return name;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        if (type2 == null) {
            return type1;
        }
        return type2;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
    }

    public Poke() {
    }

    protected Poke(Parcel in) {
        this.name = in.readString();
    }
}