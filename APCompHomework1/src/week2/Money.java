package week2;

public class Money {
	
	int dollars, cents;
	//default constructor
	public Money(){
		dollars = 0;
		cents = 0;
	}
	//specific constructor
	public Money(int d, int c){
		dollars = d;
		cents = c;
	}
	//returns number of dollars
	public int getDollars(){
		return dollars;
	}
	//returns number of cents
	public int getCents(){
		return cents;
	}
	//sets the amount of dollars
	public void setDollars(int d){
		dollars = d;
	}
	//sets the amount of cents
	public void setCents(int c){
		cents = c;
		normalize();
	}
	//normalizes the cents value
	private void normalize(){
		if(cents >= 100){
			dollars += cents/100;
			cents %= 100;
		}
	}
	//returns the money normalized
	public double getNormalized(){
		this.normalize();
		return getMoney();
	}
	//returns the money as a double
	public double getMoney(){
		return dollars + (double)(cents)/100;
	}
	//adds two money amounts
	public double addMoney(double a, double b){
		return a+b;
	}
	//subtracts two money amounts
	public double subMoney(double a, double b){
		return a-b;
	}
	//divides two money amounts
	public double divideMoney(double amt, double div){
		return amt/div;
	}

}
