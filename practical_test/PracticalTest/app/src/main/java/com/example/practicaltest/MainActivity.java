package com.example.practicaltest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationChannel channel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onclick(View V)
    {
        if(Build.VERSION.SDK_INT >=  Build.VERSION_CODES.O)
            channel = new NotificationChannel("MyNotification", "MyNotification", NotificationManager.IMPORTANCE_DEFAULT);
        NotificationManager manager = getSystemService(NotificationManager.class);
        manager.createNotificationChannel(channel);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "MyNotification")
                .setContentTitle("Hello!!")
                .setSmallIcon(R.drawable.ic_baseline_sms_24)
                .setContentText("Here's a message")
                .setAutoCancel(true);
        Intent notificationIntent = new Intent(this, SecondActivity.class);
        PendingIntent intent = PendingIntent.getActivity(this, 0, notificationIntent, 0);
        builder.setContentIntent(intent);
        NotificationManagerCompat manager1 = NotificationManagerCompat.from(this);
        manager1.notify(999, builder.build());
    }
}