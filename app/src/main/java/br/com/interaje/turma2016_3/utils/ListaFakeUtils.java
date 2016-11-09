package br.com.interaje.turma2016_3.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.interaje.turma2016_3.model.Produto;

/**
 * Created by sentinel on 07/11/16.
 */

public class ListaFakeUtils {

    public static List<Produto> dbListaProduto = new ArrayList<>();

    public static List<Produto> getThreeProducts() {

        if (!dbListaProduto.isEmpty()) {
            return dbListaProduto;
        }

        Produto produto = new Produto();
        produto.setNome("Vassoura");
        produto.setPreco(2.10);
        produto.setQuantidade(5);

        dbListaProduto.add(produto);

        produto = new Produto();
        produto.setNome("Sabão");
        produto.setPreco(1.50);
        produto.setQuantidade(10);

        dbListaProduto.add(produto);

        produto = new Produto();
        produto.setNome("Cadeira plástica");
        produto.setPreco(40.0);
        produto.setQuantidade(30);

        dbListaProduto.add(produto);

        return dbListaProduto;

    }

}
