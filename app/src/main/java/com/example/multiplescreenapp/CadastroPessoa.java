package com.example.multiplescreenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CadastroPessoa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa);
        EditText textoIdPessoa = findViewById(R.id.editText);
        textoIdPessoa.setText(getIntent().getStringExtra("idpessoa"));
    }

    public void fechar(View view) {
        finish();
    }
}
