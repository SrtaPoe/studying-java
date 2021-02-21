package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		
		double fahrenheit = 65;
		final double apoiador = 32;
		final double fatorUm = 5;
		final double fator = 9;
		
		double celsius = (fahrenheit - apoiador) * fatorUm / fator;
		System.out.println(celsius);
	}
	

}
