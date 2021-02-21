package digitalinnovationone.interno;

public class Calculadora {
	
	private DivHelper divhelper;
	private MultiHelper multihelper;
	private SubHelper subhelper;
	private SumHelper sumhelper;
	
	public Calculadora() {
		divhelper = new DivHelper();
		multihelper = new MultiHelper();
		subhelper = new SubHelper();
		sumhelper = new SumHelper();
	}
	
	public int sum(int a , int b) {
		return sumhelper.execute(a, b);
	}
	public int sub(int a, int b) {
		return subhelper.execute(a, b);
	}
	public int multi(int a, int b) {
		return multihelper.execute(a, b);
	}
	public int div(int a, int b) {
		return divhelper.execute(a, b);
	}
}
