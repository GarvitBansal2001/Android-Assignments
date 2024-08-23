package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t1;
    EditText t2;
    Button b1;
    Button b2;
    TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.editTextTextPersonName);
        t2 = (EditText) findViewById(R.id.editTextTextPassword);
        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        t = (TextView) findViewById(R.id.textView2);
    }

    public void onClick (View v) {
        if(v.getId() == b1.getId())
        {
            t1.setText("");
            t2.setText("");
            t.setText("");
        }
        if(v.getId() == b2.getId())
        {
            if(t1.getText().toString().equals("Magna") && t2.getText().toString().equals("Magna"))
                t.setText("Login Successful");
            else
                t.setText("Login Failed");
        }
    }
}