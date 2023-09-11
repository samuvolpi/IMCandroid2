package com.example.imcandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText Nome = findViewById(R.id.txtnome);
        EditText Idade = findViewById(R.id.txtidade);
        EditText Peso = findViewById(R.id.txtpeso);
        EditText Altura = findViewById(R.id.txtaltura);
        Button Calcular = findViewById(R.id.btncalcular);
        TextView Resultado = findViewById(R.id.txtresultado);

        int peso = Integer.parseInt(Peso.getText().toString());
        float altura = Float.parseFloat(Altura.getText().toString());

        float resultado = peso / (altura * altura);
        if(resultado < 19){

            Resultado.setText("Abaixo do peso!");
        }
        else if(resultado > 32){

            Resultado.setText("Acima do peso!");
        }
        else{

            Resultado.setText("Peso ok!");
        }
    }


    }
