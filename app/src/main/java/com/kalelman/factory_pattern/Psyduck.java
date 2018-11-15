package com.kalelman.factory_pattern;

public class Psyduck implements Pokemon {

    @Override
    public String name() {
        return "Psyduck";
    }

    @Override
    public String type() {
        return "Water";
    }
}
