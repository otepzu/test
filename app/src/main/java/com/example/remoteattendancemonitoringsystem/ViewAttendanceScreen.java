package com.example.remoteattendancemonitoringsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;

public class ViewAttendanceScreen extends AppCompatActivity {

    // tvR = Present Days , tvPython = Absent Days, CPP = Late
    // Create the object of TextView and PieChart class
    TextView tvR, tvPython, tvCPP;
    PieChart pieChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_attendance_screen);

        // Link those objects with their respective
        // id's that we have given in .XML file
        tvR = findViewById(R.id.tvR);
        tvPython = findViewById(R.id.tvPython);
        tvCPP = findViewById(R.id.tvCPP);
        pieChart = findViewById(R.id.piechart);
    }

    private void setData(){
        // Set the percentage of language used
        tvR.setText(Integer.toString(40));
        tvPython.setText(Integer.toString(30));
        tvCPP.setText(Integer.toString(5));
    }
    private void addPieSlice(){
        // Set the data and color to the pie chart
        pieChart.addPieSlice(
                new PieModel(
                        "Present Days",
                        Integer.parseInt(tvR.getText().toString()),
                        Color.parseColor("#33ff33")));
        pieChart.addPieSlice(
                new PieModel(
                        "Absent Days",
                        Integer.parseInt(tvPython.getText().toString()),
                        Color.parseColor("#ff0000")));
        pieChart.addPieSlice(
                new PieModel(
                        "Late",
                        Integer.parseInt(tvCPP.getText().toString()),
                        Color.parseColor("#ffff00")));
    }
    private void startAnimation(){
        // To animate the pie chart
        pieChart.startAnimation();
    }

}