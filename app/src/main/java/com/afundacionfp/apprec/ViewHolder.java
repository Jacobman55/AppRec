package com.afundacionfp.apprec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private final TextView textView;
    private final TextView textView2;

    public ViewHolder(@NonNull View iteView){
        super(iteView);
        textView = (TextView) itemView.findViewById(R.id.nombre_empresa);
        textView2 = (TextView) itemView.findViewById(R.id.numero_palets);

    }

    public void showData(OrderDto data, Activity activity){
        textView.setText(data.getNombre());
        textView2.setText(data.getnumeroPalets());
    }
}