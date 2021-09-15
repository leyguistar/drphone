package com.example.drphone.objetos;

public class Paciente {
    public double[] sintomas;
    public double resultado = 0;

    public Paciente() {
        sintomas = new double[MensajesSintomas.maxSintomas];
    }
}
