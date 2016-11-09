package br.com.interaje.turma2016_3.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import br.com.interaje.turma2016_3.R;
import br.com.interaje.turma2016_3.adapters.ProdutoAdapter;
import br.com.interaje.turma2016_3.utils.ListaFakeUtils;

public class ProdutoActivity extends AppCompatActivity implements View.OnClickListener {

    private ListView listViewProdutos;
    private FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        listViewProdutos = (ListView) findViewById(R.id.listview_produtos);
        fab = (FloatingActionButton) findViewById(R.id.produto_fab);

        ProdutoAdapter adapter = new ProdutoAdapter(ListaFakeUtils.getThreeProducts());

        listViewProdutos.setAdapter(adapter);

        fab.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.produto_fab: {
                startActivity(new Intent(ProdutoActivity.this, CadastroProdutoActivity.class));
                finish();
                break;
            }
        }
    }
}
