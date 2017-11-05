/*
 * @author Siddique Khatri -- created on 11/2/2017
 */
public class Car {

	private String carMake;
	private String carModel;
	private int year;
	private double price;

	// No-arguments constructor
	public Car() {

	}

	// overloaded constructor
	public Car(String make, String model, int modelYear, double value) {
		carMake = make;
		carModel = model;
		year = modelYear;
		price = value;
	}

	// overriding the toString() method
	@Override
	public String toString() {

		return ("	" + carMake + "		" + carModel + "\t		" + year + "\t		" + "$" + price + "\n");

	}

	// all of my getters and setters
	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
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

}
