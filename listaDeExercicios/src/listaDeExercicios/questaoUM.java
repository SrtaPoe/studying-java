package listaDeExercicios;


//questao 2
public class questaoUM {
	public static void main(String[] args) {
		
		int a = 8;
		int b = 9;
		int c = 7;
		
		double mediaAritmetica = (a + b + c)/ 3;
		//resultado 8
		
		System.out.println("A média n°1 é " + mediaAritmetica);
		
		int d = 4;
		int e = 5;
		int f = 6;
		//resultado 5
		
		double media_dois = ( d + e + f)/3;
		System.out.println("A média n°2 é " + media_dois);
		
		double soma_media = mediaAritmetica + media_dois;
		//resultado 13
		double media_medias = soma_media / 2;
		//resultado 6,5
		
		System.out.println(("A soma das médias é " + soma_media));
		System.out.println("A média das médias 1 e 2 é " + media_medias);
		
		
	}
	
	
}
