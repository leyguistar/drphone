package com.example.drphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.drphone.objetos.Sintomas;

public class MainActivity extends AppCompatActivity {
    Button btSintomas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btSintomas = findViewById(R.id.btSintomas);
        btSintomas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SintomasActivity.class);
                i.putExtra("sintoma",0);
                startActivity(i);
            }
        });
    }
}