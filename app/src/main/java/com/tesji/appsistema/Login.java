package com.tesji.appsistema;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class Login extends AppCompatActivity {
    private TextInputEditText txusuario;
    private TextInputEditText txcontrasenia;
    private Button btnejecutar;
    private Button btncancelar;
    private Button btnabandonar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txusuario = findViewById(R.id.txtusuario);
        txcontrasenia = findViewById(R.id.contrasenia);
        btnejecutar = findViewById(R.id.buttonejecutar);
        btncancelar = findViewById(R.id.buttoncancelar);
        btnabandonar = findViewById(R.id.buttnoabandonar);

        btnejecutar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IniciarSesion();
            }
        });

         }

       void IniciarSesion() {
           String usuario = txusuario.getText().toString();
           String contrasenia = txcontrasenia.getText().toString();

           //validar que los campos no esten vacios
           if (usuario.trim().length() >= 1) {
               if (contrasenia.trim().length() >= 1) {
                   //datos primitivos con == y los demas con equals
                   if (usuario.trim().equals("admin")){
                       if (contrasenia.trim().equals("1234")) {
                           Intent irInicio = new Intent(Login.this, Inicio.class);
                           startActivity(irInicio);
                           finish();
                       } else {
                           txcontrasenia.setError("Verifique la contraseña");
                           txcontrasenia.requestFocus();
                       }
                   } else {
                       txusuario.setError("verifique el usuario");
                       txusuario.requestFocus();
                   }
               } else {
                   txcontrasenia.setError("debe ingresar contraseña");
                   txcontrasenia.setText(null);
                   txcontrasenia.requestFocus();
               }
           }else{
               txusuario.setError("debe ingresar usuario");
               txusuario.setText(null);
               txusuario.requestFocus();
               }
               }
           }



