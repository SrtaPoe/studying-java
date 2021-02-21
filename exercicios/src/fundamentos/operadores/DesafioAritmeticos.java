package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		
		int a = 6;
		int b = 3 + 2;
		int c = 3 * 2;
		
		double resultado = a*b;
		double potencia1 = Math.pow(resultado, 2);
		double resultadofinal = potencia1 / c;

		System.out.println(resultado);
		System.out.println(resultadofinal);
		
		//primeira expressao correta
		
		int d = 1 - 5;
		int f = 2 - 7;
		int g = 2;
		
		double resultado2 = (d)*(f)/g;
		System.out.println(resultado2);
		double potencia2 = Math.pow(resultado2, 2);
		System.out.println(potencia2);
		//segunda expressa correta
		
		
		double parcialResultado = resultadofinal - potencia2;
		
		System.out.println(parcialResultado);
		
		double final1 = Math.pow(parcialResultado, 3);
		double final2 = Math.pow(10, 3);
		
		System.out.println(final1);
		System.out.println(final2);
		
		
		double finalreal = final1/final2;
		System.out.println("O resultado da expressão numérica é " + finalreal);
	}
}
