package com.example.foodiezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Next();
            }
        });
    }
    public void Next(){
        Toast.makeText(MainActivity3.this,"Menu page opened",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity3.this,MainActivity4.class);
        startActivity(intent);
    }

}