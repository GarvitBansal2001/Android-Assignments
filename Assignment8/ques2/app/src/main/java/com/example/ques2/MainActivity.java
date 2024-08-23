package com.example.ques2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText tv = null;
    EditText pass = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (EditText) findViewById(R.id.editTextTextPersonName);
        pass = (EditText) findViewById(R.id.editTextTextPassword);

    }

    public void onClick(View v) {
        String a = tv.getText().toString();
        String b = pass.getText().toString();
        if (a.equals("Magna") && b.equals("garvit")) {
            Toast.makeText(getApplicationContext(), "You have successfully Logged In", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this,MainActivity2.class);
            intent.putExtra("Key", "Welcome "+a);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "You have entered wrong Username or Password", Toast.LENGTH_LONG).show();
        }
    }
}