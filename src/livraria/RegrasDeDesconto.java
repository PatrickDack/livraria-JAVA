package livraria;

public class RegrasDeDesconto {
  public static void main(String[] args) {
    Autor autor = new Autor();
    autor.setNome("Patrick Dack");
    autor.setEmail("patrickdack@hotmail.com");
    autor.setCpf("123.456.789.10");

    Livro livro = new Livro(autor);
    livro.setValor(59.90);

    System.out.println("Valor atual: " + livro.getValor());

    if (!livro.aplicaDescontosDe(0.3)) {
      System.out.println("Desconto não pode ser maior que 30%");
    } else {
      System.out.println("Valor com desconto: " + livro.getValor());
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
