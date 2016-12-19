package br.com.interaje.turma2016_3.activities;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import br.com.interaje.turma2016_3.R;

/**
 * Created by felipe on 07/12/16.
 */

public class Aula14ThreadsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula14_thread);

        // thread de UI

        startActivity(new Intent(this, Aula06MenuActivity.class));

        final Context context = Aula14ThreadsActivity.this;

        // THREADS do JAVA
        Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        // bla bla executando algum codigo pesado
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(context, "Usando Threads Radicais!", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
        // thread.start();
        // FIM THREAD do JAVA ----


        // THREADS com HANDLER
        Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                // Toast.makeText(context, "Usando Handlers Radicais!", Toast.LENGTH_SHORT).show();
            }
        });
        // FIM THREADS com HANDLER ----


        // THREADS COM ASYNCTASK
        AsyncToast asToast = new AsyncToast(this, "Usando AsyncTasks Radicais!");
        asToast.execute();
    }

    public class AsyncToast extends AsyncTask<Void, Void, Void> {

        private String message;
        private Context context;

        public AsyncToast(Context context, String newMessage) {
            this.context = context;
            this.message = newMessage;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(context, "Aguarde, Preparando o download....", Toast.LENGTH_SHORT).show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            // Fazendo meu trabalho pesado:
            // Download de imagem, conversao em binario, carregando musica..
            try {
                Thread.sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Toast.makeText(context, "Download efetuado com sucesso!!", Toast.LENGTH_SHORT).show();
        }
    }
}
