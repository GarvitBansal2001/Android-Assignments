package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CheckBox c1;
    CheckBox c2;
    CheckBox c3;
    CheckBox c4;
    TextView t;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.checkBox);
        c2 = (CheckBox) findViewById(R.id.checkBox2);
        c3 = (CheckBox) findViewById(R.id.checkBox3);
        c4 = (CheckBox) findViewById(R.id.checkBox4);
        t = (TextView) findViewById(R.id.textView8);
        b = (Button) findViewById(R.id.button);
    }

    public void onClick (View v){
        int i = 0;
        if(v.getId() == b.getId()){
            if(c1.isChecked())
                i = i+300;
            if(c2.isChecked())
                i = i+250;
            if(c3.isChecked())
                i = i+150;
            if(c4.isChecked())
                i = i+200;
        }
        String s = "Total : "+Integer.toString(i);
        t.setText(s);
    }
}