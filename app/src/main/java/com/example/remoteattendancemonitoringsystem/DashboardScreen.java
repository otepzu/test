package com.example.remoteattendancemonitoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardScreen extends AppCompatActivity {
    Button attendanceBTN, viewattBTN, settingsBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_screen);

        attendanceBTN = (Button) findViewById(R.id.attendanceBTN);
        attendanceBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardScreen.this, AttendanceScreen.class);
                startActivity(intent);
                finish();
            }
        });
        viewattBTN = (Button) findViewById(R.id.viewattBTN);
        viewattBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardScreen.this, ViewAttendanceScreen.class);
                startActivity(intent);
                finish();
            }
        });

        settingsBTN = (Button) findViewById(R.id.settingsBTN);
        settingsBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DashboardScreen.this, ConfigAccScreen.class);
                startActivity(intent);
                finish();
            }
        });
    }
}