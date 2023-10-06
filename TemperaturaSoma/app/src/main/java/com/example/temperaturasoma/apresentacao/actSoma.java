package com.example.temperaturasoma.apresentacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.temperaturasoma.R;
import com.example.temperaturasoma.modelo.Controle;

public class actSoma extends AppCompatActivity
{
    EditText edtPrimeiroNumero;
    EditText edtSegundoNumero;
    Button btnSomar;
    TextView txvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_soma);
        configuracao();
        eventos();
    }

    public void configuracao()
    {
        edtPrimeiroNumero = findViewById(R.id.edtPrimeiroNumero);
        edtSegundoNumero = findViewById(R.id.edtSegundoNumero);
        btnSomar = findViewById(R.id.btnSomar);
        txvResultado = findViewById(R.id.txvResultado);
    }

    public void eventos()
    {
        btnSomar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Controle controle = new Controle();
                controle.somar(edtPrimeiroNumero.getText().toString(),
                        edtSegundoNumero.getText().toString());
                if (controle.mensagem.equals(""))
                {
                    txvResultado.setText(controle.resultado);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),
                            controle.mensagem, Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}