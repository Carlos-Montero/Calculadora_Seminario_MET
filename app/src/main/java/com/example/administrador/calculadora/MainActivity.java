package com.example.administrador.calculadora;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.VolumeShaper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables que declaramos en MainActivity:
    String MESSAGE_KEY = "message";     //lo que pasamos a la otra activity
    String MESSAGE_KEY_2;               //lo que recibimos de la otra activity
    public String[] OPERATION_ARRAY;             //array de los valores que introducimos a la operacion
    int i=0;

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


    //CREAMOS TODAS LAS FUNCIONES PARA LOS BOTONES DE LA CALCULADORA

    //MENOS EL ENTER Y EL CE, TODAS CONCATENARAN LO QUE SALE DE SU BOTON CON EL OPERATION_ARRAY

    public void one(View v){
        Button b1 = (Button)findViewById(R.id.b1);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")         //Si es el primer valorque se añade al array
            {
            OPERATION_ARRAY[i]="1";
            }
        else {                                                      //Si no, hara la concatenacion
            String num = "1";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
            }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void two(View v){
        Button b2 = (Button)findViewById(R.id.b2);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="2";
        }
        else {
            String num = "2";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void three(View v){
        Button b3 = (Button)findViewById(R.id.b3);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="3";
        }
        else {
            String num = "3";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void four(View v){
        Button b4 = (Button)findViewById(R.id.b4);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="4";
        }
        else {
            String num = "4";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void five(View v){
        Button b5 = (Button)findViewById(R.id.b5);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="5";
        }
        else {
            String num = "5";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void six(View v){
        Button b6 = (Button)findViewById(R.id.b6);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="6";
        }
        else {
            String num = "6";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void seven(View v){
        Button b7 = (Button)findViewById(R.id.b7);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="7";
        }
        else {
            String num = "7";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void eight(View v){
        Button b8 = (Button)findViewById(R.id.b8);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="8";
        }
        else {
            String num = "8";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void nine(View v){
        Button b9 = (Button)findViewById(R.id.b9);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="9";
        }
        else {
            String num = "9";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void cero(View v){
        Button b0 = (Button)findViewById(R.id.b0);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="0";
        }
        else {
            String num = "0";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(num);
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    public void suma(View v){
        Button bsum = (Button)findViewById(R.id.bsum);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        i=i+1;
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="+";
        }
        else {
            String operador = "+";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(operador);
        }
        operacion.setText("");
        i=i+1;
    }


    public void resta(View v){
        Button bres = (Button)findViewById(R.id.bres);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="-";
        }
        else {
            String operador = "-";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(operador);
        }
        operacion.setText("");
    }


    public void multiplicacion(View v){
        Button bmul = (Button)findViewById(R.id.bmul);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="*";
        }
        else {
            String operador = "*";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(operador);
        }
        operacion.setText("");
    }


    public void division(View v){
        Button bdiv = (Button)findViewById(R.id.bdiv);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        if(OPERATION_ARRAY[i] == null || OPERATION_ARRAY[i]== "")
        {
            OPERATION_ARRAY[i]="/";
        }
        else {
            String operador = "/";
            OPERATION_ARRAY[i] = OPERATION_ARRAY[i].concat(operador);
        }
        operacion.setText("");
    }




    //AL DARLE AL CE, HAY QUE BOORAR EL OPERATION_ARRAY
    public void ce(View v){
        Button bce = (Button)findViewById(R.id.bce);
        TextView operacion = (TextView)findViewById(R.id.operacion);
        for(int i = 0; i < OPERATION_ARRAY.length; i++) {
            OPERATION_ARRAY[i] = "";
        }
        operacion.setText(OPERATION_ARRAY[i]);
    }


    //AHORA, AL DARLE AL ENTER, PROCESAREMOS LA OPERACION
    //Y, HAREMOS EL INTENT PARA PASARLE AL SecondActivity EL RESULTADO
    public void enter(View v){
        Button benter = (Button)findViewById(R.id.benter);
        //PROCESAMOS LA OPERRACION
        int cont = 0;
        float resultado = 0;
        resultado=Float.parseFloat(OPERATION_ARRAY.get(cont));
        cont++;
        while(cont<OPERATION_ARRAY.size()){
            if(OPERATION_ARRAY.get(cont)=="+"){
                resultado=resultado+Float.parseFloat(OPERATION_ARRAY.get(cont+1));
            }
            if(OPERATION_ARRAY.get(cont)=="-"){
                resultado=resultado-Float.parseFloat(OPERATION_ARRAY.get(cont+1));
            }
            if(OPERATION_ARRAY.get(cont)=="*"){
                resultado=resultado*Float.parseFloat(OPERATION_ARRAY.get(cont+1));
            }
            if(OPERATION_ARRAY.get(cont)=="/"){
                resultado=resultado/Float.parseFloat(OPERATION_ARRAY.get(cont+1));
            }
            cont=cont+2;
        }
        String result=Float.toString(resultado);
        //HACEMOS EL INTENT
        Intent i = new Intent(this,SecondActivity.class);
        String message="";
        i.putExtra(result,message);
        startActivity(i);
    }

//

}
