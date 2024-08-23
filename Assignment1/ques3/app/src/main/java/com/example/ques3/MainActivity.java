package com.example.ques3;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t;
    Button b1;
    Button b2;
    Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = (TextView) findViewById(R.id.textview1);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
    }

    public void onClick (View v){
        int i = Integer.parseInt((String) t.getText());
        if(v.getId() == b1.getId())
            i = 0;
        else if(v.getId() == b2.getId())
            i++;
        else if(v.getId() == b3.getId())
            i--;
        t.setText(Integer.toString(i));
    }
}