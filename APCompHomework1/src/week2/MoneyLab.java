package week2;

public class MoneyLab {

	public static void main(String[] args) {
		
		int d = 10, c = 50;
		
		Money m1 = new Money();
		Money m2 = new Money(d, c);
		
		m2.setCents(154);
		System.out.println("$" + m2.getMoney());
		
		System.out.println(m2.getNormalized());
		
	}

}
