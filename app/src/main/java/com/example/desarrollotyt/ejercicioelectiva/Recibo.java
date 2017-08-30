package com.example.desarrollotyt.ejercicioelectiva;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by DESARROLLOTYT on 30/08/2017.
 */

public class Recibo extends AppCompatActivity {

    private Button boton;

    TextView nombre2,apellido2,telefono2,direccion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recibo);

        nombre2 = (TextView) findViewById( R.id.nombre2 );
        apellido2 = (TextView) findViewById( R.id.apellido2 );
        telefono2 = (TextView) findViewById( R.id.telefono2 );
        direccion2 = (TextView) findViewById( R.id.direccion2 );

        Intent intent=getIntent();
        Bundle extras =intent.getExtras();
        if (extras != null) {
            String datoNombre=(String)extras.get("nombre");
            String datoApellido= (String) extras.get("apellido");
            String datoTelefono= (String) extras.get("telefono");
            String datoDireccion= (String) extras.get("direccion");

            nombre2.setText(datoNombre);
            apellido2.setText(datoApellido);
            telefono2.setText(datoTelefono);
            direccion2.setText(datoDireccion);
        }
    }
}