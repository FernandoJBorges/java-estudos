
public class CategoriaInvalidoPessado implements CategoriaInterface {

	@Override
	public Integer peso() {
		return 120;
	}

	@Override
	public String name() {
		return "Invalido - Muito Pesado";
	}

	@Override
	public boolean vaildade(final float peso) {
		return peso >= peso();
	}
}
