package com.example.pruebacomponentes;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Prueba extends AppCompatActivity {

    /*atributos que haran referencia a los objetos */
    private TextView txtVista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);

        //referenciar a los objetos de la pantalla XML para usar en Java
        txtVista = (TextView) findViewById(R.id.txtVista); // findVIewById retorna un View

    }//main

    /**
     * Meotodo para ejecutar con el click del boton
     *
     * :para que funcione est emetodo en el XML hay que inicializar  el evento onClick del objeto button
     */
    public void accion(View vista){
        txtVista.setText("Click en el boton...");
    }
}
