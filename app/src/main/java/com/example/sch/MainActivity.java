package com.example.sch;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    private Context mContext;
    ArrayList<String> titleArrayList;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = MainActivity.this;

        titleArrayList = new ArrayList<String>();

        titleArrayList.add(Constants.LAGU1);
        titleArrayList.add(Constants.LAGU2);
        titleArrayList.add(Constants.LAGU3);
        titleArrayList.add(Constants.LAGU4);
        titleArrayList.add(Constants.LAGU5);

        mRecyclerView = (RecyclerView) findViewById(R.id.title_layout_recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        AdapterSong adapter = new AdapterSong(mContext, titleArrayList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {

                Intent desIntent = new Intent( mContext,DescriptionActivity.class);
                desIntent.putExtra("title",titleArrayList.get(position));
                startActivity(desIntent);
                Toast.makeText(mContext, "clicked "+titleArrayList.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setAdapter(adapter);
    }
}
