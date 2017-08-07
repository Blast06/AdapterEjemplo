package com.example.juliod07.adapterejemplo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JulioD07 on 7/16/2017.
 */

public class Adaptador extends BaseAdapter {

    private Context context;
    List<Datos> ListaObjetos;

    public Adaptador(Context context, List<Datos> listaObjetos) {
        this.context = context;
        ListaObjetos = listaObjetos;
    }

    @Override
    public int getCount() {
        return ListaObjetos.size();
    }

    @Override
    public Object getItem(int position) {
        return ListaObjetos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ListaObjetos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(context);
        vista = inflate.inflate(R.layout.cardview_picture, null);

        ImageView imagen = (ImageView) vista.findViewById(R.id.img);
        TextView titulo = (TextView) vista.findViewById(R.id.txt_titulo);
        TextView detalle = (TextView) vista.findViewById(R.id.text_detalle);

        titulo.setText(ListaObjetos.get(position).getTitle());
        detalle.setText(ListaObjetos.get(position).getDetalle());
        imagen.setImageResource(ListaObjetos.get(position).getImage());

        return vista;
    }
}
