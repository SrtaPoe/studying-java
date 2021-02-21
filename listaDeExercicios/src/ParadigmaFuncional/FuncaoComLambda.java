package ParadigmaFuncional;

public class FuncaoComLambda {
	public static void main(String[] args) {
		//importando interface FUNCAO
		Funcao colocarPrefixoSenhorNaString = valor -> "Sr. "+valor;
		System.out.println(colocarPrefixoSenhorNaString.gerar("João"));
	}
}
