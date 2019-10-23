package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailListActivity extends AppCompatActivity {

    TextView txtName, des;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_list);

        txtName = findViewById(R.id.detail_list);
        des = findViewById(R.id.deskripsi);
        image = findViewById(R.id.gambar);

        Intent i = getIntent();

        String name = i.getStringExtra("name");
        String deskrip = i.getStringExtra("deskrip");
        int gambar = i.getExtras().getInt("gambar");

        txtName.setText(name);
        des.setText(deskrip);
        image.setImageResource(gambar);
    }
}
