package com.example.administrador.calculadora;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    //Declaramos la variable para obtener los datos de la MainActivity
    String MESSAGE_KEY = "message";
    //Declaramos una variable float para ir actualizando el valor actual del resultado
    public float resultadoActual;
    //Declaramos otra variable para volver a pasarle datos a la MainActivity
    String MESSAGE_KEY_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //creamos los objetos View y los asociamos a los objetos del Layout
        Button result0 = (Button)findViewById(R.id.result0);
        Button close = (Button)findViewById(R.id.close);
        Button keepres = (Button)findViewById(R.id.keepres);
        Button add1 = (Button)findViewById(R.id.add1);
        TextView resultado = (TextView)findViewById(R.id.resultado);

        //Recogemos lo que nos llega del Intent
        Intent intent = getIntent();
        String result = intent.getStringExtra(MESSAGE_KEY);
        //Mostramos el resultado en el TextBox "resultado"
        resultado.setText(result);
        //Tenemos result en el TextBox como un string, para operar con el, habrá que pasarlo a float
        //y actualizamos el valor de la variable float resultadoActual
        resultadoActual=Float.parseFloat(result);
    }


    //Boton para volver a la MainActivity con resultado a 0
    //no le pasamos ningun valor, ya que queremos que la MainActivity empiece a 0
    public void returnWith0(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    //Boton para volver a la MainActivity manteniendo el resultado
    public void returnWithResult(){
        MESSAGE_KEY_2=String.valueOf(resultadoActual);
        Intent intent = new Intent(this, MainActivity.class);
        String message="";
        intent.putExtra(MESSAGE_KEY_2,message);    //DA UN ERROR XQ DICE QUE LA VARIABLE NO ESTÁ INICIALIZADA (EN TEORIA NO TIENE QUE ESTAR INICIALIZADA)
        startActivity(intent);
    }



    //Boton para sumar 1
    public void addOne(){
        //creamos el objeto View para utilizarlo dentro de la funcion
        TextView resultado = (TextView)findViewById(R.id.resultado);
        //le sumamos 1 a la variable resultado actual
        resultadoActual=resultadoActual+1;
        //lo actualizamos en el TextBox
        String resultadoMasUno=String.valueOf(resultadoActual);
        resultado.setText(resultadoMasUno);
        //En vez de meterlo en el TextBox como un float, lo he pasado a String primero
    }


    //Boton para cerrar la App
    public void closeApp(View v){
        finish();
        System.exit(0);
    }














}



