package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton rb;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = (RadioGroup) findViewById(R.id.radiogroup);
        t = (TextView) findViewById(R.id.textView);
        rg.setOnCheckedChangeListener(this::onCheckedChanged);
    }

    public void onCheckedChanged(RadioGroup rg , int i){
        rb = findViewById(i);
        t.setText(rb.getText().toString());
    }
}