package com.example.charactergame.PokeAssist;

import com.google.gson.annotations.SerializedName;
import com.example.charactergame.Pokemon;

public class PokemonHolder {

    @SerializedName("pokemon")
    private Pokemon pokemon;

    public Pokemon getPokemon() {
        return pokemon;
    }
}