package br.com.interaje.turma2016_3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.interaje.turma2016_3.R;
import br.com.interaje.turma2016_3.model.Produto;

/**
 * Created by sentinel on 07/11/16.
 */

public class ProdutoAdapter extends BaseAdapter {

    private List<Produto> produtos;

    public ProdutoAdapter(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public int getCount() {
        return produtos.size();
    }

    @Override
    public Object getItem(int position) {
        return produtos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.item_layout_produto, parent, false);

        TextView nomeTextv, precoTextv, quantTextv;
        nomeTextv = (TextView) itemView.findViewById(R.id.produto_nome);
        precoTextv = (TextView) itemView.findViewById(R.id.produto_preco);
        quantTextv = (TextView) itemView.findViewById(R.id.produto_quantidade);

        Produto produto = produtos.get(position);

        nomeTextv.setText(produto.getNome());
        precoTextv.setText(String.valueOf(produto.getPreco()));
        quantTextv.setText(String.valueOf(produto.getQuantidade()));

        return itemView;
    }
}
