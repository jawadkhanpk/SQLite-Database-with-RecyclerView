package com.example.sqlitedatabasewithrecyclerview;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
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

        String qry = "DROP TABLE IF EXISTS tbl_contact";
        sqLiteDatabase.execSQL(qry);
        onCreate(sqLiteDatabase);
    }

    public String addRecord(String name, String contact, String email){

        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv  = new ContentValues();
        cv.put("name",name);
        cv.put("contact",contact);
        cv.put("email",email);

        float result = db.insert("tbl_contact", null, cv);
        if (result == -1)
            return "Failed";
        else
            return "Successfully Inserted";
}

    public Cursor readAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        String qry = "select * from tbl_contact order by id desc";
        Cursor cursor = db.rawQuery(qry,null);
        return cursor;


    }
}
