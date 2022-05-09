package com.afundacionfp.apprec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
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
                Context context = activity.getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text =" "+data.getNombre()+","+data.getTelefono()+","+data.getProducto()+","+data.getnumeroPalets();
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }

}