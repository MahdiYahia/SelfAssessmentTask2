# Student Name: Mahdi Yahia
# Matriculation Number: 7221528
# SelfAssessmentTask2

The solution has two different classes.
* A "Car" class that has the different attributes of cars, getter methods to be used during filtering: getMake(), getModel(), get YearOfManufacture(), getPrice(); along with the methods: getYearsOfUse() to be used to calculate a car's age and carToString() to convert cars to strings that can be added to text files.
* A "CarManager" class that has the main thread and the functions used for filtering cars and registering found records into files: filterByMake(Car[] cars, String make) filters cars by brand, filterByAgeAndModel(Car[] cars, String model, int minAge)  filters cars by model and age, and filterByYearOfManufactureAndPrice(Car[] cars, int yearOfManufacture, double minPrice) filters cars by year of manufacture and price.

The text files in the repository are examples of the expected output.
