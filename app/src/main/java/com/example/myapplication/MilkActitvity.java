        package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.time.Instant;

public class MilkActitvity extends AppCompatActivity {

    private ImageButton btn_back;

    private Button btn_chs, btn_milk_drink, btn_milk_sweets, butter, spread;

    public Integer chs = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_actitvity);


        /*СЫР*/
        btn_chs = (Button) findViewById(R.id.btn_chs);
        btn_chs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast chsToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                chsToast.show();
                chs++;
            }
        });


        /*МОЛОЧНЫЕ НАПИТКИ*/
        btn_milk_drink = (Button) findViewById(R.id.btn_milk_drink);
        btn_milk_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mdIntent = new Intent(MilkActitvity.this, MilkDrink.class);
                startActivity(mdIntent);
            }
        });


        /*СЛАДОСТИ МОЛОЧНЫЕ*/
        btn_milk_sweets = (Button) findViewById(R.id.milk_sweets);
        btn_milk_sweets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent msIntent = new Intent(MilkActitvity.this, MilkSweets.class);
                startActivity(msIntent);
            }
        });


        /*СЛИВОЧНОЕ МАСЛО*/
        butter = (Button) findViewById(R.id.butter);
        butter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast butToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                butToast.show();
            }
        });


        /*СПРЕД*/
        spread = (Button) findViewById(R.id.spread);
        spread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast sprToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                sprToast.show();
            }
        });



        btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MilkActitvity.this, MainActivity.class);

                startActivity(o);
            }
        });
    }
}