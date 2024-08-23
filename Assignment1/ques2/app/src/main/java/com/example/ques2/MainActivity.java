package com.example.ques2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout r;
    Button B1;
    Button B2;
    Button B3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = (RelativeLayout) findViewById(R.id.layout1);
        B1 = (Button) findViewById(R.id.button1);
        B2 = (Button) findViewById(R.id.button2);
        B3 = (Button) findViewById(R.id.button3);
    }

    public void onClick(View v){
        if(v.getId() == B1.getId())
            r.setBackgroundColor(Color.CYAN);
        if(v.getId() == B2.getId())
            r.setBackgroundColor(Color.WHITE);
        if(v.getId() == B3.getId())
            r.setBackgroundColor(Color.MAGENTA);
    }
}