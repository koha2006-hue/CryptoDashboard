package com.example.mycrypto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView userEdt = (TextView) findViewById(R.id.gmail);
        TextView passEdt = (TextView) findViewById(R.id.pass);

        Button loginbtn = (Button) findViewById(R.id.siginbut);


        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (userEdt.getText().toString().equals("admin") && passEdt.getText().toString().equals("admin")) {
                    Toast.makeText(LoginActivity.this, "Login success", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(LoginActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}