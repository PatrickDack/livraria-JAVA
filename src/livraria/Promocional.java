package livraria;

@FunctionalInterface
public interface Promocional {
  boolean aplicaDescontosDe(double porcentagem);

  default boolean aplicaDescontosDe10Porcento() {
    return aplicaDescontosDe(0.1);
  }
}
