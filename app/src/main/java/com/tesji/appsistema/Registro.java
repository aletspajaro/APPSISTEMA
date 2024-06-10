package com.tesji.appsistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registro extends AppCompatActivity {
    private Button btnregreso;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btnregreso = findViewById(R.id.regreso2);

        btnregreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { RegresoReg();
            }
        });
    }
    void RegresoReg() {
        {
            Intent irInicio0 = new Intent(Registro.this, Inicio.class);
            startActivity(irInicio0);
            finish();
        }
    }}


