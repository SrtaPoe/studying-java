package listaDeExercicios;

import java.util.Scanner;

public class CelsiusFahrenheit {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a temperatura a ser convertida: ");
		float farenheit = entrada.nextFloat();
		
		float conversorFarenheit = (float) 1.8 * farenheit + 32;
		System.out.println("A temperatura em Farenheit é " + conversorFarenheit);
		
		entrada.close();
	}
}
	
