package com.example.employee;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Employee.db";
    public static final String TABLE_NAME = "employee_records";

    //-------- Declare the Column Names in the database

    public static final String ID = "ID";
    public static final String F_NAME = "FIRST NAME ";
    public static final String L_NAME = "LAST NAME ";
    public static final String ADDRESS = "ADDRESS";
    public static final String CITY = "CITY";
    public static final String STATE = "STATE";
    public static final String ZIP = "ZIP CODE";
    public static final String TAX_ID = "TAX ID";
    public static final String POSITION = "POSITION";
    public static final String DEPARTMENT = "DEPARTMENT";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
        //SQLiteDatabase db = this.getWritableDatabase();

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                " FIRST TEXT, LAST TEXT, ADDRESS TEXT, STATE TEXT, ZIP TEXT, TAX_ID TEXT, " +
                "POSITION TEXT, DEPARTMENT TEXT) ");
        //execute your query

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public boolean insertData(String first, String last,  String taxId,
                              String address, String city, String state, String zip,
                              String position, String department){

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        //contentValues.put(column_name, value);

        contentValues.put(F_NAME, first);
        contentValues.put(L_NAME, last);
        contentValues.put(ADDRESS, address);
        contentValues.put(CITY, city);
        contentValues.put(STATE, state);
        contentValues.put(ZIP, zip);
        contentValues.put(TAX_ID, taxId);
        contentValues.put(POSITION, position);
        contentValues.put(DEPARTMENT, department);

        long result = db.insert(TABLE_NAME, null, contentValues);

        if (result == -1) {
            return false;
        }
            else{

                return true;
            }
        }

}
