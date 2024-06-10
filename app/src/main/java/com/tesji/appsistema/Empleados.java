package com.tesji.appsistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Empleados extends AppCompatActivity {

    private Button btnregres3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empleados);

        btnregres3 = findViewById(R.id.regreso3);

        btnregres3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { RegresoEmp();
            }
        });
    }
    void RegresoEmp() {
        {
            Intent irInicio = new Intent(Empleados.this, Inicio.class);
            startActivity(irInicio);
            finish();
        }
    }}



