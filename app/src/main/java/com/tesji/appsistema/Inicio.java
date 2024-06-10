package com.tesji.appsistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {
    private Button btnregist;
    private Button btnemplead;
    private Button btnbaja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnregist = findViewById(R.id.registro);
        btnemplead = findViewById(R.id.empledos);
        btnbaja = findViewById(R.id.bajas);


        btnemplead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IniEmp();

            }
        });
        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IniciarRegistro();
            }
        });
        btnbaja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IniBaj();

            }
        });
    }

    void IniciarRegistro() {
        {
            Intent irInicio = new Intent(Inicio.this, Registro.class);
            startActivity(irInicio);
            finish();
        }
    }

    void IniEmp() {
        {
            Intent irInicio2 = new Intent(Inicio.this, Empleados.class);
            startActivity(irInicio2);
            finish();
        }
    }

    void IniBaj() {
        {
            Intent irInicio3 = new Intent(Inicio.this, Bajas.class);
            startActivity(irInicio3);
            finish();
        }
    }
}




