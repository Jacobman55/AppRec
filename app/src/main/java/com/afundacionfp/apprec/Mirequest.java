package com.afundacionfp.apprec;

import androidx.annotation.Nullable;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;

public class Mirequest extends StringRequest {
    public Mirequest(int method, String url, Response.Listener<String> listener, @Nullable Response.ErrorListener errorListener) {
        super(method, url, listener, errorListener);
    }

    @Override
    public Map<String, String> getHeaders() throws AuthFailureError {
        return super.getHeaders();
    }

    @Override
    public byte[] getBody() throws AuthFailureError {
        String cuerpoPeticion="nombre=a&Telefono=6&producto=p&numeroPalets=2";
        byte[] b = cuerpoPeticion.getBytes();
        return b;
    }
}
