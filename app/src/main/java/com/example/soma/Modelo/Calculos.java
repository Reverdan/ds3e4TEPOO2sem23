package com.example.soma.Modelo;

public class Calculos
{
    public String resultado;
    public void somar(Double n1, Double n2)
    {
        Double resposta = 0.0;
        resposta = n1 + n2;
        this.resultado = String.valueOf(resposta);
    }
}
