package prob6;

public class Div extends Calc {

	//생성자
	public Div(int a, int b) {
		super(a,b);
	}
	
	@Override
	public int calculate() {
		// TODO Auto-generated method stub
		return getA() / getB();
	}

}
