package br.com.estudos.livraria.teste;

import br.com.estudos.livraria.produto.Produto;

public class CarrinhoDeCompras {

  private double total;

  public void adiciona(Produto produto) {
    System.out.println("Adicionado: " + produto);
    total += produto.getValor();
  }

  public double getTotal() {
    return total;
  }
}
