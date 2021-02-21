package listaDeExercicios;

import java.util.Scanner;

public class MetrosCentimetros {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a medida a ser convertida: ");
		float medidaMetro = entrada.nextFloat();
		
		float conversaoMetrosCentimetros = medidaMetro * 100;
		System.out.println("A medida em metros corresponde a " + conversaoMetrosCentimetros + "cm");
		
		entrada.close();
	}
	
}
