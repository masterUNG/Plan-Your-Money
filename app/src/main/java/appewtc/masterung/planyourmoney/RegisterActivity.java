package appewtc.masterung.planyourmoney;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    //Explicit
    private EditText nameEditText, surnameEditText, userEditText, passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //Bind Widget
        bindWidget();

    }   // Main Method

    public void clickRegister(View view) {

        String strName = nameEditText.getText().toString().trim();
        String strSurname = surnameEditText.getText().toString().trim();
        String strUser = userEditText.getText().toString().trim();
        String strPassword = passwordEditText.getText().toString().trim();

        //Check Space
        if (strName.equals("") ||
                strSurname.equals("") ||
                strUser.equals("") ||
                strPassword.equals("")) {

            //Have Space
            myAlert("กรุณากรอก ให้ครบทุกช่องคะ");

        } else {

            //No Space

        }

    }   // clickRegister

    private void myAlert(String strAlert) {
        Toast.makeText(RegisterActivity.this, strAlert, Toast.LENGTH_SHORT).show();
    }

    private void bindWidget() {
        nameEditText = (EditText) findViewById(R.id.editText);
        surnameEditText = (EditText) findViewById(R.id.editText2);
        userEditText = (EditText) findViewById(R.id.editText3);
        passwordEditText = (EditText) findViewById(R.id.editText4);
    }

}   // Main Class
