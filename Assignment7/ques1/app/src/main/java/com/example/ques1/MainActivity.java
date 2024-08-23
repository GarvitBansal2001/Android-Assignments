package com.example.ques1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Status : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"Activity Created");
        Toast.makeText(getApplicationContext(),"Activity Created",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"Activity Restarted");
        Toast.makeText(getApplicationContext(),"Activity Restarted",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"Activity Started");
        Toast.makeText(getApplicationContext(),"Activity Started",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"Activity Resumed");
        Toast.makeText(getApplicationContext(),"Activity Resumed",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"Activity Paused");
        Toast.makeText(getApplicationContext(),"Activity Paused",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"Activity Stopped");
        Toast.makeText(getApplicationContext(),"Activity Stopped",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"Activity Destroyed");
        Toast.makeText(getApplicationContext(),"Activity Destroyed",Toast.LENGTH_LONG).show();
    }
}