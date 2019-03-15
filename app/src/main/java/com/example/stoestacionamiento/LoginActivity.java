package com.example.stoestacionamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void Registro (View view){
        Intent i = new Intent(this,RegistroActivity.class);
        startActivity(i);
    }

    public void IniciarSesion (View view){
        Intent i = new Intent(this,MenuActivity.class);
        startActivity(i);
    }

    }
