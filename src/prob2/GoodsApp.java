package prob2;

import java.util.Scanner;

public class GoodsApp {
	public static void main(String args[]) {
		
		//자원생성
		Scanner scanner = new Scanner(System.in);
		
		Goods[] goods = new Goods[3];
		
		/* 입력*/
		for(int i = 0; i < goods.length; i++) {
			
			String line = scanner.nextLine();
			
			String[] infos = line.split(" ");
			
			String name = infos[0];
			int price = Integer.parseInt(infos[1]);
			int stockCount = Integer.parseInt(infos[2]);
			
			goods[i] = new Goods(name, price, stockCount);
		}
		
		/* 출력 */
		for(int i = 0; i < goods.length; i++) {
			goods[i].showInfo();
		}

		/* 키보드 닫기 */
		scanner.close();
	}
}
