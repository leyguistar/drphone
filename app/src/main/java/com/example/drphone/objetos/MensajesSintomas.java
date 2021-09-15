package com.example.drphone.objetos;

import com.example.drphone.R;

public class MensajesSintomas {
    public static int maxSintomas = 26;
    public static Paciente paciente = new Paciente();
    public static double[] ponderacion = {1,1,0.5,0.5,1,1,1,1,0.5,1,1,1,0.5,1,1,0.5,1,1,1,0.5,0.5,0.5,0.5,0.5,1,1};
    public static int[] audios = {R.raw.a0, R.raw.a1, R.raw.a2, R.raw.a3, R.raw.a4, R.raw.a5, R.raw.a6, R.raw.a7, R.raw.a8, R.raw.a9, R.raw.a10, R.raw.a11, R.raw.a12, R.raw.a13, R.raw.a14, R.raw.a15, R.raw.a16, R.raw.a17, R.raw.a18, R.raw.a19, R.raw.a20, R.raw.a21, R.raw.a22, R.raw.a23, R.raw.a24, R.raw.a25};
    public static String[] textos = {"Ingrese su temperatura",
            "¿Posee Tos seca?",
            "¿A tenido dolor de cabeza?",
            "¿Está presentando cansancio?",
            "¿Está presentando dolor muscular?",
            "¿Está presentando dolor en las articulaciones",
            "¿Está presentando congestion nasal?",
            "¿Tiene dolor de garganta?",
            "¿Está presentando conjuntivitis?",
            "¿Está presentando diarrea o malestar estomacal?",
            "¿Tiene perdida de sentido del gusto?",
            "¿Tiene perdida de sentido del olfato?",
            "¿Está presentando erupciones cutaneas?",
            "¿Está presentando nauceas?",
            "¿Siente escalofrios?",
            "¿A sufrido de vertigo recientemente?",
            "¿Está presentado dificultad para respirar?",
            "¿Siente presion en el pecho?",
            "¿Tiene incapacidad para hablar o moverse?",
            "¿Esta presentando perdida de apetito?",
            "¿Presenta confusion?",
            "¿Presenta ansiedad?",
            "¿Presenta depresion?",
            "¿Presenta transtorno de sueño?",
            "Ingrese su saturacion",
            "¿A tenido contacto con alguien que tenga covid?"};
}
