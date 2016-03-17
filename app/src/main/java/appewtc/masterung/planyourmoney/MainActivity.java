package appewtc.masterung.planyourmoney;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyManage myManage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Request SQLite
        myManage = new MyManage(this);

        //Test Add Value
        //testAddValue();

    }   // Main Method

    @Override
    protected void onStart() {
        super.onStart();

        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor cursor = sqLiteDatabase.rawQuery("SELECT * FROM " + MyManage.user_table, null);
        cursor.moveToFirst();

        if (cursor.getCount() == 0) {
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        }
        cursor.close();


    }   // onStart

    private void testAddValue() {
        myManage.addUser("name", "sur", "user", "pass");
        myManage.addIncome("date", "cat", "income", "remark");
        myManage.addOutcome("date", "cat", "outcome", "remark");
    }

}   // Main Class
