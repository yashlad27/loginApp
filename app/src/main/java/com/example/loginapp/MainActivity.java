package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void ClickToName(View view){
        EditText editYourName = (EditText) findViewById(R.id.editYourName);
        Log.i("info", "Name entered!");

        Log.i("Values", editYourName.getText().toString());
    }

    public void ClickToPassword(View view){
        EditText editYourPassword = (EditText) findViewById(R.id.editPassword);
        Log.i("info", "Password Entered!");

        Log.i("values", editYourPassword.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}