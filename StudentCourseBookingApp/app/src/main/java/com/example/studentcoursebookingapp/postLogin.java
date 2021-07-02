package com.example.studentcoursebookingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class postLogin extends AppCompatActivity {

    private Button Account;
    private Button Course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_login);

        Account = (Button)findViewById(R.id.btnAccount);
        Course = (Button)findViewById(R.id.btnCourse);

        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goAccount();
            }
        });

        Course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goCourse();
            }
        });
    }

    private void goAccount(){
        Intent intent = new Intent(postLogin.this, manageAccount.class);
        startActivity(intent);
    }

    private void goCourse(){
        Intent intent = new Intent(postLogin.this, manageCourse.class);
        startActivity(intent);
    }

}