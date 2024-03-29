package com.example.project_recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Personaje> listaPersonajes;
    RecyclerView recyclerPersonaajes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaPersonajes = new ArrayList<>();
        recyclerPersonaajes = (RecyclerView) findViewById(R.id.recyclerViewPersonajes);
        recyclerPersonaajes.setLayoutManager(new LinearLayoutManager(this));

        llenarPersonajes();
        AdaptadorPersonajes adapter = new AdaptadorPersonajes(listaPersonajes);
        recyclerPersonaajes.setAdapter(adapter);
    }

    private void llenarPersonajes() {
        listaPersonajes.add(new Personaje("Krusty","Herschel Shmoikel Pinkus Yerocham Krustofsky, conocido como Krusty el payaso, es un personaje de la serie de dibujos animados Los Simpson.",R.drawable.krusti));
        listaPersonajes.add(new Personaje("Homero","Homer Jay Simpson es uno de los protagonistas de la serie. Es el padre de la familia protagonista y uno de los personajes centrales y más importantes de la serie.",R.drawable.homero));
        listaPersonajes.add(new Personaje("Marge","Marjorie \"Marge\" Bouvier Simpson una de los protagonistas de la serie. Es la esposa de Homer Simpson y madre de los tres hijos que ha tenido de esta unión amorosa: Bart, Lisa y Maggie. ",R.drawable.marge));
        listaPersonajes.add(new Personaje("Bart","Bartholomew JoJo «Bart» Simpson, es uno de los protagonistas de la serie. Bart tiene 10 años y es el primogénito, y único hijo varón de Homer y Marge Simpson. ",R.drawable.bart));
        listaPersonajes.add(new Personaje("Lisa","Lisa Marie Simpson es una de las protagonistas de la serie. Es la hija mediana de Homer y Marge Simpson, y hermana de Bart y Maggie. Goza de notable protagonismo y complejidad en la serie.",R.drawable.lisa));
        listaPersonajes.add(new Personaje("Magie","Margaret Evelyn \"Maggie\" Simpson es una de las protagonistas de la serie. Es la tercera hija del matrimonio protagonista, Homer y Marge Simpson, y la más joven de ellos.",R.drawable.magie));
        listaPersonajes.add(new Personaje("Flanders","Nedward «Ned» Flanders es un personaje ficticio de la serie de televisión de dibujos animados Los Simpson. La voz original en inglés es de Harry Shearer.",R.drawable.flanders));
        listaPersonajes.add(new Personaje("Milhouse","Milhouse Mussolini Van Houten es un personaje ficticio de la serie animada Los Simpson, creado por Matt Groening.",R.drawable.milhouse));
        listaPersonajes.add(new Personaje("Mr. Burns","Charles Montgomery Burns, más conocido como el señor Burns o Monty Burns, es un personaje ficticio recurrente de la serie de televisión de dibujos animados Los Simpson, creada por Matt Groening.",R.drawable.burns));
    }
}
