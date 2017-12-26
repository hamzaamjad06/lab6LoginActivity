package com.example.hamza.loginactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etusername, etpassword;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etusername = (EditText) findViewById(R.id.etusername);
        etpassword = (EditText) findViewById(R.id.etpassword);
        button = (Button) findViewById(R.id.signin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String struser = etusername.getText().toString();
                final String strpass = etpassword.getText().toString();

                if (struser.equals("") || strpass.equals("")) {
                    Toast.makeText(MainActivity.this, "Username or Password missing", Toast.LENGTH_SHORT).show();
                } else if (struser.equals(etpassword.getText().toString())) {
                    Toast.makeText(MainActivity.this, "username and password are same", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "username and password are not same", Toast.LENGTH_SHORT).show();
                }
            }


        });

    }
}
