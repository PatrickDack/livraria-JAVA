package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {

    Autor autor = new Autor();
    autor.setNome("Patrick Dack");
    autor.setEmail("patrickdack@hotmail.com");
    autor.setCpf("123.456.789.10");;

		LivroFisico livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");;
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);;
		livro.setIsbn("978-85-66250-46-6");
    livro.setAutor(autor);

		livro.mostrarDetalhes();

    Autor outroAutor = new Autor();
    outroAutor.setNome("Cida Santos");;
    outroAutor.setEmail("cida@hotmail.com");;
    outroAutor.setCpf("123.456.789.11");;

		LivroFisico outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Criando os seus primeiros programas");
		outroLivro.setValor(59.90);;
		outroLivro.setIsbn("978-85-66250-22-0");
    outroLivro.setAutor(outroAutor);

		outroLivro.mostrarDetalhes();
	}
}
