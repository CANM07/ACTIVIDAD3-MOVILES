package com.example.calculadora3;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;

public class calculadora implements Serializable {

    public  EditText valor1;

    public  EditText valor2;

    public TextView resultado;

    public calculadora(Bundle bundle) {
        String operacion = bundle.getString("operacion");
        double valor1 = bundle.getDouble("valor1");
        double valor2 = bundle.getDouble("valor2");

        double resultado = 0;
        if (operacion.equals("suma")) {
            resultado = valor1 + valor2;
        } else if (operacion.equals("resta")) {
            resultado = valor1 - valor2;
        }
    }

    public void setValor1() {
        this.valor1 = valor1;
    }

    public void setValor2() {
        this.valor2 = valor2;
    }

    public void setResultado() {
        this.resultado = resultado;
    }

    public EditText getValor1() {
        return valor1;
    }

    public EditText getValor2() {
        return valor2;
    }

    public TextView getResultado() {
        return resultado;
    }



}
