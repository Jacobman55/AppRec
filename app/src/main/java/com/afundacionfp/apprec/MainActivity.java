package com.afundacionfp.apprec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickProv (View view){
        Intent intent = new Intent(this, OrderListActivity.class);
        startActivity(intent);
    }
    public void onClickTienda(View view){
        Intent intent = new Intent(this, NewOrderActivity.class);
        startActivity(intent);
    }

}