package com.example.calculadora3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Vista extends AppCompatActivity {

    public TextView resultado;
    public TextView resultado2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista);
        resultado=findViewById(R.id.RESPUESTA1);
        resultado2=findViewById(R.id.RESPUESTA2);


        String operacion = getIntent().getStringExtra("operacion");
        double resultadoOperacion = getIntent().getDoubleExtra("resultado", 0.0);
        String resultadoStr = operacion + ": " + resultadoOperacion;
        resultado.setText(resultadoStr);
    }

    public void volver(View view){
        finishActivity();
    }

    private void finishActivity(){
        Intent c = new Intent(this, Vista.class);
        finish();
    }

}

