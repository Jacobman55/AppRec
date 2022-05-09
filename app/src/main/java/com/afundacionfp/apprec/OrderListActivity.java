package com.afundacionfp.apprec;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class OrderListActivity extends AppCompatActivity {

    private JSONObject alltheData;
    private RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        recyclerview = (RecyclerView) findViewById(R.id.lista);
        Activity activity = this;
        JsonArrayRequest request = new JsonArrayRequest(
                Request.Method.GET,
                "https://625e5cdf873d6798e2a5dce7.mockapi.io/api/vf1/Pedido",
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        List<OrderDto> alltheData = new ArrayList<>();
                        for (int i = 0; i < response.length(); i++) {
                            try {
                                JSONObject pedido = response.getJSONObject(i);
                                OrderDto data = new OrderDto(pedido);
                                alltheData.add(data);
                                System.out.println(alltheData.get(i));
                            } catch (JSONException e) {
                                e.printStackTrace();
                            };
                        }
                        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(alltheData, activity);
                        recyclerview.setAdapter(recyclerViewAdapter);
                        recyclerview.setLayoutManager(new LinearLayoutManager(activity));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Context context = getApplicationContext();
                        int duration = Toast.LENGTH_SHORT;
                        CharSequence text ="Fallo";
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                }

        );

        RequestQueue cola = Volley.newRequestQueue(this);
        cola.add(request);
    }
}