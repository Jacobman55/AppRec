package com.afundacionfp.apprec;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class Mirequest extends StringRequest {

    String nombre,telefono,pedido,numeroPedidos;

    String dato1,dato2,dato3,dato4;

    public Mirequest(int method, String url, Response.Listener<String> listener, @Nullable Response.ErrorListener errorListener,
                     String nombre, String telefono, String pedido, String numeroPedidos) {
        super(method, url, listener, errorListener);
        this.nombre=nombre;
        this.telefono=telefono;
        this.pedido=pedido;
        this.numeroPedidos=numeroPedidos;
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return super.getHeaders();
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        String cuerpoPeticion=String.format("nombre=%s&telefono=%s&producto=%s&numeroPalets=%s",nombre,telefono,pedido,numeroPedidos);
        byte[] b = cuerpoPeticion.getBytes();
        return b;
    }
}
//
