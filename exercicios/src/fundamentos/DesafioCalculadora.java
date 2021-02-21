package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número: ");
		double num1 = entrada.nextDouble();
		
		
		System.out.println("Digite o número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a operação: ");
		String op = entrada.next();
		
		System.out.printf(" %.2f %s %.2f = ?", num1, op, num2);
		entrada.close();
	
		
	}
}
