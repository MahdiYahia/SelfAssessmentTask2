package self_assessment_task2;
import java.io.*;

public class CarManager {

	public static void main(String[] args) {
		Car[] cars = {
				new Car(1, "BMW", "3 Series", 2024, "grey", 45000, 127846),
				new Car(2, "BMW", "X5", 2020, "grey", 65000, 128930),
				new Car(3, "Mercedes-Benz", "C-Class", 2017, "blue", 46000, 190376),
				new Car(4, "Mercedes-Benz", "G-Class", 2019, "black", 146000, 203786),
				new Car(5, "Volkswagen", "Golf", 2021, "green", 26000, 256376),
				new Car(6, "Volkswagen", "Tiguan", 2023, "blue", 37000, 348903),
				new Car(7, "Porsche", "Macan", 2024, "black", 60000, 465776)
				};
		filterByMake(cars,"BMW");
		filterByAgeAndModel(cars,"X5",5);
	}

	public static void filterByMake(Car[] cars, String make) {
		try {
		String filename = make + "cars" + ".txt";
		PrintWriter outputFile = new PrintWriter(filename);
		for (Car car:cars) {
			if (car.getMake().equalsIgnoreCase(make)) {
				outputFile.println(car.carToString());
			}
		}
		outputFile.close();
	}
	catch(IOException e){
		System.err.println("Error:" + e.getMessage());	
	}
	}
	public static void filterByAgeAndModel(Car[] cars, String model, int minAge) {
		try {
		String filename = "min" + minAge + "years" + model + "cars" + ".txt";
		PrintWriter outputFile = new PrintWriter(filename);
		for (Car car:cars) {
			if (car.getModel().equalsIgnoreCase(model) && car.getYearsOfUse()>=minAge) {
				outputFile.println(car.carToString());
			}
		}
		outputFile.close();
	}
	catch(IOException e){
		System.err.println("Error:" + e.getMessage());	
	}
	}
	public static void filterByYearOfManufactureAndPrice(Car[] cars, int yearOfManufacture, double minPrice) {
		try {
		String filename = "Manufactured" + yearOfManufacture + "MoreExpensiveThan" + minPrice + "cars" + ".txt";
		PrintWriter outputFile = new PrintWriter(filename);
		for (Car car:cars) {
			if (car.getPrice()>=minPrice && car.getYearOfManufacture()==yearOfManufacture) {
				outputFile.println(car.carToString());
			}
		}
		outputFile.close();
	}
	catch(IOException e){
		System.err.println("Error:" + e.getMessage());	
	}
	}
}
