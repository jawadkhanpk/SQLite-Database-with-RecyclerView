package com.example.sqlitedatabasewithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.database.Cursor;
import android.os.Bundle;

import java.util.ArrayList;

public class FetchDataActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<ModelClass> dataholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fetch_data);

        recyclerView = findViewById(R.id.idRecView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Cursor cursor = new  DbManager(this).readAllData();
        while (cursor.moveToNext()){
        ModelClass modelClass = new ModelClass(cursor.getString(1),cursor.getString(2),cursor.getString(3));
        dataholder.add(modelClass);


        }





    }
}