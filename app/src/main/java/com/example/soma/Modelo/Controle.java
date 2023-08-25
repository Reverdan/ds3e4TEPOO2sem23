package com.example.soma.Modelo;

public class Controle
{
    public Double n1;
    public Double n2;
    public String mensagem;
    public String resultado;

    public void somar(String num1, String num2)
    {
        this.mensagem = "";
        Validacao validacao = new Validacao();
        validacao.validar(num1, num2);
        if (validacao.mensagem.equals(""))
        {
            Calculos calculos = new Calculos();
            calculos.somar(validacao.n1, validacao.n2);
            this.resultado = calculos.resultado;
        }
        else
        {
            this.mensagem = validacao.mensagem;
        }
    }
}
