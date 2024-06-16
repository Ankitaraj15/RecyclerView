package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContentAdapter extends RecyclerView.Adapter<RecyclerContentAdapter.ViewHolder> {

    Context context;
    ArrayList <DataModel> arrDatas;
    RecyclerContentAdapter(Context context, ArrayList<DataModel> arrDatas){
        this.context = context;
        this.arrDatas =arrDatas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.list_row,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgdata.setImageResource(arrDatas.get(position).img);
        holder.txtName.setText(arrDatas.get(position).name);
        holder.txtContent.setText(arrDatas.get(position).content);

    }

    @Override
    public int getItemCount() {
        return arrDatas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName, txtContent;
        ImageView imgdata;

        public ViewHolder(@NonNull View itemView){
            super(itemView);
            txtName= itemView.findViewById(R.id.txtName);
            txtContent = itemView.findViewById(R.id.txtContent);
            imgdata = itemView.findViewById(R.id.imgdata);
        }

    }

}
