package br.com.interaje.turma2016_3.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.interaje.turma2016_3.R;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoConfirma;

        email = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);
        botaoConfirma = (Button) findViewById(R.id.btn_entrar);

    }

    public void fazerLogin(View v) {
        String textoEmail = email.getText().toString();
        String textoSenha = senha.getText().toString();

        if (textoEmail != "") {
            // Toast.makeText(MainActivity.this, "Bem vindo!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, ProdutoActivity.class);
            startActivity(intent);
        }
    }
}
