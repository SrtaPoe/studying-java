package listaDeExercicios;

import java.util.Scanner;

public class HorasTrabalhadas {
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o valor de sua hora: ");
		double valorHora = entrada.nextDouble();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		double horasTrabalhadas = entrada.nextDouble();
		
		double salario = valorHora * horasTrabalhadas;
		System.out.println("O valor de seu salário é " + salario);
		
		entrada.close();
	}
}
