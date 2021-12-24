package br.com.estudos.livraria.teste;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		double livroJava8 = 59.90;
		double livroTDD = 59.90;

		double soma = livroJava8 + livroTDD;

		System.out.println("A total em estoque é " + soma);

		if (soma < 200) {
			System.out.println("Estoque baixo.");
		} else if (soma > 2000) {
			System.out.println("Estoque muito alto.");
		} else {
			System.out.println("Estoque bom.");
		}
	}
}
