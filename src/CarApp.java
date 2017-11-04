/*
 * @author Siddique Khatri -- created on 11/4/2017
 */
import java.util.Scanner;

import java.util.ArrayList;


public class CarApp {

	public static void main(String[] args) {
		int option = 0;
		String buyChoice = "";
		String make = "";
		String model = "";
		int year = 0;
		double price = 0.00;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println();
		ArrayList<Car> carsList = new ArrayList<>();
		System.out.println("Current Inventory:");
		carsList.add(new Car("Ford", "Edge", 2017, 25000.15));
		carsList.add(new Car("Buick", "Enclave", 2017, 35000.36));
		carsList.add(new Car("Ford", "Focus", 2017, 31999.90));
		carsList.add(new UsedCar("Toyota", "Prius", 2012, 5000.00,"(Used)", 15000));
		carsList.add(new UsedCar("Ford", "Focus", 2012, 200.00, "(Used)", 140000));
		carsList.add(new UsedCar("Toyota", "Camry", 2002, 100.00,"(Used)", 12000));
		carsList.add(new UsedCar ("Toyota", "Corolla", 2001, 500.00, "(Used)", 50000));
		System.out.println();
		
		int counter = 1;
		System.out.printf("%d. " + carsList.toString().replace("[", "").replace("]", "").replace(",", "") + "\n", counter++);
		
		
		System.out.println("Which car would you like? (1-7)");
		option = scan.nextInt();
		
		System.out.println(carsList.get(option - 1)); //prints out the car the user has selected.
		
		System.out.println();
	
		Scanner scan2 = new Scanner(System.in); // this is required otherwise it will not be able to take in the additional input from user
		
		System.out.println("Would you like to buy this car? (y/n)");
		buyChoice = scan2.nextLine();
		
		
		if(buyChoice.equalsIgnoreCase("Y")) {
			System.out.println("Excellent! Our finance department will be in touch with you shortly.");
			carsList.remove((option -1)); 
			System.out.println();
			System.out.printf("%d. " + carsList.toString().replace("[", "").replace("]", "").replace(",", "") + "\n", counter++);
		}
		else {
			System.out.println("Goodbye!");
		}
		scan.close();
	}

	
}
