package com.kalelman.factory_pattern;

public class Noemi implements Facebook {

    @Override
    public String profile() {
        return "Mimotes";
    }

    @Override
    public String location() {
        return "CDMX";
    }
}
