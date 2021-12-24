package br.com.estudos.livraria.produto;

import br.com.estudos.livraria.Autor;

public class Ebook extends Livro implements Promocional {
  private String waterMark;

  public Ebook(Autor autor) {
    super(autor);
  }

  public String getWaterMark() {
    return waterMark;
  }

  public void setWaterMark(String waterMark) {
    this.waterMark = waterMark;
  }

  @Override
  public boolean aplicaDescontosDe(double porcentagem) {
    if (porcentagem > 0.15) {
      return false;
    }

    double desconto = getValor() * porcentagem;
    setValor(getValor() - desconto);

    System.out.println("Aplicado desconto em Ebook");

    return true;
  }
}
