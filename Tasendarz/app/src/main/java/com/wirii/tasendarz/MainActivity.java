package com.wirii.tasendarz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TextView thedate = findViewById(R.id.date);
        Button btngocalendar = findViewById(R.id.btngocalendar);
        //Intent incoming = getIntent();
        //String date = incoming.getStringExtra("date");
        //thedate.setText(date);

        btngocalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.wirii.tasendarz.CalendarActivity.class);
                startActivity(intent);
            }
        });
    }
}