package com.afundacionfp.apprec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class NewOrderActivity extends AppCompatActivity {

    private EditText edit1,edit2,edit3,edit4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);

        //asignación de los EditText
        edit1 =(EditText) findViewById(R.id.editTextTextPersonName);
        edit2 =(EditText) findViewById(R.id.editTextPhone);
        edit3 =(EditText) findViewById(R.id.editTextTextPersonName2);
        edit4 =(EditText) findViewById(R.id.editTextNumber);
    }
    public void onClickVolver (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onClickAcept(View view) throws UnsupportedEncodingException {
        Mirequest post = new Mirequest(Request.Method.POST, "https://625e5cdf873d6798e2a5dce7.mockapi.io/api/vf1/Pedido", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                System.out.print("Funciona");
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text ="Enviado";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.print("No funciona");
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text ="Fallo al enviarlo";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        RequestQueue cola = Volley.newRequestQueue(this);
        cola.add(post);
    }


}