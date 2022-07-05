package com.example.remoteattendancemonitoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginScreen extends AppCompatActivity {

    Button loginBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        loginBTN = (Button) findViewById(R.id.loginBTN);
        loginBTN.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dashboardscreen();
            }
        });
    }
    private void dashboardscreen() {
        Intent intent = new Intent(LoginScreen.this, DashboardScreen.class);
        startActivity(intent);
        finish();
    }


}