package com.example.lab11;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String name = "mdatabase.db";
    private static final int version = 1;

    MyDBHelper(Context context) {
        super(context, name, null, version);
    }
    @Override
    public void onCreate(SQLiteOpenHelper db) {
        db.execSQL("CREATE TABLE myTable(book text PRIMARY KEY, price integer NOT NULL)")
    }
    @Override
    public void onUpgrade(SQLiteOpenHelper db, int oldVersion,
                          int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS myTable");
        onCreate(db);
    }
}
