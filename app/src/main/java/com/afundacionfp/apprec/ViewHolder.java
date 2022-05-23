package com.afundacionfp.apprec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ViewHolder extends RecyclerView.ViewHolder {

    private final TextView textView;
    private final TextView textView2;
    private OrderDto orderDto;


    public ViewHolder(@NonNull View itemView){
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.nombre_empresa);
        textView2 = (TextView) itemView.findViewById(R.id.numero_palets);

    }

    public void bindData(OrderDto data, Activity activity){
        textView.setText(data.getNombre());
        textView2.setText(" "+data.getnumeroPalets());
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity, OrderDetailActivity.class);
                intent.putExtra("nombre",data.getNombre());
                intent.putExtra("telefono",data.getTelefono());
                intent.putExtra("producto",data.getProducto());
                intent.putExtra("numeroPalets",data.getnumeroPalets());
                activity.startActivity(intent);
            }
        });
    }
}