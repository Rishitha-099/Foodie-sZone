package com.example.foodiezone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    Button vegbutton,cutletbutton,cornbutton,manchuriabutton,eggbutton,lollibutton,chickenbutton,frankiebutton,vegbiryanibutton,mealbutton,paneerbutton,nvbiryanibutton,ccurrybutton,chapathibutton,chocobutton,gulabbutton,kheerbutton,thumsupbutton,dewbutton,frootibutton;
    String choices="";
    Double price=0.00;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        vegbutton = (Button)findViewById(R.id.vegbutton);
        cutletbutton = (Button)findViewById(R.id.cutletbutton);
        cornbutton = (Button)findViewById(R.id.cornbutton);
        manchuriabutton = (Button)findViewById(R.id.manchuriabutton);
        eggbutton = (Button)findViewById(R.id.eggbutton);
        lollibutton = (Button)findViewById(R.id.lollibutton);
        chickenbutton = (Button)findViewById(R.id.chickenbutton);
        frankiebutton = (Button)findViewById(R.id.frankiebutton);
        vegbiryanibutton = (Button)findViewById(R.id.vegbiryanibutton);
        mealbutton = (Button)findViewById(R.id.mealbutton);
        paneerbutton = (Button)findViewById(R.id.paneerbutton);
        nvbiryanibutton = (Button)findViewById(R.id.nvbiryanibutton);
        ccurrybutton = (Button)findViewById(R.id.ccurrybutton);
        chapathibutton= (Button)findViewById(R.id.chapathibutton);
        chocobutton = (Button)findViewById(R.id.chocobutton);
        gulabbutton = (Button)findViewById(R.id.gulabbutton);
        kheerbutton = (Button)findViewById(R.id.kheerbutton);
        thumsupbutton = (Button)findViewById(R.id.thumsupbutton);
        dewbutton = (Button)findViewById(R.id.dewbutton);
        frootibutton = (Button) findViewById(R.id.frootibutton);
    }
    public void add_to_list(View view) {
        if (view == findViewById(R.id.vegbutton)) {
            Toast.makeText(MainActivity4.this,"Veg Frankie is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Veg Frankie" + "\n";
            price = price + 50;
        } else if (view == findViewById(R.id.cutletbutton)) {
            Toast.makeText(MainActivity4.this,"Veg Cutlet is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Veg Cutlet" + "\n";
            price = price + 30;
        } else if (view == findViewById(R.id.cornbutton)) {
            Toast.makeText(MainActivity4.this,"Crispy Corn is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Crispy Corn" + "\n";
            price = price + 40;
        } else if (view == findViewById(R.id.manchuriabutton)) {
            Toast.makeText(MainActivity4.this,"Veg Manchuria is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Veg Manchuria" + "\n";
            price = price + 40;
        } else if (view == findViewById(R.id.eggbutton)) {
            Toast.makeText(MainActivity4.this,"Egg Cutlet is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Egg Cutlet" + "\n";
            price = price + 40;
        } else if (view == findViewById(R.id.lollibutton)) {
            Toast.makeText(MainActivity4.this,"Chicken Lollipop is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Chicken Lollipop" + "\n";
            price = price + 100;
        } else if (view == findViewById(R.id.chickenbutton)) {
            Toast.makeText(MainActivity4.this,"Chicken Manchuria is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Chicken Manchuria" + "\n";
            price = price + 100;
        } else if (view == findViewById(R.id.frankiebutton)) {
            Toast.makeText(MainActivity4.this,"Chicken Frankie is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Chicken Frankie" + "\n";
            price = price + 80;
        } else if (view == findViewById(R.id.vegbiryanibutton)) {
            Toast.makeText(MainActivity4.this,"Veg Biryani is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Veg Biryani" + "\n";
            price = price + 150;
        } else if (view == findViewById(R.id.mealbutton)) {
            Toast.makeText(MainActivity4.this,"Plain Meals is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Plain Meals" + "\n";
            price = price + 120;
        } else if (view == findViewById(R.id.paneerbutton)) {
            Toast.makeText(MainActivity4.this,"Paneer Curry is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Paneer Curry" + "\n";
            price = price + 150;
        } else if (view == findViewById(R.id.nvbiryanibutton)) {
            Toast.makeText(MainActivity4.this,"Chicken Biryani is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Chicken Biryani" + "\n";
            price = price + 250;
        } else if (view == findViewById(R.id.ccurrybutton)) {
            Toast.makeText(MainActivity4.this,"Chicken Curry is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Chicken Curry" + "\n";
            price = price + 150;
        } else if (view == findViewById(R.id.chapathibutton)) {
            Toast.makeText(MainActivity4.this,"Chapathi is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Chapathi" + "\n";
            price = price + 20;
        } else if (view == findViewById(R.id.chocobutton)) {
            Toast.makeText(MainActivity4.this,"Choco Pudding is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Choco Pudding" + "\n";
            price = price + 50;
        } else if (view == findViewById(R.id.gulabbutton)) {
            Toast.makeText(MainActivity4.this,"Gulab Jamun is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Gulab Jamun" + "\n";
            price = price + 30;
        } else if (view == findViewById(R.id.kheerbutton)) {
            Toast.makeText(MainActivity4.this,"Kheer is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Kheer" + "\n";
            price = price + 50;
        } else if (view == findViewById(R.id.thumsupbutton)) {
            Toast.makeText(MainActivity4.this,"Thumsup is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Thumsup" + "\n";
            price = price + 30;
        } else if (view == findViewById(R.id.dewbutton)) {
            Toast.makeText(MainActivity4.this,"Mountain Dew is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Mountain Dew" + "\n";
            price = price + 30;
        } else if (view == findViewById(R.id.frootibutton)) {
            Toast.makeText(MainActivity4.this,"Frooti is added",Toast.LENGTH_SHORT).show();
            choices = choices + "Frooti" + "\n";
            price = price + 30;
        }
    }
    public void PlaceOrder(View view){
        Toast.makeText(MainActivity4.this,"Order Placed",Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity4.this,MainActivity5.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices",choices);
        bundle.putDouble("price",price);
        i.putExtras(bundle);
        startActivity(i);
    }

}