package br.com.estudos.livraria.teste;

import br.com.estudos.livraria.Autor;
import br.com.estudos.livraria.produto.Ebook;
import br.com.estudos.livraria.produto.Livro;
import br.com.estudos.livraria.produto.LivroFisico;
import br.com.estudos.livraria.produto.MiniLivro;

public class RegrasDeDesconto {
  public static void main(String[] args) {
    Autor autor = new Autor();
    autor.setNome("Patrick Dack");
    autor.setEmail("patrickdack@hotmail.com");
    autor.setCpf("123.456.789.10");

    Livro livro = new MiniLivro(autor);
    livro.setValor(39.90);

    System.out.println("Valor atual: " + livro.getValor());

    LivroFisico livroFisico = new LivroFisico(autor);
    livroFisico.setValor(59.90);

    System.out.println("Valor atual: " + livroFisico.getValor());

    if (!livroFisico.aplicaDescontosDe(0.3)) {
      System.out.println("Desconto não pode ser maior que 30%");
    } else {
      System.out.println("Valor com desconto: " + livroFisico.getValor());
    }

    Ebook ebook = new Ebook(autor);

    ebook.setValor(29.90);

    if (!ebook.aplicaDescontosDe(0.15)) {
      System.out.println("Desconto não pode ser maior que 15%");
    } else {
      System.out.println("Valor com Desconto: " + ebook.getValor());
    }
  }
}
