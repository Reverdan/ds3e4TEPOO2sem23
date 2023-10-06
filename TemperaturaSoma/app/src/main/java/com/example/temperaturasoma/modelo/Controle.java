package com.example.temperaturasoma.modelo;

public class Controle
{
    public String mensagem = "";
    public String resultado;

    public void somar(String num1, String num2)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validarNumero(num1, num2);
        if (validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            resultado = calculos.somar(validacao.n1, validacao.n2);
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
