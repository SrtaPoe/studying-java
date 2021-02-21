package ParadigmaFuncional;

import java.util.function.Function;

public class NomeInverso {
	public static void main(String[] args) {
		Function<String, String> retornarNomeInverso = texto -> new StringBuilder(texto).reverse().toString();
		System.out.println(retornarNomeInverso.apply("Java"));
	}
}
