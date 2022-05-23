package com.afundacionfp.apprec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class OrderDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_detail);
        Bundle bundle = getIntent().getExtras();
        rellenarDatos(bundle);
    }

    protected void rellenarDatos (Bundle bundle){
        TextView nombre = findViewById(R.id.empresanombre);
        nombre.setText(bundle.get("nombre").toString());
        TextView telefono = findViewById(R.id.empresatelefono);
        telefono.setText(bundle.get("telefono").toString());
        TextView producto = findViewById(R.id.empresaproducto);
        producto.setText(bundle.get("producto").toString());
        TextView numeroPalets = findViewById(R.id.empresacantidad);
        numeroPalets.setText(bundle.get("numeroPalets").toString());
    }
}