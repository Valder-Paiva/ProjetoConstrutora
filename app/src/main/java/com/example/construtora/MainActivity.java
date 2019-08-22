package com.example.construtora;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageButton construcoes;
    private ImageButton projetos;
    private ImageButton orcamentos;
    private ImageButton contatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        construcoes = findViewById(R.id.construcoesID);
        projetos = findViewById(R.id.projetosID);
        orcamentos = findViewById(R.id.orcamentoID);
        contatos = findViewById(R.id.contatoID);

        construcoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, construcoes.class));
            }
        });

        projetos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, projetos.class));
            }
        });

        orcamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, orcamento.class));
            }
        });
        contatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, contatos.class));
            }
        });
    }
}
