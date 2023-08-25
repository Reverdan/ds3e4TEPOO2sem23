package com.example.soma.Modelo;

public class Validacao
{
    public String mensagem;
    public Double n1;
    public Double n2;
    public void validar(String num1, String num2)
    {
        this.mensagem = "";
        try
        {
            n1 = Double.parseDouble(num1);
            n2 = Double.parseDouble(num2);
        }
        catch (Exception e)
        {
            this.mensagem = "Digite números válidos";
        }
    }
}
