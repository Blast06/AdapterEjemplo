package com.example.juliod07.adapterejemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<Datos> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = (ListView) findViewById(R.id.list_datos);

        lista = new ArrayList<Datos>();

        lista.add( new Datos(1,"Friendly Battle","Batalla amigable",R.drawable.friendly_battle));
        lista.add( new Datos(2,"Icono de batalla","Es el icono que te informa de las batallas en gral",R.drawable.battle_icon));
        lista.add( new Datos(3,"Cards icon","Son tus barajas, conservalas!",R.drawable.cards_icon));
        lista.add( new Datos(4,"Crown Tower","Las torres de corona son aquellas que hay que derribar",R.drawable.crown_tower_allied));
        lista.add( new Datos(5,"Golden Chest","Cofre de oro, estos duran 8 horas para abrir",R.drawable.golden_chest_icon));
        lista.add( new Datos(6,"Legendary Cards","Son cartas que rara vez aparecen, APROVECHALAS",R.drawable.legendary_card));
        lista.add( new Datos(7,"Legendary Trophy","Legendary Trophy: El nombre lo dice todo",R.drawable.legendary_trophy));



        Adaptador miAdapter = new Adaptador(getApplicationContext(),lista);

        listaDatos.setAdapter(miAdapter);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos obj = (Datos) parent.getItemAtPosition(position);

                Intent paso = new Intent(getApplicationContext(),DetalleActivity.class);
                paso.putExtra("objeto", (Serializable) obj);
                startActivity(paso);
            }
        });


    }
}
