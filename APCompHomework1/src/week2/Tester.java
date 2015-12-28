package week2;

public class Tester {

	public static void main(String[] args) {
		Automobile myBmw = new Automobile(24);
		myBmw.fillUp(20);
		myBmw.takeTrip(100);
		System.out.println(myBmw.reportFuel());
	}

}
