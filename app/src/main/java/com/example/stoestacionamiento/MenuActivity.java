package com.example.stoestacionamiento;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.escaner:
                //i = new Intent(MenuActivity.this,ScannerActivity.class);
                //startActivity(i);
                Log.i("click","Se oprime el boton de escanner");
                break;
            case R.id.perfil:
                i = new Intent(MenuActivity.this,PerfilActivity.class);
                Log.i("click","Se oprime el boton de escanner");
                startActivity(i);
                break;
            case R.id.historial:
                //i = new Intent(MenuActivity.this,ScanerActivity.class);
                //startActivity(i);
                break;
            case R.id.configuracion:
                //i = new Intent(MenuActivity.this,ScanerActivity.class);
                //startActivity(i);
                break;
            default:
                //code..
                break;
        }
    }
}
