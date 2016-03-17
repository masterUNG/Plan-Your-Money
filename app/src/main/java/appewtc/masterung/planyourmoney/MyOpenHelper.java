package appewtc.masterung.planyourmoney;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterUNG on 3/17/16 AD.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    //Explicit
    public static final String database_name = "money.db";
    private static final int database_version = 1;

    private static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key, " +
            "Name text, " +
            "Surname text, " +
            "User text, " +
            "Password text);";

    private static final String create_income_table = "create table incomeTABLE (" +
            "_id integer primary key, " +
            "Date text, " +
            "Category text, " +
            "Income text, " +
            "Remark text);";

    private static final String create_outcome_table = "create table outcomeTABLE (" +
            "_id integer primary key, " +
            "Date text, " +
            "Category text, " +
            "Outcome text, " +
            "Remark text);";



    public MyOpenHelper(Context context) {
        super(context, database_name, null, database_version);
    }   // Constructor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_user_table);
        sqLiteDatabase.execSQL(create_income_table);
        sqLiteDatabase.execSQL(create_outcome_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}   // Main Class
