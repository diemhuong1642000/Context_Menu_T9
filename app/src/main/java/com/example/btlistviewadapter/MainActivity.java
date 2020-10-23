package com.example.btlistviewadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.lang.invoke.ConstantCallSite;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Context context;
    ConstraintLayout rela;
    ArrayList<CountriesModel> countriesData;
    CustomAdapter customAdapter;
    CountriesModel countriesModel;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_main);

        //getviews
        listView = findViewById(R.id.listView);
        rela = (ConstraintLayout) findViewById(R.id.rela);
        countriesData = new ArrayList<>();

        //add Countries Data
        populateCountriesData();

        customAdapter = new CustomAdapter(context,countriesData);
        listView.setAdapter(customAdapter);
        registerForContextMenu(listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,countriesData.get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void onCreateContextMenu(ContextMenu menu,View v, ContextMenu.ContextMenuInfo menuInfo){
        menu.setHeaderTitle("Cập nhật (T.T.Diễm Hương)");
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.main_context_menu,menu);
    }

    private void populateCountriesData() {
        //country 1
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Việt Nam");
        countriesModel.setImage(R.drawable.vn);
        countriesModel.setArea("796,095 km2");
        countriesModel.setPopulation("203,382,058");
        countriesData.add(countriesModel);

        //country 2
        countriesModel = new CountriesModel();
        countriesModel.setId(2);
        countriesModel.setName("American");
        countriesModel.setImage(R.drawable.us);
        countriesModel.setArea("652,090 km2");
        countriesModel.setPopulation("25,500,100");
        countriesData.add(countriesModel);

        //country 3
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Canada");
        countriesModel.setImage(R.drawable.canada);
        countriesModel.setArea("3,287,260 km2");
        countriesModel.setPopulation("1,241,610,000");
        countriesData.add(countriesModel);

        //country 4
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Tây Ban Nha");
        countriesModel.setImage(R.drawable.tbn);
        countriesModel.setArea("1,648,200 km2");
        countriesModel.setPopulation("77,288,000");
        countriesData.add(countriesModel);

        //country 5
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Malaisia");
        countriesModel.setImage(R.drawable.malaisia);
        countriesModel.setArea("9,640,820 km2");
        countriesModel.setPopulation("1,363,350,000");
        countriesData.add(countriesModel);

        //country 6
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("China");
        countriesModel.setImage(R.drawable.tq);
        countriesModel.setArea("9,629,090 km2");
        countriesModel.setPopulation("317,706,000");
        countriesData.add(countriesModel);

        //country 7
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Iran");
        countriesModel.setImage(R.drawable.iran);
        countriesModel.setArea("9,970,610 km2");
        countriesModel.setPopulation("35,295,770");
        countriesData.add(countriesModel);

        //country 8
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Morocco");
        countriesModel.setImage(R.drawable.us);
        countriesModel.setArea("446,550 km2");
        countriesModel.setPopulation("33,202,300");
        countriesData.add(countriesModel);

        //country 9
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("South Africa");
        countriesModel.setImage(R.drawable.malaisia);
        countriesModel.setArea("1,221,040 km2");
        countriesModel.setPopulation("52,981,991");
        countriesData.add(countriesModel);

        //country 10
        countriesModel = new CountriesModel();
        countriesModel.setId(1);
        countriesModel.setName("Zimbabwe");
        countriesModel.setImage(R.drawable.canada);
        countriesModel.setArea("390,757 km2");
        countriesModel.setPopulation("12,973,808");
        countriesData.add(countriesModel);
    }
}