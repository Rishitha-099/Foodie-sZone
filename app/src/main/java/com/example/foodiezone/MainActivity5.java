package com.example.foodiezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    TextView listView,priceView;
    Button locbutton;
    String list_choice;
    Double price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        locbutton = (Button)findViewById(R.id.locbutton);
        listView = (TextView)findViewById(R.id.listView);
        priceView = (TextView)findViewById(R.id.priceView);
        locbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                location();
            }
        });

        Bundle bundle = getIntent().getExtras();
        list_choice = bundle.getString("choices");
        price = bundle.getDouble("price");
        listView.setText(list_choice);
        priceView.setText("Total bill :"+price.toString());
    }
    public void location(){
        Toast.makeText(MainActivity5.this,"My Location",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity5.this,MainActivity6.class);
        startActivity(intent);
    }
}