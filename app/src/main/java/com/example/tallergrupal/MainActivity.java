package com.example.tallergrupal;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Enlazar variables con objetos del XML con findViewById
    /*Declaracion de variables para manipular los objetos del diseño grafico*/
   
    private TextView txtResultado;
    private EditText txtcontrasenia;
    private EditText txtUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtResultado = (TextView) findViewById(R.id.resultado);// referencia al componente para mostrar la vista
        txtUsuario = (EditText) findViewById(R.id.username);
        txtcontrasenia = (EditText) findViewById(R.id.password);

    }

    public void validarLogin(View vista){

        if(txtUsuario.getText().toString().equals("kevin") && txtcontrasenia.getText().toString().equals("kevin")){
            txtResultado.setText("Acceso Exitoso");
        }else{
            txtResultado.setText("Acceso Denegado");
        }

    }

}