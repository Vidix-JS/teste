package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MilkDrink extends AppCompatActivity {
    private ImageButton btn_back;
    private Button btn_milk, btn_kefir, btn_ryazhenka, btn_milk_water;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_drink);

        btn_milk = (Button) findViewById(R.id.btn_milk);
        btn_milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast milkToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                milkToast.show();
            }
        });



        btn_kefir = (Button) findViewById(R.id.btn_kefir);
        btn_kefir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast kefirToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                kefirToast.show();
            }
        });



        btn_ryazhenka = (Button) findViewById(R.id.btn_ryazhenka);
        btn_ryazhenka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast ryazToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                ryazToast.show();
            }
        });



        btn_milk_water = (Button) findViewById(R.id.btn_milk_water);
        btn_milk_water.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast mwToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                mwToast.show();
            }
        });



        btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MilkDrink.this, MilkActitvity.class);

                startActivity(o);
            }
        });
    }
}