package fundamentos;

import java.util.Scanner;
//import para entrada de dados 

public class Console {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//entrada de dados
		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();		
		System.out.println("\n\nNome = " + nome);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s tem %d anos ", nome, idade);
		entrada.close();
	}
}
