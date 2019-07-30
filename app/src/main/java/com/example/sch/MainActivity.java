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
import android.widget.Button;
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
        titleArrayList.add(Constants.LAGU102);
        titleArrayList.add(Constants.LAGU103);
        titleArrayList.add(Constants.LAGU104);
        titleArrayList.add(Constants.LAGU105);
        titleArrayList.add(Constants.LAGU106);
        titleArrayList.add(Constants.LAGU107);
        titleArrayList.add(Constants.LAGU108);
        titleArrayList.add(Constants.LAGU109);
        titleArrayList.add(Constants.LAGU110);
        titleArrayList.add(Constants.LAGU111);
        titleArrayList.add(Constants.LAGU112);
        titleArrayList.add(Constants.LAGU113);
        titleArrayList.add(Constants.LAGU114);
        titleArrayList.add(Constants.LAGU115);
        titleArrayList.add(Constants.LAGU116);
        titleArrayList.add(Constants.LAGU117);
        titleArrayList.add(Constants.LAGU118);
        titleArrayList.add(Constants.LAGU119);
        titleArrayList.add(Constants.LAGU120);
        titleArrayList.add(Constants.LAGU121);
        titleArrayList.add(Constants.LAGU122);
        titleArrayList.add(Constants.LAGU123);
        titleArrayList.add(Constants.LAGU124);
        titleArrayList.add(Constants.LAGU125);
        titleArrayList.add(Constants.LAGU126);
        titleArrayList.add(Constants.LAGU127);
        titleArrayList.add(Constants.LAGU128);
        titleArrayList.add(Constants.LAGU129);
        titleArrayList.add(Constants.LAGU130);
        titleArrayList.add(Constants.LAGU131);
        titleArrayList.add(Constants.LAGU132);
        titleArrayList.add(Constants.LAGU133);
        titleArrayList.add(Constants.LAGU134);
        titleArrayList.add(Constants.LAGU135);
        titleArrayList.add(Constants.LAGU136);
        titleArrayList.add(Constants.LAGU137);
        titleArrayList.add(Constants.LAGU138);
        titleArrayList.add(Constants.LAGU139);
        titleArrayList.add(Constants.LAGU140);
        titleArrayList.add(Constants.LAGU141);
        titleArrayList.add(Constants.LAGU142);
        titleArrayList.add(Constants.LAGU143);
        titleArrayList.add(Constants.LAGU144);
        titleArrayList.add(Constants.LAGU145);
        titleArrayList.add(Constants.LAGU146);
        titleArrayList.add(Constants.LAGU147);
        titleArrayList.add(Constants.LAGU148);
        titleArrayList.add(Constants.LAGU149);
        titleArrayList.add(Constants.LAGU150);
        titleArrayList.add(Constants.LAGU151);
        titleArrayList.add(Constants.LAGU152);
        titleArrayList.add(Constants.LAGU153);
        titleArrayList.add(Constants.LAGU154);
        titleArrayList.add(Constants.LAGU155);
        titleArrayList.add(Constants.LAGU156);
        titleArrayList.add(Constants.LAGU157);
        titleArrayList.add(Constants.LAGU158);
        titleArrayList.add(Constants.LAGU159);
        titleArrayList.add(Constants.LAGU160);
        titleArrayList.add(Constants.LAGU161);
        titleArrayList.add(Constants.LAGU162);
        titleArrayList.add(Constants.LAGU163);
        titleArrayList.add(Constants.LAGU164);
        titleArrayList.add(Constants.LAGU165);
        titleArrayList.add(Constants.LAGU166);
        titleArrayList.add(Constants.LAGU167);
        titleArrayList.add(Constants.LAGU168);
        titleArrayList.add(Constants.LAGU169);
        titleArrayList.add(Constants.LAGU170);
        titleArrayList.add(Constants.LAGU171);
        titleArrayList.add(Constants.LAGU172);
        titleArrayList.add(Constants.LAGU173);
        titleArrayList.add(Constants.LAGU174);
        titleArrayList.add(Constants.LAGU175);
        titleArrayList.add(Constants.LAGU176);
        titleArrayList.add(Constants.LAGU177);
        titleArrayList.add(Constants.LAGU178);
        titleArrayList.add(Constants.LAGU179);
        titleArrayList.add(Constants.LAGU180);
        titleArrayList.add(Constants.LAGU181);
        titleArrayList.add(Constants.LAGU182);
        titleArrayList.add(Constants.LAGU183);
        titleArrayList.add(Constants.LAGU184);
        titleArrayList.add(Constants.LAGU185);
        titleArrayList.add(Constants.LAGU186);
        titleArrayList.add(Constants.LAGU187);
        titleArrayList.add(Constants.LAGU188);
        titleArrayList.add(Constants.LAGU189);
        titleArrayList.add(Constants.LAGU190);
        titleArrayList.add(Constants.LAGU191);
        titleArrayList.add(Constants.LAGU192);
        titleArrayList.add(Constants.LAGU193);
        titleArrayList.add(Constants.LAGU194);
        titleArrayList.add(Constants.LAGU195);
        titleArrayList.add(Constants.LAGU196);
        titleArrayList.add(Constants.LAGU197);
        titleArrayList.add(Constants.LAGU198);
        titleArrayList.add(Constants.LAGU199);
        titleArrayList.add(Constants.LAGU200);
        titleArrayList.add(Constants.LAGU201);
        titleArrayList.add(Constants.LAGU202);
        titleArrayList.add(Constants.LAGU203);
        titleArrayList.add(Constants.LAGU204);
        titleArrayList.add(Constants.LAGU205);
        titleArrayList.add(Constants.LAGU206);
        titleArrayList.add(Constants.LAGU207);
        titleArrayList.add(Constants.LAGU208);
        titleArrayList.add(Constants.LAGU209);
        titleArrayList.add(Constants.LAGU210);
        titleArrayList.add(Constants.LAGU211);
        titleArrayList.add(Constants.LAGU212);
        titleArrayList.add(Constants.LAGU213);
        titleArrayList.add(Constants.LAGU214);
        titleArrayList.add(Constants.LAGU215);
        titleArrayList.add(Constants.LAGU216);
        titleArrayList.add(Constants.LAGU217);
        titleArrayList.add(Constants.LAGU218);
        titleArrayList.add(Constants.LAGU219);
        titleArrayList.add(Constants.LAGU220);
        titleArrayList.add(Constants.LAGU221);
        titleArrayList.add(Constants.LAGU222);
        titleArrayList.add(Constants.LAGU223);
        titleArrayList.add(Constants.LAGU224);
        titleArrayList.add(Constants.LAGU225);
        titleArrayList.add(Constants.LAGU226);
        titleArrayList.add(Constants.LAGU227);
        titleArrayList.add(Constants.LAGU228);
        titleArrayList.add(Constants.LAGU229);
        titleArrayList.add(Constants.LAGU230);
        titleArrayList.add(Constants.LAGU231);
        titleArrayList.add(Constants.LAGU232);
        titleArrayList.add(Constants.LAGU233);
        titleArrayList.add(Constants.LAGU234);
        titleArrayList.add(Constants.LAGU235);
        titleArrayList.add(Constants.LAGU236);
        titleArrayList.add(Constants.LAGU237);
        titleArrayList.add(Constants.LAGU238);
        titleArrayList.add(Constants.LAGU239);
        titleArrayList.add(Constants.LAGU240);
        titleArrayList.add(Constants.LAGU241);
        titleArrayList.add(Constants.LAGU242);
        titleArrayList.add(Constants.LAGU243);
        titleArrayList.add(Constants.LAGU244);
        titleArrayList.add(Constants.LAGU245);
        titleArrayList.add(Constants.LAGU246);
        titleArrayList.add(Constants.LAGU247);
        titleArrayList.add(Constants.LAGU248);
        titleArrayList.add(Constants.LAGU249);
        titleArrayList.add(Constants.LAGU250);
        titleArrayList.add(Constants.LAGU251);
        titleArrayList.add(Constants.LAGU252);
        titleArrayList.add(Constants.LAGU253);
        titleArrayList.add(Constants.LAGU254);
        titleArrayList.add(Constants.LAGU255);
        titleArrayList.add(Constants.LAGU256);
        titleArrayList.add(Constants.LAGU257);
        titleArrayList.add(Constants.LAGU258);
        titleArrayList.add(Constants.LAGU259);
        titleArrayList.add(Constants.LAGU260);
        titleArrayList.add(Constants.LAGU261);
        titleArrayList.add(Constants.LAGU262);
        titleArrayList.add(Constants.LAGU263);
        titleArrayList.add(Constants.LAGU264);
        titleArrayList.add(Constants.LAGU265);
        titleArrayList.add(Constants.LAGU266);
        titleArrayList.add(Constants.LAGU267);
        titleArrayList.add(Constants.LAGU268);
        titleArrayList.add(Constants.LAGU269);
        titleArrayList.add(Constants.LAGU270);
        titleArrayList.add(Constants.LAGU271);
        titleArrayList.add(Constants.LAGU272);
        titleArrayList.add(Constants.LAGU273);
        titleArrayList.add(Constants.LAGU274);
        titleArrayList.add(Constants.LAGU275);
        titleArrayList.add(Constants.LAGU276);
        titleArrayList.add(Constants.LAGU277);
        titleArrayList.add(Constants.LAGU278);
        titleArrayList.add(Constants.LAGU279);
        titleArrayList.add(Constants.LAGU280);
        titleArrayList.add(Constants.LAGU281);
        titleArrayList.add(Constants.LAGU282);
        titleArrayList.add(Constants.LAGU283);
        titleArrayList.add(Constants.LAGU284);
        titleArrayList.add(Constants.LAGU285);
        titleArrayList.add(Constants.LAGU286);
        titleArrayList.add(Constants.LAGU287);
        titleArrayList.add(Constants.LAGU288);
        titleArrayList.add(Constants.LAGU289);
        titleArrayList.add(Constants.LAGU290);
        titleArrayList.add(Constants.LAGU291);
        titleArrayList.add(Constants.LAGU292);
        titleArrayList.add(Constants.LAGU293);
        titleArrayList.add(Constants.LAGU294);
        titleArrayList.add(Constants.LAGU295);
        titleArrayList.add(Constants.LAGU296);
        titleArrayList.add(Constants.LAGU297);
        titleArrayList.add(Constants.LAGU298);
        titleArrayList.add(Constants.LAGU299);
        titleArrayList.add(Constants.LAGU300);
        titleArrayList.add(Constants.LAGU301);





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
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.back:
                Intent intent= new Intent (MainActivity.this, MainActivity.class);
                startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
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
                adapter.notifyDataSetChanged();
            }

        }

        adapter.updateList(newList);
        titleArrayList = newList;
        return true;

    }

}
