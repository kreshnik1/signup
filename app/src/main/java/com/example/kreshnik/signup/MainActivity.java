package com.example.kreshnik.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Username;
    private EditText Password;
    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = (EditText) findViewById(R.id.etUsername);
        Password = (EditText) findViewById(R.id.etPassword);
        loginButton = (Button) findViewById(R.id.button);
        registerButton = (Button) findViewById(R.id.button1);
        setRegisterButton();
        setLoginButton();
    }
    public void setRegisterButton(){
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.kreshnik.signup.register");
                startActivity(intent);
            }
        });
    }
    public void setLoginButton(){
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.kreshnik.signup.home");
                startActivity(intent);
            }
        });
    }
}
