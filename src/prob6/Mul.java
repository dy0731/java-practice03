package prob6;

public class Mul extends Calc {
	
	//생성자
	public Mul(int a, int b) {
		super(a,b);
	}
	
	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return getA() * getB();
	}

}
