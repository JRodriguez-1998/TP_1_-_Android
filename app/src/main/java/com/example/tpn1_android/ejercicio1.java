package com.example.tpn1_android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class ejercicio1 extends AppCompatActivity {

    private EditText numero1;
    private EditText numero2;
    private TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        numero1 = findViewById(R.id.txtPrimerNumero);
        numero2 = findViewById(R.id.txtSegundoNumero);
        resultado = findViewById(R.id.tvResultado);

        //Boton ← del ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void calcular(View view) {
        Integer num1 = Integer.parseInt(numero1.getText().toString());
        Integer num2 = Integer.parseInt(numero2.getText().toString());

        String res = String.valueOf(num1 + num2);
        resultado.setText(res);
    }
}