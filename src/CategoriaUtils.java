import java.util.Arrays;
import java.util.List;

public class CategoriaUtils {

	private static List<CategoriaInterface> categorias = Arrays.asList(new CategoriaInvalido(), new CategoriaLeve(),
			new CategoriaMedia(), new CategoriaPesada(), new CategoriaInvalidoPessado());

	private CategoriaUtils() {
	}

	public static CategoriaInterface get(final float peso) {
		CategoriaInterface categoriaSelecionada = null;
		for (CategoriaInterface categoria : categorias) {
			if (categoria.vaildade(peso)) {
				return categoria;
			}
		}
		return categoriaSelecionada;
	}
}
