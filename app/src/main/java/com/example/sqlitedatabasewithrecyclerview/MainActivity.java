package com.example.sqlitedatabasewithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etName, etContact, etEmail;
    Button btnSubmitt, btnShowOnRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.idEtName);
        etContact = findViewById(R.id.idEtContact);
        etEmail = findViewById(R.id.idEtEmail);
        btnSubmitt = findViewById(R.id.idBtnSubmitt);
        btnShowOnRecyclerView = findViewById(R.id.idBtnShowOnRV);




    }
}