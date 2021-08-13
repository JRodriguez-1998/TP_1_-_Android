package com.example.tpn1_android;

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

    public void ejercicio1(View view){
        Intent i = new Intent(this, ejercicio1.class);
        startActivity(i);
    }

    public void ejercicio2(View view){
        Intent i = new Intent(this, ejercicio2.class);
        startActivity(i);
    }
}