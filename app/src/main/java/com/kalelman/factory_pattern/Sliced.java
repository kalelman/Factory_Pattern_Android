package com.kalelman.factory_pattern;

public class Sliced implements Bread {

    @Override
    public String name() {
        return "Pan de Molde";
    }

    @Override
    public String calories() {
        return " : 80 Kcal";
    }
}
