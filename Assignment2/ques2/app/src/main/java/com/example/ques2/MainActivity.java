package com.example.ques2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean flag = false;
    boolean dflag = false;
    int op = 0;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b10;
    Button b11;
    Button b12;
    Button b13;
    Button b14;
    Button b15;
    Button b16;
    Button b18;
    Button b19;
    Button b20;
    Button b21;
    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        b18 = (Button) findViewById(R.id.button18);
        b19 = (Button) findViewById(R.id.button19);
        b20 = (Button) findViewById(R.id.button20);
        b21 = (Button) findViewById(R.id.button21);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (TextView) findViewById(R.id.textView2);
        t3 = (TextView) findViewById(R.id.textView3);
        t4 = (TextView) findViewById(R.id.textView4);
    }

    public void onClick1 (View v){
        int i = 0;
        if(v.getId() == b1.getId())
            i = 7;
        if(v.getId() == b2.getId())
            i = 8;
        if(v.getId() == b3.getId())
            i = 9;
        if(v.getId() == b4.getId())
            i = 4;
        if(v.getId() == b5.getId())
            i = 5;
        if(v.getId() == b6.getId())
            i = 6;
        if(v.getId() == b7.getId())
            i = 1;
        if(v.getId() == b8.getId())
            i = 2;
        if(v.getId() == b9.getId())
            i = 3;
        if(v.getId() == b18.getId())
        {
            t1.setText("0");
            t2.setText("0");
            t3.setText("");
            t4.setText("0");
            flag=dflag=false;
            i = 0;
            return;
        }
        if(v.getId() == b21.getId())
        {
            if(!flag)
                t1.setText(t1.getText().toString()+".");
            if(flag)
                t2.setText(t2.getText().toString()+".");
            dflag = true;
            return;
        }
        if(!flag && t1.getText().toString().length()<9 && !dflag)
            t1.setText(Integer.toString(Integer.parseInt(t1.getText().toString()+Integer.toString(i))));
        if(flag && t2.getText().toString().length()<9 && !dflag)
            t2.setText(Integer.toString(Integer.parseInt(t2.getText().toString()+Integer.toString(i))));
        if(!flag && t1.getText().toString().length()<9 && dflag)
            t1.setText(Float.toString(Float.parseFloat(t1.getText().toString()+Integer.toString(i))));
        if(flag && t2.getText().toString().length()<9 && dflag)
            t2.setText(Float.toString(Float.parseFloat(t2.getText().toString()+Integer.toString(i))));
    }

    public void onClick2 (View v){
        flag = true;
        float result = 0;
        float a = Float.parseFloat(t1.getText().toString());
        float b = Float.parseFloat(t2.getText().toString());
        if(v.getId() == b13.getId())
        {
            t3.setText("+");
            dflag = false;
            op = 1;
        }
        if(v.getId() == b14.getId())
        {
            t3.setText("-");
            dflag = false;
            op = 2;
        }
        if(v.getId() == b15.getId())
        {
            t3.setText("/");
            dflag = false;
            op = 3;
        }
        if(v.getId() == b10.getId())
        {
            t3.setText("+*");
            dflag = false;
            op = 4;
        }
        if(v.getId() == b12.getId())
        {
            t3.setText("^");
            dflag = false;
            op = 5;
        }
        if(v.getId() == b20.getId())
        {
            t3.setText("%");
            dflag = false;
            flag = false;
            op = 6;
        }
        if(v.getId() == b16.getId())
        {
            switch(op)
            {
                case 1: result = a+b;
                        break;
                case 2: result = a-b;
                        break;
                case 3: result = a/b;
                        break;
                case 4: result = a*b;
                        break;
                case 5: result = (float) Math.pow(a,b);
                        break;
                case 6: result = a/100;
                        break;
            }
            dflag = false;
            t4.setText(Float.toString(result));
        }
    }
}