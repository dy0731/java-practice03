package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);

		while (true) {
			
			System.out.print(">> ");
			
			String expression = scanner.nextLine();
			
			if( "quit".equals( expression ) == true ) {
				break;
			}
			
			String[] tokens = expression.split(" ");
			String operator = tokens[1];
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			
			
			
			switch( operator ) {
				case "+" : {
					Calc c = new Add(a, b);
					System.out.println(">> "+ c.calculate());
					break;
				}
				case "-" : {
					Calc c = new Sub(a, b);
					System.out.println(">> "+ c.calculate());
					break;
				}
				case "*" : {
					Calc c = new Mul(a, b);
					System.out.println(">> "+ c.calculate());
					break;
				}
				case "/" :{
					Calc c = new Div(a, b);
					System.out.println(">> "+ c.calculate());
					break;
				}
				
				default : {
					System.out.println("4칙연산만 사용해주세요.");
					break;
				}
			}
		}
		
		System.out.println("연산이 종료되었습니다.");
		
		//자원해제
		scanner.close();
	}
}
