package com.example.retrofitapi;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<ModelClass>data;

    public RecyclerAdapter(List<ModelClass> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item,parent,false);
        return  new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.userId.setText(""+data.get(position).getUserId());
        holder.id.setText(""+data.get(position).getId());
        holder.title.setText(""+data.get(position).getTitle());
        holder.desc.setText(""+data.get(position).getSubtitle());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView userId,id,title,desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            userId = itemView.findViewById(R.id.useridText);
            id = itemView.findViewById(R.id.idText);
            title = itemView.findViewById(R.id.titleText);
            desc = itemView.findViewById(R.id.descriptionText);

        }
    }

}
