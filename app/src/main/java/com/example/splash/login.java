package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class login extends AppCompatActivity {

    Button callsignup;
    //********************************
    //Button callprice;
    Button dashb;
    ImageButton Admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_login);

        callsignup = findViewById(R.id.signup_screen);

        callsignup.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,signup.class);
                startActivity(intent);



            }
        });

        //go dashboard

        dashb = findViewById(R.id.adminlogin);

        dashb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this,Dashboard.class);
                startActivity(intent);
            }
        });

        //*******************************************************************************************
        /*callprice = findViewById(R.id.adminlogin);

        callprice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login.this, price.class);
                startActivity(intent);
            }
        });*/

        //*******************************************************************************************

        Admin = findViewById(R.id.admin);

        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(login.this, admin_login.class);
                startActivity(intent1);
            }
        });
    }
}
