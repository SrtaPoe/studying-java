package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		double a = 2.3;
		String s = "bonjour, X";
		s = s.replace("X", "Você");//substitui algo do texto
		s = s.toUpperCase();//tudo em masiculo
		s = s.concat("!!!");//concatenando
		
		System.out.println(s);
		
		String x = "Joanice".toUpperCase();
		System.out.println(x);
		
		int y = "Buongiorno".length();
		System.out.println(y);
	}
	
	
}
