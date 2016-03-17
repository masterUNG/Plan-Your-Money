package appewtc.masterung.planyourmoney;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private MyManage myManage;
    private EditText userEditText, passwordEditText;
    private String userString, passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        bindWidget();

        //Request SQLite
        myManage = new MyManage(this);

        //Test Add Value
        //testAddValue();

    }   // Main Method

    public void clickLogin(View view) {

        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();

        //Check Space
        if (userString.equals("") || passwordString.equals("")) {
            //Have Space
            myAlert("กรุณากรอกทุกช่อง คะ");
        } else {
            //No Space
            checkAuthen();
        }

    }   //clickLogin

    private void checkAuthen() {

        //Read data from userTABLE



    }   // checkAuthen

    private void myAlert(String strAlert) {
        Toast.makeText(MainActivity.this, strAlert, Toast.LENGTH_SHORT).show();
    }


    private void bindWidget() {
        userEditText = (EditText) findViewById(R.id.editText5);
        passwordEditText = (EditText) findViewById(R.id.editText6);
    }

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
