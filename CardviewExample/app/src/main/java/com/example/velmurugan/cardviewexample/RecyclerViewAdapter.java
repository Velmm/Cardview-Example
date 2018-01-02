package com.example.velmurugan.cardviewexample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private List<Movie> movieList;

    RecyclerViewAdapter(List<Movie> movieList){
        this.movieList = movieList;
    }

    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_adapter_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.title.setText(movieList.get(position).getTitle());
        holder.image.setBackgroundResource(movieList.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.title);
            image = (ImageView)itemView.findViewById(R.id.image);
        }
    }
}
