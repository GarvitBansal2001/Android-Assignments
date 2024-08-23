package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ET;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        ET = (EditText)findViewById(R.id.editTextTextPersonName);
        String messageText = ET.getText().toString();
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(MainActivity2.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }
}