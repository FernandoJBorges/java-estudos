
public class CategoriaPesada implements CategoriaInterface {

	@Override
	public Integer peso() {
		return 120;
	}

	@Override
	public String name() {
		return "Pesado";
	}

	@Override
	public boolean vaildade(final float peso) {
		return peso < peso();
	}

}
