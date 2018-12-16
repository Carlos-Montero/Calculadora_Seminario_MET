package com.example.administrador.calculadora;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables que declaramos en MainActivity:
        //El resultado de la operacion, que lo pasaremos a la SecondActivity
        String MESSAGE_KEY = "message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Para controlar o escuchar los inputs, creamos los objetos View y los asociamos a los objetos del Layout
        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        Button b4 = (Button)findViewById(R.id.b4);
        Button b5 = (Button)findViewById(R.id.b5);
        Button b6 = (Button)findViewById(R.id.b6);
        Button b7 = (Button)findViewById(R.id.b7);
        Button b8 = (Button)findViewById(R.id.b8);
        Button b9 = (Button)findViewById(R.id.b9);
        Button b0 = (Button)findViewById(R.id.b0);
        Button bsum = (Button)findViewById(R.id.bsum);
        Button bres = (Button)findViewById(R.id.bres);
        Button bmul = (Button)findViewById(R.id.bmul);
        Button bdiv = (Button)findViewById(R.id.bdiv);
        Button benter = (Button)findViewById(R.id.benter);
        Button bce = (Button)findViewById(R.id.bce);
        TextView operacion = (TextView)findViewById(R.id.operacion);
    }















    //Haremos un Intent para pasar a la ActivitySecond el resultado de la operacion:
    //(Debido a la division, "resultado" lo declaramos como float)
    public void lanzarSecondActivity(View v, float resultado){
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("resultado",resultado);
        startActivity(intent);
    }










}








