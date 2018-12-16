package com.example.administrador.calculadora;

        import android.content.DialogInterface;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

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

        //Recogemos "resultado" del Intent



        //Mostramos el resultado en el TextBox "resultado"


    }






    //Boton para volver a la MainActivity con resultado a 0







    //Boton para volver a la MainActivity manteniendo el resultado






    //Boton para sumar 1




    //Boton para cerrar la App
    public void closeApp(View v){
        finish();
        System.exit(0);
    }














}



