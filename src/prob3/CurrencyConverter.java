package prob3;

public class CurrencyConverter {
	
	//1달러에 해당하는 원화가격
	private static double rate;

	public static void setRate(double rate) {
		CurrencyConverter.rate = rate;
	}
	
	public static double toDollar(double won) {
		// 한국 원화를 달러로 변환
		return won / rate;
	}
	
	public static double toKRW(double dollar) {
		// 달러를 한국 원화로 변환
		return dollar * rate;
	}

}