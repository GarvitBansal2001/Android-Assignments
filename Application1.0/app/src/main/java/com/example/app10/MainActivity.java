package com.example.app10;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView t2;
    TextView t3;
    TextView t4;
    Button b;
    boolean flag = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
        b = (Button) findViewById(R.id.button);
    }
    public void onClick (View v) {
        if (!flag) {
            flag = true;
            b.setText("Hide");
            t2.setVisibility(TextView.VISIBLE);
            t3.setVisibility(TextView.VISIBLE);
            t4.setVisibility(TextView.VISIBLE);
        }
        else
        {
            flag = false;
            b.setText("Show");
            t2.setVisibility(TextView.INVISIBLE);
            t3.setVisibility(TextView.INVISIBLE);
            t4.setVisibility(TextView.INVISIBLE);
        }
    }
}