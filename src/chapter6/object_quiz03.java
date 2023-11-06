package chapter6;

public class object_quiz03 {

	public static void main(String[] args) {

		Customer customer1 = new Customer("둘리", 10000);
		Cafe cafe = new Cafe("별다방");
		customer1.buyAme(cafe);
		customer1.buyLatte(cafe);
		customer1.showInfo();
		cafe.showInfo();

	}

}

class Cafe {
	String cafeName;
	int money;

	public Cafe(String cafeName) {
		this.cafeName = cafeName;
	}

	public void sellCoffee(int money) {
		this.money = this.money + money;
	}

	public void showInfo() {
		System.out.println("카페 " + cafeName + "의 수입은 " + money + "입니다.");
	}
}

class Customer {
	String customerName;
	int money;

	public Customer(String customerName, int money) {
		super();
		this.customerName = customerName;
		this.money = money;
	}

	public void buyAme(Cafe cafe) {
		this.money = this.money - 4000;
		cafe.sellCoffee(4000);
	}

	public void buyLatte(Cafe cafe) {
		this.money = this.money - 4500;
		cafe.sellCoffee(4500);
	}

	public void showInfo() {
		System.out.println(customerName + "의 남은 돈은 " + money + "입니다.");
	}
}
