package appewtc.masterung.planyourmoney;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterUNG on 3/17/16 AD.
 */
public class MyManage {

    //Explicit
    private MyOpenHelper myOpenHelper;
    private SQLiteDatabase writeSqLiteDatabase;

    public static final String user_table = "userTABLE";
    public static final String income_table = "incomeTABLE";
    public static final String outcome_table = "outcomeTABLE";
    public static final String column_id = "_id";
    public static final String column_Name = "Name";
    public static final String column_Surname = "Surname";
    public static final String column_User = "User";
    public static final String column_Password = "Password";
    public static final String column_Date = "Date";
    public static final String column_Category = "Category";
    public static final String column_Income = "Income";
    public static final String column_Outcome = "Outcome";
    public static final String column_Remark = "Remark";


    public MyManage(Context context) {

        //Create & Connected
        myOpenHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = myOpenHelper.getWritableDatabase();

    }   // Constructor

    public long addOutcome(String strDate,
                          String strCategory,
                          String strOutcome,
                          String strRemark) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(column_Date, strDate);
        contentValues.put(column_Category, strCategory);
        contentValues.put(column_Outcome, strOutcome);
        contentValues.put(column_Remark, strRemark);

        return writeSqLiteDatabase.insert(outcome_table, null, contentValues);
    }



    public long addIncome(String strDate,
                          String strCategory,
                          String strIncome,
                          String strRemark) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(column_Date, strDate);
        contentValues.put(column_Category, strCategory);
        contentValues.put(column_Income, strIncome);
        contentValues.put(column_Remark, strRemark);

        return writeSqLiteDatabase.insert(income_table, null, contentValues);
    }

    public long addUser(String strName,
                        String strSurname,
                        String strUser,
                        String strPassword) {

        ContentValues contentValues = new ContentValues();
        contentValues.put(column_Name, strName);
        contentValues.put(column_Surname, strSurname);
        contentValues.put(column_User, strUser);
        contentValues.put(column_Password, strPassword);

        return writeSqLiteDatabase.insert(user_table, null, contentValues);
    }


}   // Main Class
