package prob2;

public class Goods {
	
	public Goods(String name, int price, int stockCount) {
		this.name = name;
		this.price = price;
		this.stockCount = stockCount;
	}
	
	//상품명
	private String name;
	
	//가격
	private int price;
	
	//재고량
	private int stockCount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	
	public void showInfo() {
		System.out.println(this.name + "(가격:" + this.price + "원)이 " + this.stockCount + "개 입고 되었습니다.");
	}
}
