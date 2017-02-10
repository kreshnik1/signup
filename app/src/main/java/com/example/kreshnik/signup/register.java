package com.example.kreshnik.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class register extends AppCompatActivity {
    private EditText et_name,et_surname,et_userName,et_pass,et_confirmPass;
    private String name,surname,username,pass,confirmPass;
    Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_name=(EditText)findViewById(R.id.name);
        et_surname=(EditText)findViewById(R.id.surname);
        et_userName=(EditText)findViewById(R.id.username);
        et_pass=(EditText)findViewById(R.id.password);
        et_confirmPass=(EditText)findViewById(R.id.confirmPass);
        register=(Button)findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
                if(!validate()){
                    Toast.makeText(register.this,"Register Failed",Toast.LENGTH_LONG).show();
                }
                else{
                    onSignUpSucces();
                }
            }
        });
    }
    public void onSignUpSucces(){
        Intent intent = new Intent("com.example.kreshnik.signup.MainActivity");
        startActivity(intent);
    }
    public boolean validate(){
        boolean valid=true;
        if(name.isEmpty()||name.length()>32){
            et_name.setError("Please Enter valid name");
            valid=false;
        }
        if(surname.isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(surname).matches()){
            et_surname.setError("Please Enter valid email");
            valid=false;
        }

        if(username.isEmpty()||username.length()>32){
            et_userName.setError("Please Enter valid email");
            valid=false;
        }
        if(pass.isEmpty()||pass.length()<=6){
            et_pass.setError("Please");
            valid=false;
        }
        if()
        return valid;
    }
    public void register(){
        initialize();
    }
    public void initialize(){
        name=et_name.getText().toString().trim();
        surname=et_surname.getText().toString().trim();
        username=et_userName.getText().toString().trim();
        pass=et_pass.getText().toString().trim();
        confirmPass=et_confirmPass.getText().toString().trim();
    }
}
