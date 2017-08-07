package com.example.juliod07.adapterejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {
    ImageView foto;
    TextView titulo;
    TextView detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        foto = (ImageView)findViewById(R.id.img_foto);
        titulo = (TextView)findViewById(R.id.txt_titulo2);
        detalle = (TextView)findViewById(R.id.txt_detalle2);

        Datos obj = (Datos)getIntent().getExtras().getSerializable("objeto");

        titulo.setText(obj.getTitle());
        detalle.setText(obj.getDetalle());
        foto.setImageResource(obj.getImage());
    }
}
