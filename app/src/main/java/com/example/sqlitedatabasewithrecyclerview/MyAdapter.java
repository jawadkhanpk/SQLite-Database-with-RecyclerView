package com.example.sqlitedatabasewithrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.myViewHolder>{

    ArrayList<ModelClass> dataholder;

    public MyAdapter(ArrayList<ModelClass> dataholder) {
        this.dataholder = dataholder;
    }



    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new myViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {

        holder.dname.setText(dataholder.get(position).getName());
        holder.dcontact.setText(dataholder.get(position).getContact());
        holder.demail.setText(dataholder.get(position).getEmail());

    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{

        TextView dname, dcontact, demail;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            dname = (TextView)itemView.findViewById(R.id.rowName);
            dcontact = (TextView)itemView.findViewById(R.id.rowContact);
            demail = (TextView)itemView.findViewById(R.id.rowEmail);


        }
    }
}
