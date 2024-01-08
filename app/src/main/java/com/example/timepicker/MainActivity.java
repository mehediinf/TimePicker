package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    private Button showButton;
    private TimePicker timePicker;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.showButton_Id);
        timePicker = findViewById(R.id.timePicker_Id);
        textView = findViewById(R.id.textView_Id);


        // in this line add by set of hour 24 formate
        timePicker.setIs24HourView(true);


        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String time = timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();

                textView.setText(time);

            }
        });


    }
}