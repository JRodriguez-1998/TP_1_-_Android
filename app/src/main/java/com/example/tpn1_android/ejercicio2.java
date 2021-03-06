package com.example.tpn1_android;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ejercicio2 extends AppCompatActivity {

    Button btnCero, btnUno, btnDos, btnTres, btnCuatro, btnCinco, btnSeis, btnSiete, btnOcho, btnNueve,
            btnIgual, btnSuma, btnResta, btnMultiplicar, btnDividir, btnLimpiar;
    TextView txtProceso, txtConcatenar;
    Double numero1, numero2, resultado;
    String operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        //Boton ← del ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        btnCero = (Button) findViewById(R.id.btnCero);
        btnUno = (Button) findViewById(R.id.btnUno);
        btnDos = (Button) findViewById(R.id.btnDos);
        btnTres = (Button) findViewById(R.id.btnTres);
        btnCuatro = (Button) findViewById(R.id.btnCuatro);
        btnCinco = (Button) findViewById(R.id.btnCinco);
        btnSeis = (Button) findViewById(R.id.btnSeis);
        btnSiete = (Button) findViewById(R.id.btnSiete);
        btnOcho = (Button) findViewById(R.id.btnOcho);
        btnNueve = (Button) findViewById(R.id.btnNueve);
        btnIgual = (Button) findViewById(R.id.btnIgual);
        btnSuma = (Button) findViewById(R.id.btnSumar);
        btnResta = (Button) findViewById(R.id.btnRestar);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);
        btnLimpiar = (Button) findViewById(R.id.btnBorrar);
        txtProceso = (TextView) findViewById(R.id.txtResultado);

        btnCero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "0");
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "1");
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "2");
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "3");
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "4");
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "5");
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "6");
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "7");
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "8");
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                txtProceso.setText(txtConcatenar.getText().toString() + "9");
            }
        });

        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!txtProceso.getText().toString().isEmpty()){
                    operador = "+";
                    txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                    numero1 = Double.parseDouble(txtConcatenar.getText().toString());
                    txtProceso.setText("");
                }
                else
                    Toast.makeText(ejercicio2.this,"Error debe ingresar previamente un número",Toast.LENGTH_LONG).show();
            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtProceso.getText().toString().isEmpty()){
                    operador = "-";
                    txtConcatenar =  (TextView) findViewById(R.id.txtResultado);
                    numero1 = Double.parseDouble(txtConcatenar.getText().toString());
                    txtProceso.setText("");
                }
                else
                    Toast.makeText(ejercicio2.this,"Error debe ingresar previamente un número",Toast.LENGTH_LONG).show();
            }
        });

        btnLimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                txtProceso.setText("");
                numero2 = 0.0;
                numero1 = 0.0;
            }
        });


        btnIgual.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                //Verifica que se hayan ingresado los numeros
                if(!txtProceso.getText().toString().isEmpty()){
                    txtConcatenar = (TextView) findViewById(R.id.txtResultado);
                    numero2 = Double.parseDouble(txtConcatenar.getText().toString());
                    //En caso de que no se ingrese un segundo numero y se presione el boton igual"
                    if(operador==null){
                        Toast.makeText(ejercicio2.this,"Falta segundo numero",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //En caso de que sea suma
                        if(operador.equals("+")){
                        txtProceso.setText("");
                        resultado=numero1+numero2;
                        }
                        //En caso de que sea resta
                        if(operador.equals("-")){
                            txtProceso.setText("");
                            resultado=numero1-numero2;
                        }
                        //En caso de que sea multiplicacion
                        if(operador.equals("*")){
                            txtProceso.setText("");
                            resultado=numero1*numero2;
                        }
                        //En caso de que sea division
                        if(operador.equals("/")){
                            txtProceso.setText("");
                            if(numero2 != 0){
                                resultado = numero1/numero2;
                            }else {
                                txtProceso.setText("Infinito");
                            }
                        }

                        // Si tiene decimales, muestro hasta 7, si no ninguno.
                        String resultadoStr = new DecimalFormat("#.#######").format(resultado);

                        txtProceso.setText(resultadoStr);
                    }
                }
                else
                    Toast.makeText(ejercicio2.this,"Error debe ingresar previamente un número",Toast.LENGTH_SHORT).show();
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtProceso.getText().toString().isEmpty()){
                    operador = "*";
                    txtConcatenar =  (TextView) findViewById(R.id.txtResultado);
                    numero1 = Double.parseDouble(txtConcatenar.getText().toString());
                    txtProceso.setText("");
                }
                else
                    Toast.makeText(ejercicio2.this,"Error debe ingresar previamente un número",Toast.LENGTH_LONG).show();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!txtProceso.getText().toString().isEmpty()){
                    operador = "/";
                    txtConcatenar =  (TextView) findViewById(R.id.txtResultado);
                    numero1 = Double.parseDouble(txtConcatenar.getText().toString());
                    txtProceso.setText("");
                }
                else
                    Toast.makeText(ejercicio2.this,"Error debe ingresar previamente un número",Toast.LENGTH_LONG).show();
            }
        });
    }
}