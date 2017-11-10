package com.yuri_khechoyan.hw3_twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Retrieves all info that was stored into the bundle - from MainActivity.java
        Bundle bundle = getIntent().getExtras();

        //Retrieve Intent from MainActivity
        Intent intent = getIntent();


        //http://hmkcode.com/android-passing-data-to-another-activities/

        //Create Object for all fields that will move from MainActivity to SecondActivity
        //Member Variables will extract user input and output to SecondActivity (confirmation page)
        String user_FirstName = intent.getStringExtra("fname");
        String user_LastName = intent.getStringExtra("lname");
        String user_PhNumber = intent.getStringExtra("phnumber");
        String user_Email = intent.getStringExtra("email");
        String user_UserName = intent.getStringExtra("username");

        //Add user inputted info to TextView in activity_second.xml
        ((TextView)findViewById(R.id.et_FirstName)).setText(user_FirstName);
        ((TextView)findViewById(R.id.et_LastName)).setText(user_LastName);
        ((TextView)findViewById(R.id.et_PhoneNumber)).setText(user_PhNumber);
        ((TextView)findViewById(R.id.et_EnterEmail)).setText(user_Email);
        ((TextView)findViewById(R.id.et_UserName)).setText(user_UserName);


        //Confirmation Toast that displays extracted user info
        Toast.makeText(this, bundle.getString("fname") + ", " + bundle.getString("lname")
                +", " + bundle.getString("phnumber") +", " + bundle.getString("email")
                +", " +bundle.getString("username"), Toast.LENGTH_LONG).show();
    }
}