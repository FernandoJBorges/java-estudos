
public class Pessoa {

	private String nome;

	private int idade;

	private PessoaType sexo;

	public Pessoa(String nome, int idade, PessoaType sexo) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public PessoaType getSexo() {
		return sexo;
	}

	public void setSexo(PessoaType sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
