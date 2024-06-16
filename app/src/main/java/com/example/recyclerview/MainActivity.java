package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ArrayList<DataModel> arrDatas =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView =findViewById(R.id.recyclerContact);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));



        arrDatas.add(new DataModel(R.drawable.a,"A","hii"));
        arrDatas.add(new DataModel(R.drawable.p,"B","hey"));
        arrDatas.add(new DataModel(R.drawable.c,"C","hello"));
        arrDatas.add(new DataModel(R.drawable.d,"D","bye"));
        arrDatas.add(new DataModel(R.drawable.e,"E","hii"));
        arrDatas.add(new DataModel(R.drawable.f,"F","hey"));
        arrDatas.add(new DataModel(R.drawable.g,"G","hello"));
        arrDatas.add(new DataModel(R.drawable.h,"H","bye"));
        arrDatas.add(new DataModel(R.drawable.i,"I","hii"));
        arrDatas.add(new DataModel(R.drawable.j,"J","hey"));
        arrDatas.add(new DataModel(R.drawable.k,"K","hello"));
        arrDatas.add(new DataModel(R.drawable.l,"L","bye"));
        arrDatas.add(new DataModel(R.drawable.m,"M","hii"));
        arrDatas.add(new DataModel(R.drawable.n,"N","hey"));
        arrDatas.add(new DataModel(R.drawable.o,"O","hello"));
        arrDatas.add(new DataModel(R.drawable.p,"P","bye"));

        RecyclerContentAdapter adapter= new RecyclerContentAdapter(this, arrDatas);

        recyclerView.setAdapter(adapter);



    }
}