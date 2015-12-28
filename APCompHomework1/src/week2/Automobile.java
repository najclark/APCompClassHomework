package week2;

public class Automobile {

	private double mpg, gallons;
	
	public Automobile(double mpg){
		gallons = 0;
		this.mpg = mpg;
	}
	
	public void fillUp(double gallons){
		this.gallons += gallons;
	}
	
	public void takeTrip(double miles){
		gallons -= miles/mpg;
	}
	
	public double reportFuel(){
		return gallons;
	}
	
}
