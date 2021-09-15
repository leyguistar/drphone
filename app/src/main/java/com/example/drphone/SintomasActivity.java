package com.example.drphone;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.drphone.objetos.MensajesSintomas;
import com.example.drphone.objetos.Paciente;
import com.example.drphone.objetos.Sintomas;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class SintomasActivity extends AppCompatActivity implements View.OnClickListener{
    Button btSi,btNo,btIngresar,btNose;
    TextView tvSintoma;
    ImageView imageView;
    EditText etValue;
    int sintoma;
    ImageView ivHelp;
    LinearLayout llBotones,llMedidas;
    MediaPlayer mediaPlayer = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);
        btSi = findViewById(R.id.btSintomaSi);
        btNo = findViewById(R.id.btSintomaNo);
        btSi.setOnClickListener(this);
        btNo.setOnClickListener(this);
        btIngresar = findViewById(R.id.btIngresarMedicion);
        btNose = findViewById(R.id.btNose);
        btIngresar.setOnClickListener(this);
        btNose.setOnClickListener(this);
        tvSintoma = findViewById(R.id.tvSintoma);
        imageView = findViewById(R.id.ivSintoma);
        ivHelp = findViewById(R.id.ivHelp);
        ivHelp.setOnClickListener(this);
        Intent i = getIntent();
        sintoma = i.getIntExtra("sintoma",0);
        tvSintoma.setText(MensajesSintomas.textos[sintoma]);
        etValue = findViewById(R.id.etValue);
        llBotones = findViewById(R.id.llBotones);
        llMedidas = findViewById(R.id.llMedidas);
        if(sintoma == Sintomas.saturacion.ordinal() || sintoma == Sintomas.temperatura.ordinal()){
            llBotones.setVisibility(View.GONE);
            llMedidas.setVisibility(View.VISIBLE);
        }else{
            llBotones.setVisibility(View.VISIBLE);
            llMedidas.setVisibility(View.GONE);

        }
        if(sintoma == Sintomas.temperatura.ordinal()){
            etValue.setHint("temperatura");
        }
        mediaPlayer = MediaPlayer.create(this,MensajesSintomas.audios[sintoma]);
        mediaPlayer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btSintomaSi){
            MensajesSintomas.paciente.resultado += MensajesSintomas.ponderacion[sintoma];
            MensajesSintomas.paciente.sintomas[sintoma] = MensajesSintomas.ponderacion[sintoma];
        }else if(v.getId() == R.id.btSintomaNo){
            MensajesSintomas.paciente.sintomas[sintoma] = 0;

        }else if(v.getId() == R.id.btNose){
            MensajesSintomas.paciente.resultado += 0.5;
            MensajesSintomas.paciente.sintomas[sintoma] = -1;

        }else if(v.getId() == R.id.btIngresarMedicion){
            int value = Integer.valueOf(etValue.getText().toString());
            if(sintoma == Sintomas.saturacion.ordinal()){
                if(value > 93){
                    MensajesSintomas.paciente.resultado += 0;
                    MensajesSintomas.paciente.sintomas[sintoma] = 0;

                }else if(value > 80){
                    MensajesSintomas.paciente.resultado += 1;
                    MensajesSintomas.paciente.sintomas[sintoma] = 1;
                }else if(value > 60){
                    MensajesSintomas.paciente.resultado += 2;
                    MensajesSintomas.paciente.sintomas[sintoma] = 2;

                }
            }else if(sintoma == Sintomas.temperatura.ordinal()){
             if(value > 38){
                 MensajesSintomas.paciente.resultado += 1;
                 MensajesSintomas.paciente.sintomas[sintoma] = 1;
             }
            }

        }else if(v.getId() == R.id.ivHelp){
            AlertDialog.Builder alertHelp = new AlertDialog.Builder(this);
            alertHelp.setTitle("ayuda");
            alertHelp.setMessage("");
        }
        if(sintoma+1 >= MensajesSintomas.textos.length){
            Intent i = new Intent(this, ResultadoActivity.class);
            startActivity(i);
        }else{
            Intent i = new Intent(this,SintomasActivity.class);
            i.putExtra("sintoma",sintoma+1);
            startActivity(i);
            finish();
        }

    }
}