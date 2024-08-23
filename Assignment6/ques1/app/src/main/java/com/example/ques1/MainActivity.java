package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et;
    EditText pw;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText) findViewById(R.id.editTextTextPersonName);
        pw = (EditText) findViewById(R.id.editTextTextPassword);
        b = (Button) findViewById(R.id.button2);
    }

    public void onClick (View v){
        if(et.getText().toString().equals("Magna") && pw.getText().toString().equals("Magna"))
        {
            Intent i = new Intent(this,Logout.class);
            startActivity(i);
        }
        else
            Toast.makeText(getApplicationContext(),"Invalid User Or Password!!",Toast.LENGTH_LONG).show();
    }
}