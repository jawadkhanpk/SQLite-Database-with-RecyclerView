package com.example.sqlitedatabasewithrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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
        btnShowOnRecyclerView = findViewById(R.id.idBtnShowOnRV);


        btnSubmitt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processInsert(etName.getText().toString(), etContact.getText().toString(), etEmail.getText().toString());

            }
        });

        btnShowOnRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, FetchDataActivity.class);
                startActivity(i);
            }
        });

    }

    private void processInsert(String n, String c, String e) {
        String res = new DbManager(this).addRecord(n,c,e);
        Toast.makeText(this, res, Toast.LENGTH_SHORT).show();
    }
}