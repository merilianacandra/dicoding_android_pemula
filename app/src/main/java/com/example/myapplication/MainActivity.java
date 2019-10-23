package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView aIndoFood;
    private ArrayList<IndoFood> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aIndoFood = findViewById(R.id.rv_indofood);
        aIndoFood.setHasFixedSize(true);

        list.addAll(IndoFoodData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        aIndoFood.setLayoutManager(new LinearLayoutManager(this));
        IndoFoodAdapter indoFoodAdapter = new IndoFoodAdapter(this);
        indoFoodAdapter.setListIndoFood(list);
        aIndoFood.setAdapter(indoFoodAdapter);
    }
}
