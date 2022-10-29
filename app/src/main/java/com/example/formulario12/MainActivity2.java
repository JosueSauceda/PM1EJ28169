package com.example.formulario12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.formulario12.R;

public class MainActivity2 extends AppCompatActivity {


    TextView txtresultadoo;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       txtresultadoo = (TextView) findViewById(R.id.txtresultado);

        Bundle resultado = getIntent().getExtras();
        txtresultadoo.setText(resultado.getString("nombre"));

    }
}