package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NumberRecyclerViewAdapter numberRecyclerViewAdapter = new NumberRecyclerViewAdapter();
        RecyclerView recyclerView = this.findViewById(R.id.RecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(numberRecyclerViewAdapter);
    }
}