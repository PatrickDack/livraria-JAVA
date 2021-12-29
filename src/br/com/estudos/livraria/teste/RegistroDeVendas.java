package br.com.estudos.livraria.teste;

import java.util.List;

import br.com.estudos.livraria.Autor;
import br.com.estudos.livraria.produto.Ebook;
import br.com.estudos.livraria.produto.LivroFisico;
import br.com.estudos.livraria.produto.Produto;

public class RegistroDeVendas {
  public static void main(String[] args) {
    Autor autor = new Autor();
    autor.setNome("Mauricio Aniche");

    LivroFisico fisico = new LivroFisico(autor);
    fisico.setNome("Test-Driven Development");
    fisico.setValor(59.90);

    if (fisico.aplicaDescontosDe10Porcento()) {
      System.out.println("O valor agora é: " + fisico.getValor());
    }

    Ebook ebook = new Ebook(autor);
    ebook.setNome("Test-Driven Development");
    ebook.setValor(29.90);

    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    carrinho.adiciona(fisico);
    carrinho.adiciona(ebook);

    List<Produto> produtos = carrinho.getProdutos();

    for (Produto produto : produtos) {
      System.out.println(produto.getValor());
    }
  }
}
