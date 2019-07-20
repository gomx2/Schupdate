package com.example.sch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterSong extends RecyclerView.Adapter<AdapterSong.ViewAdapter> {


    Context mContext;
    private ArrayList<String> judulLagu;
    private CustomItemClickListener clickListener;


    public AdapterSong(Context mContext, ArrayList<String> judulLagu, CustomItemClickListener clickListener) {
        this.mContext = mContext;
        this.judulLagu = judulLagu;
        this.clickListener = clickListener;
    }




    @NonNull
    @Override
    public ViewAdapter onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.title_layout,viewGroup,false);
        final ViewAdapter viewHolder = new ViewAdapter(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            clickListener.onItemClick(v,viewHolder.getPosition());
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewAdapter viewAdapter, int i) {
        viewAdapter.titleSong.setText(judulLagu.get(i).replace("",""));
    }

    @Override
    public int getItemCount() {
        return judulLagu.size();
    }

    public class ViewAdapter extends RecyclerView.ViewHolder{


        TextView titleSong;

        public ViewAdapter(@NonNull View itemView) {
            super(itemView);

        titleSong = (TextView) itemView.findViewById(R.id.judul);
        }
    }

}
