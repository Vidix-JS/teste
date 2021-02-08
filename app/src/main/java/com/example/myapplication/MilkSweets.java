package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MilkSweets extends AppCompatActivity {

    private ImageButton btn_back;
    private Button glazed_curds, pudding, milk_yogurt, ice_cream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_sweets);

        glazed_curds = (Button) findViewById(R.id.glazed_curds);
        glazed_curds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast gcToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                gcToast.show();
            }
        });



        pudding = (Button) findViewById(R.id.pudding);
        pudding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast pudToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                pudToast.show();
            }
        });



        milk_yogurt = (Button) findViewById(R.id.milk_yogurt);
        milk_yogurt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast myToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                myToast.show();
            }
        });



        ice_cream = (Button) findViewById(R.id.ice_cream);
        ice_cream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast icToast = Toast.makeText(getApplicationContext(),
                        "Продукт добавлен в корзину",
                        Toast.LENGTH_SHORT);
                icToast.show();
            }
        });



        btn_back = (ImageButton) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(MilkSweets.this, MilkActitvity.class);

                startActivity(o);
            }
        });
    }
}