
public class CategoriaMedia implements CategoriaInterface {

	@Override
	public Integer peso() {
		return 83;
	}

	@Override
	public String name() {
		return "Medio";
	}

	@Override
	public boolean vaildade(final float peso) {
		return peso < peso();
	}
}
