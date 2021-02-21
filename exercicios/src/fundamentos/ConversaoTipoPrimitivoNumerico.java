package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1;//implícita
		System.out.println(a);
		
		
		//cast - conversão explícita
		float b = (float) 1.55555666;
		System.out.println(b);
		
		int c = 155;
		byte d = (byte) c;//EXPLÍCITA
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e; // explicita(CAST)
		System.out.println(f);
	}
}
