package br.com.interaje.turma2016_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {


    Button confirmation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        confirmation = (Button) findViewById(R.id.btn_confirmation);

        confirmation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        } );
    }


}
