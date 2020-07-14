
public class CategoriaInvalido implements CategoriaInterface {

	@Override
	public Integer peso() {
		return 52;
	}

	@Override
	public String name() {
		return "Invalido - Muito Leve";
	}

	@Override
	public boolean vaildade(final float peso) {
		return peso < peso();
	}

}
