package br.com.estudos.livraria.teste;

public class TiposPrimitivosExemplo1 {

	public static void main(String[] args) {
		int numero = 4;
		int outroNumero = numero;

		numero = numero + 5;

		System.out.println(numero);
		System.out.println(outroNumero);

		int contador = 0;


		while(contador < 35) {
			System.out.println(contador);

			contador ++;
		}

		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				continue;
			}

			System.out.println(i);
		}
	}
}
