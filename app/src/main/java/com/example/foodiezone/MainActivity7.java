package com.example.foodiezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {
    EditText name ;
    EditText email;
    EditText phonenumber;
    EditText address;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        name = (EditText)findViewById(R.id.name);
        email = (EditText)findViewById(R.id.email);
        phonenumber = (EditText)findViewById(R.id.phonenumber);
        address = (EditText)findViewById(R.id.address);
        submit =(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                details();
            }
        });
    }
    public void details(){
        Toast.makeText(MainActivity7.this,"Details Added",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity7.this,MainActivity8.class);
        startActivity(intent);
    }
}
