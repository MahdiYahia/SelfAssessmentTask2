package self_assessment_task2;
import java.time.*;
public class Car {

	int id;
	String make;
	String model;
	int yearOfManufacture;
	String color;
	double price;
	int registrationNumber;
	
	public Car(int id, String make, String model, int yearOfManufacture, String color,	double price, int registrationNumber) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.color = color;
		this.price = price;
		this.registrationNumber = registrationNumber;
	}
	
	public String carToString() {
		return "id = "+ id+ ", Make = "+ make + ", Model = "+ model + ", Year of Manufacture = "+ yearOfManufacture +", Color = "+ color+ ", Price = "+ price + ", Registration Number = " + registrationNumber;
	}
	public String getMake() {
		return this.make;
	}
	public String getModel() {
		return this.model;
	}
	public int getYearsOfUse() {
		int currentYear = LocalDate.now().getYear();
		return  currentYear- this.yearOfManufacture;
	}
	public int getYearOfManufacture() {
		return this.yearOfManufacture;
	}
	public double getPrice() {
		return this.price;
	}
}
