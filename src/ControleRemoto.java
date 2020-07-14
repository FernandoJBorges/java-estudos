
public class ControleRemoto implements Controlador {

	private int volume;
	private boolean ligado;
	private boolean tocando;

	public ControleRemoto() {
		setVolume(50);
		setLigado(false);
		setTocando(false);
	}

	@Override
	public void ligar() {
		setLigado(true);
	}

	@Override
	public void desligar() {
		setLigado(false);
	}

	@Override
	public void abrirMenu() {
		System.out.println("Esta Ligado: " + this.isLigado());
		System.out.println("Esta Tocando: " + this.isTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i < this.getVolume(); i += 10) {
			System.out.println("[]");
		}

	}

	@Override
	public void fecharMenu() {
		System.out.println("Fechadno Menu");

	}

	@Override
	public void maisVolume() {
		if (isLigado()) {
			setVolume(getVolume() + 5);
		} else {
			System.out.println("Nao foi possivel aumentar o som");
		}

	}

	@Override
	public void menosVolume() {
		if (isLigado()) {
			setVolume(getVolume() + 5);
		} else {
			System.out.println("Nao foi possivel diminuir o som");
		}

	}

	@Override
	public void ligarMudo() {
		if (isLigado() && getVolume() > 0) {
			setVolume(0);
		}

	}

	@Override
	public void desigarMudo() {
		if (isLigado() && getVolume() > 0) {
			setVolume(5);
		}

	}

	@Override
	public void play() {
		if (isLigado() && !isTocando()) {
			setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (isLigado() && isTocando()) {
			setTocando(false);
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean isTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
}
