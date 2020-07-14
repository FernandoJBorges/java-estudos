/**
 * 
 */

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] pessoa = new Pessoa[2];
		Livro[] livro = new Livro[3];

		pessoa[0] = new Pessoa("Fernando", 10, PessoaType.MASCULINO);
		pessoa[1] = new Pessoa("Claudia", 10, PessoaType.FEMININO);

		livro[0] = new Livro("Java", "Romi Jones", 50, pessoa[0]);
		livro[1] = new Livro("PHP", "João Berges", 30, pessoa[1]);
		livro[2] = new Livro("C#", "Fernando J Borges", 10, pessoa[0]);

		livro[2].abrir();
		livro[2].avancarPagina();
		livro[2].avancarPagina();
		livro[2].avancarPagina();
		livro[2].avancarPagina();
		livro[2].avancarPagina();

		System.out.println(livro[2].toString());
		
		livro[1].abrir();
		livro[1].avancarPagina();
		livro[1].avancarPagina();
		livro[1].avancarPagina();
		livro[1].avancarPagina();
		livro[1].avancarPagina();
		livro[1].avancarPagina();
		livro[1].avancarPagina();

		System.out.println(livro[1].toString());
		livro[0].abrir();
		livro[0].avancarPagina();
		livro[0].fechar();

		System.out.println(livro[0].toString());

	}

}
