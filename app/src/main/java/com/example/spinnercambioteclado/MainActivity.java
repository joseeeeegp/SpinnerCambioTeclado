package com.example.spinnercambioteclado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.text.InputType;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText usuario;
    Spinner opciones;
    TextView resultado;
    boolean limpiar=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario = (EditText) findViewById(R.id.textUsuario);
        opciones = (Spinner) findViewById(R.id.idSpinnerOpciones);
        resultado = (TextView) findViewById(R.id.textResultado);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.opciones, android.R.layout.simple_spinner_dropdown_item);
        opciones.setAdapter(adapter);

        opciones.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
            switch (position) {
                case 0:
                    //usuario.setText("");
                    resultado.setText("");
                    usuario.setInputType(InputType.TYPE_CLASS_TEXT);
                    Toast.makeText(parent.getContext(),"Seleccionado: "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
                    resultado.setText("Has escrito: " + usuario.getText()+" - " + parent.getItemAtPosition(position).toString());

                    break;
                case 1:
                    //usuario.setText("");
                    resultado.setText("");
                    usuario.setInputType(InputType.TYPE_TEXT_VARIATION_EMAIL_ADDRESS);
                    Toast.makeText(parent.getContext(),"Seleccionado: "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
                    resultado.setText("El correo escrito es: " + usuario.getText()+" - " + parent.getItemAtPosition(position).toString());


                    break;
                case 2:
                   // usuario.setText("");
                    resultado.setText("");
                    usuario.setInputType(InputType.TYPE_CLASS_PHONE);
                    Toast.makeText(parent.getContext(),"Seleccionado: "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
                    resultado.setText("El telefono escrito es: " + usuario.getText()+" - " + parent.getItemAtPosition(position).toString());

                    break;
                case 3:
                   // usuario.setText("");
                    resultado.setText("");
                    usuario.setInputType(InputType.TYPE_CLASS_NUMBER);
                    Toast.makeText(parent.getContext(),"Seleccionado: "+parent.getItemAtPosition(position).toString(),Toast.LENGTH_LONG).show();
                    resultado.setText("El numero escrito es: " + usuario.getText()+" - "  + parent.getItemAtPosition(position).toString());

                    break;
            }
        }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
        public void onNothingSelected (AdapterView < ? > parent){

        }
    }

