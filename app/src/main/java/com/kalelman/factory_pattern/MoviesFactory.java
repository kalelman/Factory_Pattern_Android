package com.kalelman.factory_pattern;

public class MoviesFactory {

    public Movies getMovies(String moviesType) {

        if (moviesType == "Interestellar") {
            return new Interestellar();
        } else if (moviesType == "Fredy") {
            return new Fredy();
        } else if (moviesType == "Ted the bear") {
            return new Ted();
        }
        return null;
    }
}
