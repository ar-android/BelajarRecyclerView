package com.ocit.belajarrecyclerview;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ar-android on 02/12/2015.
 */
public class AdapterRV extends RecyclerView.Adapter<AdapterRV.ItemHolder>{

    List<ModelData> data;

    public AdapterRV(List<ModelData> data) {
        this.data = data;
    }

    @Override
    public AdapterRV.ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_reecycleview, parent, false);
        ItemHolder views = new ItemHolder(v);
        return views;
    }

    @Override
    public void onBindViewHolder(AdapterRV.ItemHolder holder, int position) {
//        holder.img.setImageBitmap();
        holder.name.setText(data.get(position).getName());
        holder.decs.setText(data.get(position).getDecs());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ItemHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView name;
        TextView decs;
        ImageView img;
        public ItemHolder(View itemView) {
            super(itemView);

            cv = (CardView)itemView.findViewById(R.id.cv);
            name = (TextView)itemView.findViewById(R.id.name);
            decs = (TextView)itemView.findViewById(R.id.decs);
            img = (ImageView)itemView.findViewById(R.id.img);
        }
    }
}