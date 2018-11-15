package com.kalelman.factory_pattern;

public class Erick implements Facebook {

    @Override
    public String profile() {
        return "Erick";
    }

    @Override
    public String location() {
        return "Michigan";
    }
}
