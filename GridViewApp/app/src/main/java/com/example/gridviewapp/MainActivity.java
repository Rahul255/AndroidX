package com.example.gridviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<Integer>();

        titles.add("First Item");
        titles.add("Second Item");
        titles.add("Third Item");
        titles.add("Fourth Item");

        images.add(R.drawable.ic_baseline_airline_seat_flat_angled_24);
        images.add(R.drawable.ic_baseline_airplanemode_active_24);
        images.add(R.drawable.ic_baseline_brightness_6_24);
        images.add(R.drawable.ic_baseline_build_24);

        adapter = new Adapter(this,titles,images);
        

    }
}