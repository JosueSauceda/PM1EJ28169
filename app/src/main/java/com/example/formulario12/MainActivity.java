package com.example.formulario12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.formulario12.R;

public class MainActivity extends AppCompatActivity
{
    EditText txtnombre, txtapellido;
    Button btnagregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtnombre);
        txtapellido = findViewById(R.id.txtapellido);
        btnagregar = (Button) findViewById(R.id.btnagregar);

        btnagregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(MainActivity.this, "Hola", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getApplicationContext(), com.example.formulario12.MainActivity2.class);

                intent.putExtra("nombre",txtnombre.getText().toString());
                intent.putExtra("apellido",txtapellido.getText().toString());

                startActivity(intent);


            }
        });


    }
}