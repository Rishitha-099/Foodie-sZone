package com.example.foodiezone;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);
        button3 =(Button)findViewById(R.id.button3);
        button4 =(Button)findViewById(R.id.button4);
        button5 =(Button)findViewById(R.id.button5);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Toast.makeText(this,"CrossRoads Menu Description page is opened",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"Southern Spice Menu Description page is opened ",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button3:
                Toast.makeText(this,"Tabla Menu Description page is opened",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:
                Toast.makeText(this,"RR Durbar Menu Description page is opened",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button5:
                Toast.makeText(this,"Seven Days Menu Description page is opened",Toast.LENGTH_SHORT).show();
                break;
        }
        Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(intent);
    }
}