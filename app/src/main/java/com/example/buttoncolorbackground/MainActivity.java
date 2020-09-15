package com.example.buttoncolorbackground;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    View screenView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            screenView =(View) findViewById(R.id.view);
            Button green = (Button) findViewById(R.id.green);
            Button blue = (Button) findViewById(R.id.blue);
            Button red = (Button) findViewById(R.id.red);

            green.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LinearLayout ll = (LinearLayout) findViewById(R.id.view);
                    ll.setBackgroundColor(Color.GREEN);
                }
            });

            blue.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LinearLayout ll = (LinearLayout) findViewById(R.id.view);
                    ll.setBackgroundColor(Color.BLUE);
                }
            });

            red.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    LinearLayout ll = (LinearLayout) findViewById(R.id.view);
                    ll.setBackgroundColor(Color.RED);
                }
            });
    }
}