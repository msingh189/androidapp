package com.example.msingh189.newsroom;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText Name;
    EditText Password;
    Button Login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Name = (EditText) findViewById(R.id.etName);
        Password = (EditText) findViewById(R.id.etPassword);
        Login = (Button) findViewById(R.id.btnLogin);

        Login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Login();
            }
        });
    }

    public void Login(){
        String userName = Name.getText().toString().trim();
        String userPassword = Password.getText().toString().trim();
        if(userName.equals("Username") && userPassword.equals("password")){
            Toast.makeText(this,"Username and Password matched",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(LoginActivity.this, ClubActivity.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,"Username and Passsword do NOT matched!!",Toast.LENGTH_LONG).show();
        }
    }
}