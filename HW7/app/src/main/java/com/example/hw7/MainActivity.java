package com.example.hw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon> mypokemons = new ArrayList<>();
        Pokemon p1 = new Pokemon("Squirtle",R.drawable.squirtle,48,65,314);
        Pokemon p2 = new Pokemon("Squirtl",R.drawable.squirtle,47,64,313);
        Pokemon p3 = new Pokemon("Squirt",R.drawable.squirtle,46,63,312);

        mypokemons.add(p1);
        mypokemons.add(p2);
        mypokemons.add(p3);

        RecyclerView rv = findViewById(R.id.RecyclerView);

        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);

        PokemonAdapter adapter = new PokemonAdapter(mypokemons);
        rv.setAdapter(adapter);
    }
}