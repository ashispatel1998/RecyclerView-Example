package com.example.recyclerview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;

import java.util.Arrays;
import java.util.List;

public class MovieDetailAdapter extends RecyclerView.Adapter<MovieDetailAdapter.MyViewHolder> {


    private  Context context;
    private  List<String> new_movies;

    public MovieDetailAdapter(List<String> new_movies,Context context){
        this.context=context;
        this.new_movies= new_movies;
    }

    @Override
    public MovieDetailAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

      LayoutInflater inflater=LayoutInflater.from(context);
      View view=inflater.inflate(R.layout.row_design_with_icon,parent,false);

      MyViewHolder myViewHolder=new MyViewHolder(view);

      return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.txtTitle.setText(new_movies.get(position));
    }


    @Override
    public int getItemCount() {
        // Gives the length of the String Array
        return new_movies.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView txtTitle;
        public ImageView imageView;
        public TextView txtDesc;
        public MyViewHolder(@NonNull View view) {
            super(view);
           txtTitle=view.findViewById(R.id.txt_title);
           txtDesc=view.findViewById(R.id.txt_desc);
           imageView=view.findViewById(R.id.img_view);
        }
    }
}
