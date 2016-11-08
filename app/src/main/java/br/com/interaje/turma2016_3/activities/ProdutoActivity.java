package br.com.interaje.turma2016_3.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import br.com.interaje.turma2016_3.R;
import br.com.interaje.turma2016_3.adapters.ProdutoAdapter;
import br.com.interaje.turma2016_3.utils.ListaFakeUtils;

public class ProdutoActivity extends AppCompatActivity {

    private ListView listViewProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        listViewProdutos = (ListView) findViewById(R.id.listview_produtos);

        ProdutoAdapter adapter = new ProdutoAdapter(ListaFakeUtils.getThreeProducts());

        listViewProdutos.setAdapter(adapter);

    }
}
