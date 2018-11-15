package com.kalelman.factory_pattern;

public  class Fredy implements Movies {

    @Override
    public String name() {
        return "Fredy";
    }

    @Override
    public String genre() {
        return "Horror";
    }
}
