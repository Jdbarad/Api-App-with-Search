package com.builditcreative.androidapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.builditcreative.androidapp.api.model.AgendaList;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    Context context;
    private List<AgendaList> list;

    public RecyclerAdapter(Context context, List<AgendaList> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.layout_recyler,parent,false);
        return new RecyclerAdapter.MyViewHolder(v);
    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.timeText.setText(list.get(position).getStartTime()+"-"+list.get(position).getEndTime());
        holder.titleText.setText(list.get(position).getHeading());
    }


    @Override
    public int getItemCount()   {
        return list.size();
    }

    public void filterList(ArrayList<AgendaList> filterlist) {
        list = filterlist;
        notifyDataSetChanged();
    }

    public class MyViewHolder extends  RecyclerView.ViewHolder{
        TextView timeText;
        TextView titleText;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            timeText = itemView.findViewById(R.id.time_text);
            titleText = itemView.findViewById(R.id.title_text);
        }
    }
}

