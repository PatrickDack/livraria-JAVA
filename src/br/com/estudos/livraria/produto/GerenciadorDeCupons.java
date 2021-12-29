package br.com.estudos.livraria.produto;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GerenciadorDeCupons {
  private Map<String, Double> cupons;

  public GerenciadorDeCupons() {
    this.cupons = new HashMap<>();

    cupons.put("cab11", 10.0);
    cupons.put("cab22", 12.0);
    cupons.put("cab33", 13.0);
    cupons.put("cab44", 14.0);
  }

  public double validaCupom(String cupom) {
    return this.cupons.get(cupom);
  }
}
