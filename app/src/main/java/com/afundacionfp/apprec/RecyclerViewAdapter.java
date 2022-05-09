package com.afundacionfp.apprec;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder>{

    private Context context;
    private List<OrderDto> alltheData;
    private Activity activity;


    public RecyclerViewAdapter(List<OrderDto> dataSet, Activity activity){
        this.alltheData=dataSet;
        this.activity=activity;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_view_holder,parent,false);
        return new ViewHolder(view);
    }

    public void onBindViewHolder (ViewHolder holder, int position){
        OrderDto dataInPositionToBeRendered= alltheData.get(position);
        holder.bindData(dataInPositionToBeRendered,activity);

    }

    public int getItemCount(){
        return alltheData.size();
    }

}