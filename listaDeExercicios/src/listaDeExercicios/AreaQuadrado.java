package listaDeExercicios;

import java.util.Scanner;

public class AreaQuadrado {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor dos lados: ");
		double lado = entrada.nextDouble();
		double areaQuadrado = lado * lado;
		double dobroQuadrado = areaQuadrado * 2;
		
		System.out.println("O dobro da área do quadrado é " + dobroQuadrado);
		
		entrada.close();
	}
}
