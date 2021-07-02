package com.example.studentcoursebookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText Username;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private Button Register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = (EditText)findViewById(R.id.etUsername);
        Password = (EditText)findViewById(R.id.etPassword);
        Info = (TextView)findViewById(R.id.tvInfo);
        Login = (Button)findViewById(R.id.btnLogin);
        Register = (Button)findViewById(R.id.btnRegister);
        Login.setOnClickListener(v -> validate(Username.getText().toString(),Password.getText().toString()));
        Register.setOnClickListener(v -> goRegister());
        Info.setText("");


    }

    @SuppressLint("SetTextI18n")
    private void validate(String userLogin, String userPassword){
        //final TextView changingText = (TextView) findViewById(R.id.tvInfo);

        if((userLogin.equals("admin")) && (userPassword.equals("admin123"))){
            Intent intent = new Intent(MainActivity.this, postLogin.class);
            startActivity(intent);
        }else{
            Info.setText("Login Failed");
            //changingText.setText("Login Failed");
        }
    }

    private void goRegister(){
        Intent intent = new Intent(MainActivity.this, register.class);
        startActivity(intent);
    }



}