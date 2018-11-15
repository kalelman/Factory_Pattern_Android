package com.kalelman.factory_pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txv_input)
    TextView txvInput;
    @BindView(R.id.txv_out_put_pokemon)
    TextView txvOutPutPokemon;
    @BindView(R.id.txv_movies)
    TextView txvOutPutMovies;
    @BindView(R.id.txv_facebook_profiles)
    TextView txvFacebookProfiles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        BreadFactory breadFactory = new BreadFactory();
        Bread bread = breadFactory.getBread("BAG");

        PokemonFactory pokemonFactory = new PokemonFactory();
        Pokemon pokemon = pokemonFactory.getPokemon("Pikachu");

        MoviesFactory moviesFactory = new MoviesFactory();
        Movies movies = moviesFactory.getMovies("Interestellar");

        FacebookFactory facebookFactory = new FacebookFactory();
        Facebook facebook = facebookFactory.getFacebookProfiles("Erick");

        txvInput.setText(new StringBuilder()
                .append(bread.name())
                .append("\n")
                .append(breadFactory.getBread("ROLL").name())
                .append("\n")
                .append(breadFactory.getBread("SLICED").name())
                .toString());

        txvOutPutPokemon.setText(new StringBuilder()
                .append(pokemon.name())
                .append("\n")
                .append(pokemon.type())
                .append("\n")
                .append(pokemonFactory.getPokemon("Psyduck").name())
                .append("\n")
                .append(pokemon.type())
                .append("\n")
                .append(pokemonFactory.getPokemon("Charmander").name())
                .append("\n")
                .append(pokemon.type())
                .toString());

        txvOutPutMovies.setText(new StringBuilder()
                .append(movies.name())
                .append("\n")
                .append(movies.genre())
                .append("\n")
                .append(moviesFactory.getMovies("Fredy").name())
                .append("\n")
                .append(movies.genre())
                .append("\n")
                .append(moviesFactory.getMovies("Ted the bear").name())
                .append("\n")
                .append(movies.genre())
                .toString());

        txvFacebookProfiles.setText(new StringBuilder()
                .append(facebook.profile())
                .append("\n")
                .append(facebook.location())
                .append("\n")
                .append(facebookFactory.getFacebookProfiles("Monch").profile())
                .append("\n")
                .append(facebookFactory.getFacebookProfiles("Monch").location())
                .append("\n")
                .append(facebookFactory.getFacebookProfiles("Mimotes").profile())
                .append("\n")
                .append(facebookFactory.getFacebookProfiles("Mimotes").location())
                .toString());
    }
}
