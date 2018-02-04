package com.example.android.venessa_1202150247_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.android.venessa_1202150247_modul1.R;
import com.example.android.venessa_1202150247_modul1.review_pesanan;

public class MainActivity extends AppCompatActivity {

    EditText et_food, et_portion;
    Intent intent;
    String restaurant, menu;
    int portion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_food = (EditText)findViewById(R.id.et_food);
        et_portion = (EditText)findViewById(R.id.et_portion);
        intent = new Intent(this, review_pesanan.class);
    }

    public void on_eat_bus(View view) {

        menu = et_food.getText().toString();
        restaurant = "EATBUS";
        portion = Integer.parseInt(et_portion.getText().toString());
        int total = 50000 * portion; //untuk total harga makanan yg di pesan
        Log.d("TOTAL HARGA","Rp."+total); // untuk menampilkan total harga di logcat
        intent.putExtra("restaurant", restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("portion", portion);
        intent.putExtra("price", total);
        startActivity(intent);
    }

    public void on_abnormal(View view) {

        menu = et_food.getText().toString();
        restaurant = "ABNORMAL";
        portion = Integer.parseInt(et_portion.getText().toString());
        int total = 30000 * portion;
        intent.putExtra("restaurant", restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("portion", portion);
        intent.putExtra("price", total);
        Log.d("TOTAL HARGA", "Rp."+total);
        startActivity(intent);
    }
}
