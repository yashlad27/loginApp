package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ClickToName(View view){
        EditText editYourName = (EditText) findViewById(R.id.editYourName);
        //EditText editYourPassword = (EditText) findViewById(R.id.editPassword);
        Log.i("info", "Name entered!");
        //Log.i("info", "Password Entered!");

        Log.i("username", editYourName.getText().toString());
        //Log.i("password", editYourPassword.getText().toString());

        //Toast.makeText(this, "Hi there!", Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "Hello "+editYourName.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void ClickToPassword(View view){
        EditText editYourPassword = (EditText) findViewById(R.id.editPassword);
        Log.i("info", "Password Entered!");

        Log.i("password", editYourPassword.getText().toString());

        Toast.makeText(this, "Good Morning!", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}