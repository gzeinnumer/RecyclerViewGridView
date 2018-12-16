package com.gzeinnumer.recyclerviewwithgridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    GridLayoutManager layoutManager;
    private int mImage[] = {
            R.drawable.me,
            R.drawable.gambar_1,
            R.drawable.busy,
            R.drawable.cry,
            R.drawable.devilicon,
            R.drawable.laught,
            R.drawable.love,
            R.drawable.mad,
            R.drawable.offline,
            R.drawable.sad,
            R.drawable.smile
    };
    private String mName[] = {
            "M. Fadli Zein","Cybertech","Busy","Cry","Devil Icon","Laught","Love","Mad","Offline","Sad","Smile"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.reciclerView);
        layoutManager = new GridLayoutManager(this,3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mImage,mName);
        recyclerView.setAdapter(adapter);
    }
}
