package listaDeExercicios;

import java.util.Scanner;

public class ListaPython {
	public static void main(String[] args) {
		//System.out.println("Olá,mundo!");
		
		
		//Scanner entrada = new Scanner(System.in);
		//System.out.println("Por favor, digite um número: ");
		//double numero = entrada.nextDouble();
		//System.out.println("O número informado foi " + numero);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Por favor, digite o primeiro número: ");
		double numero1 = entrada.nextDouble();
		System.out.println("Por favor, o segundo número: ");
		double numero2 = entrada.nextDouble();
		
		double soma = numero1 + numero2;
		System.out.println("A soma dos números informados é " + soma);
		
		entrada.close();
	}
}
