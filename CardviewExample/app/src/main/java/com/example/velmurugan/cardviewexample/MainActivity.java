package com.example.velmurugan.cardviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private List<Movie> movieList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList = new ArrayList<>();
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerViewAdapter = new RecyclerViewAdapter(movieList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);
        prepareMovie();
    }


    private void prepareMovie(){
        Movie movie = new Movie("Star Wars The Last Jedi",R.drawable.star_war);
        movieList.add(movie);
        movie = new Movie("Coco",R.drawable.coco);
        movieList.add(movie);
        movie = new Movie("Justice League ",R.drawable.justice_league);
        movieList.add(movie);
        movie = new Movie("Thor: Ragnarok",R.drawable.thor_ragnarok);
        movieList.add(movie);
        recyclerViewAdapter.notifyDataSetChanged();
    }

}
