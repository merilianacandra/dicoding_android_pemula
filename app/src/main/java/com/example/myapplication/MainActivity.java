package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode){
        switch (selectedMode){
            case R.id.profile_logo:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
            break;
        }
    }
}
