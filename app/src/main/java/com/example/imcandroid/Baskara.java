package com.example.imcandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Baskara extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText a = findViewById(R.id.variavel1);
        EditText b = findViewById(R.id.variavel2);
        EditText c = findViewById(R.id.variavel3);
        TextView resultado= findViewById(R.id.resultado);
        Button calcular = findViewById(R.id.calcular);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularbaskara();
            }
        });
    }


        private void calcularbaskara() {
            double a = Double.parseDouble(EditText.getText().toString());
            double b = Double.parseDouble(EditText.getText().toString());
            double c = Double.parseDouble(EditText.getText().toString());

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            } else if (discriminant == 0) {
                double root = -b / (2 * a);

            } else {
                double realPart = -b / (2 * a);
                double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            }
        }
    }
