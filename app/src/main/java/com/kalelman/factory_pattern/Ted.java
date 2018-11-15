package com.kalelman.factory_pattern;

public class Ted implements Movies {

    @Override
    public String name() {
        return "Ted the bear";
    }

    @Override
    public String genre() {
        return "Funny";
    }
}
