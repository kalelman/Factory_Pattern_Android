package com.kalelman.factory_pattern;

public class Pikachu implements Pokemon {

    @Override
    public String name() {
        return "Pikachu";
    }

    @Override
    public String type() {
        return "Electric";
    }
}
