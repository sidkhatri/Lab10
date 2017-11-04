/*
 * @author Siddique Khatri -- created on 11/4/2017
 */
public class UsedCar extends Car{
	private double mileage;
	private String make;
	private String model;
	private int year;
	private double price;
	private String used = "(Used)";
	
	//No-arguments constructor
	public UsedCar() {
		
	}

	//overloaded constructor
	public UsedCar(String make, String model, int year, double price, String used, double mileage) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.used = used;
		this.mileage = mileage;
	}

	//all of my getters and setters
	public double getMileage() {
		return mileage;
	}

	public String getUsed() {
		return used;
	}

	public void setUsed(String used) {
		this.used = used;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	@Override
	public String toString() {
		
		return ("	" + make  + "		"  + model + "\t		" +   year + "\t		" + "$" +  price + used + mileage + "\n");
		
	}

	
	
	
}
