package com.example.temperaturasoma.modelo;

public class Validacao
{
    public Double n1;
    public Double n2;
    public String mensagem;

    public void validarNumero(String num1, String num2)
    {
        this.mensagem = "";
        try
        {
            this.n1 = Double.valueOf(num1);
            this.n2 = Double.valueOf(num2);
        }
        catch (NumberFormatException e)
        {
            this.mensagem = "Valores inválidos";
        }
    }
}
