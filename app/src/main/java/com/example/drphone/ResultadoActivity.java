package com.example.drphone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import com.example.drphone.objetos.MensajesSintomas;
import com.example.drphone.objetos.Sintomas;

public class ResultadoActivity extends AppCompatActivity {
    TextView tvResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        tvResultado = findViewById(R.id.tvResultadoAnalisis);

        double resultado = MensajesSintomas.paciente.resultado/21;
        tvResultado.setText("Probabilidad de covid: " + resultado*100 + "%");

    }
}