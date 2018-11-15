package com.kalelman.factory_pattern;

public class Montsecita implements Facebook {

    @Override
    public String profile() {
        return "Monch";
    }

    @Override
    public String location() {
        return "Tlanepantla";
    }
}
