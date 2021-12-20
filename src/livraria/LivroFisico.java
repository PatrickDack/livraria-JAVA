package livraria;

public class LivroFisico extends Livro {
  public LivroFisico(Autor autor) {
    super(autor);
  }

  public double getTaxaImpressao() {
    return this.getValor() * 0.05;
  }

  public boolean aplicaDescontosDe(double porcentagem) {
    if (porcentagem > 0.3) {
      return false;
    }

    double desconto = getValor() * porcentagem;
    setValor(getValor() - desconto);

    System.out.println("Aplicado desconto à LivroFisico");

    return true;
  }
}
