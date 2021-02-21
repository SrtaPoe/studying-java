package fundamentos.operadores;

public class DesafioTabelaVerdade {
	public static void main(String[] args) {
		//trabalho na terça (V ou F)
		//trabalho na quinta (V ou F)
		
		boolean trabalhoterca =  true;
		boolean trabalhoquinta = true;
		boolean comprouTV50 = trabalhoterca && trabalhoquinta;
		boolean comprouTV32 = trabalhoterca ^ trabalhoquinta;
		boolean comprouSorvete = trabalhoterca || trabalhoquinta;
	
		
		System.out.println("Comprou TV 50? " + comprouTV50);
		System.out.println("Comprou TV 32? " +comprouTV32);
		System.out.println("Comprou TV 32 e sorvete? " + comprouSorvete);
		
		//operador unário
		boolean maisSaudavel = !comprouSorvete;
		System.out.println("Mais saudáve? " + maisSaudavel);
		
		
	}
}
