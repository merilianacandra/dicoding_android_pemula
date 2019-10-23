package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class IndoFoodAdapter extends RecyclerView.Adapter<IndoFoodAdapter.ListViewHolder> {

    private Context context;
    private ArrayList<IndoFood> listIndoFood;

    public IndoFoodAdapter(Context context){
        this.context = context;
    }

    private ArrayList<IndoFood> getListIndofood(){
        return listIndoFood;
    }

    void setListIndoFood(ArrayList<IndoFood> listIndofood){
        this.listIndoFood = listIndofood;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_row_indofood, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IndoFoodAdapter.ListViewHolder holder, final int position) {

        Glide.with(holder.itemView.getContext())
                .load(getListIndofood().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgGambar);
        holder.aName.setText(getListIndofood().get(position).getName());
        holder.aDetail.setText(getListIndofood().get(position).getDetail());

        holder.imgGambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailListActivity.class);
                i.putExtra("name", getListIndofood().get(position).getName());
                i.putExtra("deskrip", getListIndofood().get(position).getDetail());
                i.putExtra("gambar", getListIndofood().get(position).getPhoto());
                context.startActivity(i);
            }
        });

        holder.list_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, DetailListActivity.class);
                i.putExtra("name", getListIndofood().get(position).getName());
                i.putExtra("deskrip", getListIndofood().get(position).getDetail());
                i.putExtra("gambar", getListIndofood().get(position).getPhoto());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {

        return listIndoFood.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambar;
        TextView aName, aDetail;
        LinearLayout list_detail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGambar = itemView.findViewById(R.id.img_item_photo);
            aName = itemView.findViewById(R.id.nama_makanan);
            aDetail = itemView.findViewById(R.id.detail_makanan);
            list_detail = itemView.findViewById(R.id.list_linier);
        }
    }
}
