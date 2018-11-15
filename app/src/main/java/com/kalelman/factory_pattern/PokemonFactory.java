package com.kalelman.factory_pattern;

public class PokemonFactory {

    public Pokemon getPokemon(String pokemonType) {

        if (pokemonType == "Pikachu") {
            return new Pikachu();
        } else if (pokemonType == "Psyduck") {
            return new Psyduck();
        } else if (pokemonType == "Charmander") {
            return new Charmander();
        }

        return null;
    }
}
