package com.afundacionfp.apprec;

import org.json.JSONException;
import org.json.JSONObject;

public class OrderDto {
    private String nombre;
    private int telefono;
    private String pedido;
    private int nPalets;

    public OrderDto(JSONObject json) throws JSONException{
        this.nombre=json.getString("nombre");
        this.telefono=json.getInt("telefono");
        this.pedido=json.getString("pedido");
        this.nPalets=json.getInt("numeroPalets");
    }

    public String getNombre(){return nombre;}

    public int getTelefono(){return telefono;}

    public String getPedido(){return pedido;}

    public int getnPalets(){return nPalets;}
}
