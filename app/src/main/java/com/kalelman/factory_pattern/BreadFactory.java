package com.kalelman.factory_pattern;

public class BreadFactory {

    public Bread getBread(String breadType) {

        if (breadType == "BAG") {
            return new Baguette();
        } else if (breadType == "ROLL") {
            return  new Roll();
        } else if (breadType == "SLICED") {
            return new Sliced();

        }

        return null;
    }
}
