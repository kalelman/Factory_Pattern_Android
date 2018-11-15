package com.kalelman.factory_pattern;

public class Charmander implements Pokemon {

    @Override
    public String name() {
        return "Charmander";
    }

    @Override
    public String type() {
        return "Fire";
    }
}
