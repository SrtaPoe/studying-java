package listaDeExercicios;

import java.util.Scanner;

public class ParteDoisPython {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double notaUm = entrada.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double notaDois = entrada.nextDouble();
		System.out.println("Digite a terceira nota: ");
		double notaTres = entrada.nextDouble();
		System.out.println("Digite a quarta nota: ");
		double notaQuatro = entrada.nextDouble();
		
		
		double media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
		System.out.println("A média é " + media);
	}
}
