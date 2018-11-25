package prob6;

public abstract class Calc {
	private int a;
	private int b;
	
	//생성자
	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	//값 셋팅
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public abstract int calculate();
}
