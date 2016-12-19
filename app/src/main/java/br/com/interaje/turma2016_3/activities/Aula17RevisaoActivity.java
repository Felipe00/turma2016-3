package br.com.interaje.turma2016_3.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.interaje.turma2016_3.Cadastro;
import br.com.interaje.turma2016_3.Login;
import br.com.interaje.turma2016_3.R;

public class Aula17RevisaoActivity extends AppCompatActivity {
    Button login;
    Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula17_revisao);

        login = (Button) findViewById(R.id.btn_login);
        sign_up = (Button) findViewById(R.id.btn_sign_up);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Aula17RevisaoActivity.this,Login.class));
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {

           @Override
            public void onClick(View view) {
                startActivity(new Intent(Aula17RevisaoActivity.this, Cadastro.class));
            }
        } );
    }

}
