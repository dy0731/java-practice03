package prob6;

public class Sub extends Calc {
	
	//생성자
	public Sub(int a, int b) {
		super(a,b);
	}
	
	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return getA() - getB();
	}

}
