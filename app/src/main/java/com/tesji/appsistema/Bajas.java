package com.tesji.appsistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bajas extends AppCompatActivity {

    private Button btnregresb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bajas);

        btnregresb = findViewById(R.id.regresoB);

        btnregresb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { RegresoBaj();
            }
        });
    }
    void RegresoBaj() {
        {
            Intent irbaj = new Intent(Bajas.this, Inicio.class);
            startActivity(irbaj);
            finish();
        }
    }}

