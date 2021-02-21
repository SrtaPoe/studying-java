package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("Hello World".charAt(8));
		System.out.println(s.startsWith("He"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("hello world"));
		
		
		
		var nome = "Joanice";
		var sobrenome = "Oliveira";
		var idade = 29;
		var salario = 3.000;
		
		System.out.printf(" A senhorita %s %s tem %d e recebe %f de salário" , nome, sobrenome,
				idade, salario);
		
		//String.format = para fazer a mesma coisa do printf
	}
	
	
}
