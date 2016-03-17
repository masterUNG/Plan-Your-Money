package appewtc.masterung.planyourmoney;

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

    private void testAddValue() {
        myManage.addUser("name", "sur", "user", "pass");
        myManage.addIncome("date", "cat", "income", "remark");
        myManage.addOutcome("date", "cat", "outcome", "remark");
    }

}   // Main Class
