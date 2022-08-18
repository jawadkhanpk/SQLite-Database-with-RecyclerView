package com.example.sqlitedatabasewithrecyclerview;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbManager extends SQLiteOpenHelper {

    private  static  final String dbname = "dbcontact";

    public DbManager(@Nullable Context context) {
        super(context, dbname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String qry = "create table tbl_contact ( id integer primary key autoincrement, name text, contact text, email text)";
        sqLiteDatabase.execSQL(qry);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
