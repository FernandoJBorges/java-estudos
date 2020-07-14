
public class Luta {

	private boolean aprovada;
	private Lutador desafiado;
	private Lutador desafiantes;

	private int rounds;

	public void marcarLuta(Lutador desafiado, Lutador desafiantes) {
		if (desafiado.getCategoria().equals(desafiantes.getCategoria()) && !desafiado.equals(desafiantes)) {
			setAprovada(true);
			setDesafiado(desafiado);
			setDesafiantes(desafiantes);
		} else {
			setAprovada(false);
			setDesafiado(null);
			setDesafiantes(null);
		}
	}

	public void lutar() {
		if (aprovada) {
			getDesafiantes().apresentar();
			getDesafiado().apresentar();
		}
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiantes() {
		return desafiantes;
	}

	public void setDesafiantes(Lutador desafiantes) {
		this.desafiantes = desafiantes;
	}
}
