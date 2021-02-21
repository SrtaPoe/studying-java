package listaDeExercicios;

import java.util.Scanner;

public class ConversorTemperatura {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura a ser convertida: ");
		float fahrenheit = entrada.nextFloat();
		
		float conversorCelsius = 5 *((fahrenheit - 32) /9);
		System.out.println("A temperatura em Celsius é " + conversorCelsius);
		
		entrada.close();
	}
}
