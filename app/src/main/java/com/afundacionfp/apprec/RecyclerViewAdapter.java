package com.afundacionfp.apprec;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.nio.file.attribute.FileTime;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder>{

    private Context context;
    private List<OrderDto> alltheData;
    private Activity activity;

    private final View.OnClickListener OnClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int itemPosition = RecyclerView.getChildLayoutPosition(view);
            String item = List.get(itemPosition);
            Toast.makeText(context, item, Toast.LENGTH_SHORT).show();
        }
    };

    public RecyclerViewAdapter(List<OrderDto> dataSet, Activity activity){
        this.alltheData=dataSet;
        this.activity=activity;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_holder,parent,false);
        view.setOnClickListener(OnClickListener);
        return new ViewHolder(view);
    }

    public void onBindViewHolder (ViewHolder holder, int position){
        OrderDto dataInPositionToBeRendered= alltheData.get(position);
        holder.showData(dataInPositionToBeRendered, activity);

    }
    public int getItemCount(){
        return alltheData.size();
    }

}