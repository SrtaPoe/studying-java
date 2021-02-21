package ParadigmaFuncional;

import java.util.function.UnaryOperator;

public class Imutabilidade {
	public static void main(String[] args) {
		int valor = 40;
		UnaryOperator<Integer> retornarDobro = v -> v * 2;
		System.out.println(retornarDobro.apply(valor));//dobro do valor como retorno
		System.out.println(valor);//valor sem alteracao
	}
}
