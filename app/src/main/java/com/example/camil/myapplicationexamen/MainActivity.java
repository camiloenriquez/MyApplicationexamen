package com.example.camil.myapplicationexamen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private TextView tv1, tv2, tv3;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);

        button = (Button) findViewById(R.id.button);
    }


    //Este método se ejecutará cuando se presione el botón
    public void alteatorio(View view) {




        int contador=0;
        for (contador=0 contador<6) {
            if (contador = 5) {

                double numero = ((int) Math.random() * 12 + 1);
                double numero1 = ((int) Math.random() * 12 + 1);
                double resu = numero1 * numero;
                Toast notificacion = Toast.makeText(this, "el resultado de la multiplicacion es " + resu, Toast.LENGTH_LONG);
                notificacion.show();
            }
        }
    }

    public void multiplicar(View view) {

        String valor1 = tv1.getText().toString();
        String valor2 = tv2.getText().toString();
        int nro1 = Integer.parseInt(valor1);
        int nro2 = Integer.parseInt(valor2);
        int triangulo = (nro1 * nro2);
        String resultado = String.valueOf(triangulo);
        tv1.setText();
        Toast notificacion = Toast.makeText(this, "el resultado de la multiplicacion es " + resultado, Toast.LENGTH_LONG);
        notificacion.show();
    }


    public void acercade(View view) {
        Intent i = new Intent(this, acercaDe.class );
        startActivity(i);    }



}
