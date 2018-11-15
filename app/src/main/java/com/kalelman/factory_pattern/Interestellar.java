package com.kalelman.factory_pattern;

public class Interestellar implements Movies {

    @Override
    public String name() {
        return "Interestellar";
    }

    @Override
    public String genre() {
        return "Cience Fiction";
    }
}
