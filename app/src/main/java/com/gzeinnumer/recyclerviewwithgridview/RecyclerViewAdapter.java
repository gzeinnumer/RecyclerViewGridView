package com.gzeinnumer.recyclerviewwithgridview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

//3
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyHolder>{

    private Context context;
    private int images[];
    private String name[];

    public RecyclerViewAdapter(Context context, int[] images, String[] name) {
        this.context = context;
        this.images = images;
        this.name = name;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_layout,null);
        MyHolder myHolder = new MyHolder(layout);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int positon) {

        myHolder.indexImage.setImageResource(images[positon]);
        myHolder.indexName.setText(name[positon]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }


    public class MyHolder extends RecyclerView.ViewHolder{
        ImageView indexImage;
        TextView indexName;
        public MyHolder(@NonNull View itemView) {
            super(itemView);
            indexImage = itemView.findViewById(R.id.images);
            indexName = itemView.findViewById(R.id.txtName);

        }
    }
}
