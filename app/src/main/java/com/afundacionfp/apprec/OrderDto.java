package com.afundacionfp.apprec;

import org.json.JSONException;
import org.json.JSONObject;

public class OrderDto {
    private String nombre;
    private int telefono;
    private String producto;
    private int numeroPalets;
    private int id;

    public OrderDto(JSONObject json) throws JSONException{
        this.nombre=json.getString("nombre");
        this.telefono=json.getInt("telefono");
        this.producto=json.getString("producto");
        this.numeroPalets=json.getInt("numeroPalets");
        this.id=json.getInt("id");
    }

    public String getNombre(){return nombre;}

    public int getTelefono(){return telefono;}

    public String getPedido(){return producto;}

    public int getnumeroPalets(){return numeroPalets;}

    public int getid(){return id;}

    @Override
    public String toString() {
        return "OrderDto{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", producto='" + producto + '\'' +
                ", numeroPalets=" + numeroPalets +
                ", id=" + id +
                '}';
    }
}
