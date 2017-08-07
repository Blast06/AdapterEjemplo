package com.example.juliod07.adapterejemplo;

import java.io.Serializable;

/**
 * Created by JulioD07 on 7/16/2017.
 */

public class Datos implements Serializable {
    private int id;
    private String title;
    private String detalle;
    private int image;

    public Datos(int id, String title, String detalle, int image) {
        this.id = id;
        this.title = title;
        this.detalle = detalle;
        this.image = image;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
