package br.com.interaje.turma2016_3.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.interaje.turma2016_3.R;
import br.com.interaje.turma2016_3.model.Produto;
import br.com.interaje.turma2016_3.utils.ListaFakeUtils;

public class CadastroProdutoActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText edtxtNome, edtxtQtd, edtxtPreco;
    private Button btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_produto);

        initViews();

        btnSalvar.setOnClickListener(this);

    }

    private void initViews() {
        edtxtNome = (EditText) findViewById(R.id.produto_nome);
        edtxtQtd = (EditText) findViewById(R.id.produto_qtd);
        edtxtPreco = (EditText) findViewById(R.id.produto_preco);
        btnSalvar = (Button) findViewById(R.id.btn_salvar_produto);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(this, ProdutoActivity.class));
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_salvar_produto: {
                if (edtxtNome.getText().toString().isEmpty()) {
                    Toast.makeText(CadastroProdutoActivity.this
                            , "Preencha o nome do produto", Toast.LENGTH_SHORT).show();
                    return;
                }

                Produto produto = new Produto();

                Double mPreco = Double.valueOf(edtxtPreco.getText().toString());
                Integer mQtd = Integer.valueOf(edtxtQtd.getText().toString());

                produto.setNome(edtxtNome.getText().toString());
                produto.setPreco(mPreco);
                produto.setQuantidade(mQtd);

                ListaFakeUtils.dbListaProduto.add(produto);

                Toast.makeText(CadastroProdutoActivity.this
                        , "Produto salvo com sucesso", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(CadastroProdutoActivity.this, ProdutoActivity.class));
                finish();
                break;
            }
        }
    }
}
