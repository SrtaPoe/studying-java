package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		
		
		double media = 3.6;
		String recuperacao = media>5 ? "RECUPERACÃO" : "REPROVADO";
		String resultado = media>=7 ? "APROVADO" : recuperacao;
		System.out.println(resultado);
	}
}
