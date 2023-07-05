package com.rodrigo.calculadorimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.rodrigo.calculadorimc.clases.Indice;

public class MainActivity extends AppCompatActivity {

    private Indice indice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularIMC(View view){
        EditText textPeso = (EditText) findViewById(R.id.editPeso);
        EditText textAltura = (EditText) findViewById(R.id.editAltura);

        float peso = Float.parseFloat(textPeso.getText().toString());
        float altura= Float.parseFloat(textAltura.getText().toString());

        indice = new Indice(peso,altura);
        setearCalculo();
        setearCategoria();
    }

    private void setearCalculo(){
        TextView resultado = (TextView) findViewById(R.id.resultadoIMCtext);
        String result = ""+indice.calculo();
        resultado.setText(result);
    }

    private void setearCategoria(){
        TextView categoria = (TextView) findViewById(R.id.resultadoCategoriatext);
        categoria.setText(indice.categoria());
    }

}