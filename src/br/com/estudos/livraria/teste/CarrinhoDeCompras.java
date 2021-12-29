package br.com.estudos.livraria.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.estudos.livraria.produto.Produto;

public class CarrinhoDeCompras {

  private double total;
  private List<Produto> produtos;

  public CarrinhoDeCompras() {
    produtos = new ArrayList<Produto>();
  }

  public void adiciona(Produto produto) {
    this.produtos.add(produto);
    total += produto.getValor();
  }

  public void remove(int posicao) {
    this.produtos.remove(posicao);
  }

  public List<Produto> getProdutos() {
    return this.produtos;
  }

  public double getTotal() {
    return this.total;
  }
}
