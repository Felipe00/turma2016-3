package br.com.interaje.turma2016_3;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class CadastroActivity extends AppCompatActivity implements View.OnClickListener {

    Button camera;
    Button galeria;
    ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        camera = (Button) findViewById(R.id.cadastro_camera);
        galeria = (Button) findViewById(R.id.cadastro_galeria);
        imagem = (ImageView) findViewById(R.id.cadastro_imagem);

        camera.setOnClickListener(this);
        galeria.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.cadastro_camera: {
                Intent intentCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intentCamera, 0);
                break;
            }
            case R.id.cadastro_galeria: {
                Intent intentGaleria = new Intent(
                        Intent.ACTION_PICK,
                        MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intentGaleria, 1);
                break;
            }
        }

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 0) {
            Uri uri = data.getData();
            imagem.setImageURI(uri);
        }

        if (requestCode == 1) {
            Uri uri = data.getData();
            imagem.setImageURI(uri);
        }

    }
}
