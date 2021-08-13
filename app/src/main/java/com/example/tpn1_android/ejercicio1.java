package com.example.tpn1_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class ejercicio1 extends AppCompatActivity {

    private EditText numero1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        numero1 = findViewById(R.id.txtPrimerNumero);
    }
}