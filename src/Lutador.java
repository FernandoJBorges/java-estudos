
public class Lutador {

	private String nome;
	private String categoria;
	private String nacionalidade;
	private float altura;
	private float peso;
	private Integer vistorias;
	private Integer derrotas;
	private Integer empates;

	public Lutador(String nome, String nacionalidade, float altura, float peso, Integer vistorias, Integer derrotas,
			Integer empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
		this.vistorias = vistorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("CHEGOU A HORA!!! Apresentamos o lutador" + this.getNome());
		System.out.println("Do : " + this.getNacionalidade());
		System.out.println("Com altura de: " + this.getAltura());
		System.out.println("Com Peso de: " + this.getPeso());
		System.out.println("Total de Derotas: " + this.getDerrotas());
		System.out.println("Total de Empates: " + this.getEmpates());
		System.out.println("Total de Vitorias: " + this.getVistorias());
		System.out.println("--------------------------------------------------------------------------------------");
	}

	public void status() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("Lutador" + this.getNome());
		System.out.println("Derotas: " + this.getDerrotas());
		System.out.println("Empates: " + this.getEmpates());
		System.out.println("Vitorias: " + this.getVistorias());
		System.out.println("--------------------------------------------------------------------------------------");
	}

	public void ganharLuta() {
		this.setVistorias(getVistorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		categoria = CategoriaUtils.get(this.getPeso()).name();
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Integer getVistorias() {
		return vistorias;
	}

	public void setVistorias(Integer vistorias) {
		this.vistorias = vistorias;
	}

	public Integer getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(Integer derrotas) {
		this.derrotas = derrotas;
	}

	public Integer getEmpates() {
		return empates;
	}

	public void setEmpates(Integer empates) {
		this.empates = empates;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

}
