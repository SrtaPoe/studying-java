package listaDeExercicios;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite 0 raio: ");
		double raio = entrada.nextDouble();
		double pi = 3.14;
		double areaCirculo = pi*(raio*raio);
		System.out.println("A área do círculo é " + areaCirculo);
		
		entrada.close();
	}
}
