package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NumberRecyclerViewAdapter extends RecyclerView.Adapter<NumberRecyclerViewAdapter.ViewHolder> {
    Context context;

    public NumberRecyclerViewAdapter() {
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            this.textView = itemView.findViewById(R.id.text1);
        }
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_card_view_layout, null);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String numberStr = position + 1 + "";
        holder.textView.setText(numberStr);
        if (numberStr.contains("3")){
            holder.textView.setTextColor(Color.RED);
            holder.textView.setTextSize(30);
        }
        else{
            holder.textView.setTextColor(Color.BLUE);
            holder.textView.setTextSize(20);
        }
    }

    @Override
    public int getItemCount() {
        return 10000;
    }

    
}
