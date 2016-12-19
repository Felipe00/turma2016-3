package br.com.interaje.turma2016_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.interaje.turma2016_3.model.User;

public class Cadastro extends AppCompatActivity {

    Button confirmBtn;
    EditText nameEdtx, phoneEdtx, emailEdtx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro2);

        nameEdtx = (EditText) findViewById(R.id.editText6);
        phoneEdtx = (EditText) findViewById(R.id.editText8);
        emailEdtx = (EditText) findViewById(R.id.editText7);

        confirmBtn = (Button) findViewById(R.id.button2);
        confirmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name, email, phone;
                name = nameEdtx.getText().toString();
                email = emailEdtx.getText().toString();
                phone = phoneEdtx.getText().toString();

                User user = new User(name, email, phone);

                user.save();

                if (user.getId() != null) {
                    Toast.makeText(Cadastro.this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Cadastro.this, "Ocorreu um problema, tente novamente", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
