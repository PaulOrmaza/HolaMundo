package com.spoj.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FORMULARIO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        EditText edNombres,edApellidos,edCedula,edDireccion,edCorreo;
        Button btnIngresar=findViewById(R.id.btnIngresar);

        edNombres=findViewById(R.id.txtnombre);
        edApellidos=findViewById(R.id.txtapellido);
        edCedula=findViewById(R.id.txtcedula);
        edDireccion=findViewById(R.id.txtdireccion);
        edCorreo=findViewById(R.id.txtcorreo);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre=edNombres.getText().toString();
                if(!nombre.isEmpty()){
                    Toast.makeText(FORMULARIO.this, "Hola UwU", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}