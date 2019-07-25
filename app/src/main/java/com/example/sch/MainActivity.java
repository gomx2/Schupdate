package com.example.sch;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {
    private static final String TAG = "MainActivity";

    private Context mContext;
    private List<String> titleArrayList;
    private RecyclerView mRecyclerView;
    private AdapterSong adapter;


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
        titleArrayList.add(Constants.LAGU6);
        titleArrayList.add(Constants.LAGU7);
        titleArrayList.add(Constants.LAGU8);
        titleArrayList.add(Constants.LAGU9);
        titleArrayList.add(Constants.LAGU10);
        titleArrayList.add(Constants.LAGU11);
        titleArrayList.add(Constants.LAGU12);
        titleArrayList.add(Constants.LAGU13);
        titleArrayList.add(Constants.LAGU14);
        titleArrayList.add(Constants.LAGU15);
        titleArrayList.add(Constants.LAGU16);
        titleArrayList.add(Constants.LAGU17);
        titleArrayList.add(Constants.LAGU18);
        titleArrayList.add(Constants.LAGU19);
        titleArrayList.add(Constants.LAGU20);
        titleArrayList.add(Constants.LAGU21);
        titleArrayList.add(Constants.LAGU22);
        titleArrayList.add(Constants.LAGU23);
        titleArrayList.add(Constants.LAGU24);
        titleArrayList.add(Constants.LAGU25);
        titleArrayList.add(Constants.LAGU26);
        titleArrayList.add(Constants.LAGU27);
        titleArrayList.add(Constants.LAGU28);
        titleArrayList.add(Constants.LAGU29);
        titleArrayList.add(Constants.LAGU30);
        titleArrayList.add(Constants.LAGU31);
        titleArrayList.add(Constants.LAGU32);
        titleArrayList.add(Constants.LAGU33);
        titleArrayList.add(Constants.LAGU34);
        titleArrayList.add(Constants.LAGU35);
        titleArrayList.add(Constants.LAGU36);
        titleArrayList.add(Constants.LAGU37);
        titleArrayList.add(Constants.LAGU38);
        titleArrayList.add(Constants.LAGU39);
        titleArrayList.add(Constants.LAGU40);
        titleArrayList.add(Constants.LAGU41);
        titleArrayList.add(Constants.LAGU42);
        titleArrayList.add(Constants.LAGU43);
        titleArrayList.add(Constants.LAGU45);
        titleArrayList.add(Constants.LAGU46);
        titleArrayList.add(Constants.LAGU47);
        titleArrayList.add(Constants.LAGU48);
        titleArrayList.add(Constants.LAGU49);
        titleArrayList.add(Constants.LAGU50);
        titleArrayList.add(Constants.LAGU51);
        titleArrayList.add(Constants.LAGU52);
        titleArrayList.add(Constants.LAGU53);
        titleArrayList.add(Constants.LAGU54);
        titleArrayList.add(Constants.LAGU55);
        titleArrayList.add(Constants.LAGU56);
        titleArrayList.add(Constants.LAGU57);
        titleArrayList.add(Constants.LAGU58);
        titleArrayList.add(Constants.LAGU59);
        titleArrayList.add(Constants.LAGU60);
        titleArrayList.add(Constants.LAGU61);
        titleArrayList.add(Constants.LAGU62);
        titleArrayList.add(Constants.LAGU63);
        titleArrayList.add(Constants.LAGU64);
        titleArrayList.add(Constants.LAGU65);
        titleArrayList.add(Constants.LAGU66);
        titleArrayList.add(Constants.LAGU67);
        titleArrayList.add(Constants.LAGU68);
        titleArrayList.add(Constants.LAGU69);
        titleArrayList.add(Constants.LAGU70);
        titleArrayList.add(Constants.LAGU71);
        titleArrayList.add(Constants.LAGU72);
        titleArrayList.add(Constants.LAGU73);
        titleArrayList.add(Constants.LAGU74);
        titleArrayList.add(Constants.LAGU75);
        titleArrayList.add(Constants.LAGU76);
        titleArrayList.add(Constants.LAGU77);
        titleArrayList.add(Constants.LAGU78);
        titleArrayList.add(Constants.LAGU79);
        titleArrayList.add(Constants.LAGU80);
        titleArrayList.add(Constants.LAGU81);
        titleArrayList.add(Constants.LAGU82);
        titleArrayList.add(Constants.LAGU83);
        titleArrayList.add(Constants.LAGU84);
        titleArrayList.add(Constants.LAGU85);
        titleArrayList.add(Constants.LAGU86);
        titleArrayList.add(Constants.LAGU87);
        titleArrayList.add(Constants.LAGU88);
        titleArrayList.add(Constants.LAGU89);
        titleArrayList.add(Constants.LAGU90);
        titleArrayList.add(Constants.LAGU91);
        titleArrayList.add(Constants.LAGU92);
        titleArrayList.add(Constants.LAGU93);
        titleArrayList.add(Constants.LAGU94);
        titleArrayList.add(Constants.LAGU95);
        titleArrayList.add(Constants.LAGU96);
        titleArrayList.add(Constants.LAGU97);
        titleArrayList.add(Constants.LAGU98);
        titleArrayList.add(Constants.LAGU99);
        titleArrayList.add(Constants.LAGU100);
        titleArrayList.add(Constants.LAGU101);



        mRecyclerView = (RecyclerView) findViewById(R.id.title_layout_recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        adapter = new AdapterSong(mContext, titleArrayList, new CustomItemClickListener() {
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_menu,menu);

        MenuItem menuItem =menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        String userInput = s.toLowerCase();
        List<String> newList = new ArrayList<>();
        for(String name : titleArrayList)
        {
            if(name.toLowerCase().contains(userInput))
            {
                newList.add(name);
            }
        }
        adapter.updateList(newList);
        return true;
    }
}
