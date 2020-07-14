
public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private Integer totalPaginas;
	private Integer pagAtual;
	private boolean aberto;
	private Pessoa leitor;

	public Livro(String titulo, String autor, Integer totalPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totalPaginas = totalPaginas;
		this.leitor = leitor;
		setAberto(Boolean.FALSE);
		setPagAtual(0);
	}

	@Override
	public void abrir() {
		if (!aberto) {
			setAberto(Boolean.TRUE);
		}
	}

	@Override
	public void fechar() {
		if (aberto) {
			setAberto(Boolean.FALSE);
			setPagAtual(0);
		}
	}

	@Override
	public void folhear(Integer pagina) {
		setPagAtual(pagina);
	}

	@Override
	public void avancarPagina() {
		if (aberto && getPagAtual().intValue() < getTotalPaginas().intValue()) {
			setPagAtual(getPagAtual() + 1);
		}
	}

	@Override
	public void voltarPagina() {
		if (aberto && getPagAtual().intValue() != 1) {
			setPagAtual(getPagAtual() - 1);
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getTotalPaginas() {
		return totalPaginas;
	}

	public void setTotalPaginas(Integer totalPaginas) {
		this.totalPaginas = totalPaginas;
	}

	public Integer getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(Integer pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", totalPaginas=" + totalPaginas + ", pagAtual="
				+ pagAtual + ", aberto=" + aberto + ", leitor=" + leitor + "]";
	}

}
