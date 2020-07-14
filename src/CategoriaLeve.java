
public class CategoriaLeve implements CategoriaInterface {

	@Override
	public Integer peso() {
		return 70;
	}

	@Override
	public String name() {
		return "Leve";
	}

	@Override
	public boolean vaildade(final float peso) {
		return peso < peso();
	}
}
