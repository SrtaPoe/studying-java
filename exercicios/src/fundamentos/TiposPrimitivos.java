package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_233L; //L para especificar o long 
		
		//tipos numéricos reais
		float salario = 11_445.44F;
		//literal float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false;
		
		//tipo caractere
		char status = 'A'; //ativo
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? "+ estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
