package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.recyclerview.Adapter.MovieDetailAdapter;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    MovieDetailAdapter adapter;
    List<String> new_movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try{
            // Make sure assign the new_movies inside the onCreate method
            new_movies=Arrays.asList(getResources().getStringArray(R.array.new_movies));
            // Recycler view handler
            recyclerView=findViewById(R.id.recyclerview);
            // use a linear layout manager
            layoutManager=new LinearLayoutManager(this);
            // Set layout type to recyclerview
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setHasFixedSize(true);
            // Adapter
            adapter=new MovieDetailAdapter(new_movies,this);
            recyclerView.setAdapter(adapter);

        } catch (Exception e){
            Toast.makeText(getApplicationContext(),e.getMessage().toString(),Toast.LENGTH_LONG).show();
        }

    }
}