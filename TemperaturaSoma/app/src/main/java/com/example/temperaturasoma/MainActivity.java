package com.example.temperaturasoma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.temperaturasoma.apresentacao.actSoma;
import com.example.temperaturasoma.apresentacao.actTemperatura;

public class MainActivity extends AppCompatActivity
{
    Button btnSomar;
    Button btnTemperatura;
    Intent intSomar;
    Intent intTemperatura;
    Context contexto;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configuracao();
        eventos();
    }

    public void configuracao()
    {
        btnSomar = findViewById(R.id.btnSomar);
        btnTemperatura = findViewById(R.id.btnTemperatura);
        intSomar = new Intent(this, actSoma.class);
        intTemperatura = new Intent(this, actTemperatura.class);
        contexto = this;
    }

    public void eventos()
    {
        btnSomar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intSomar);
            }
        });

        btnTemperatura.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(intTemperatura);
            }
        });
    }
}