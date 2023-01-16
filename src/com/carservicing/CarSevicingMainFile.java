package com.carservicing;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class CarSevicingMainFile extends Validation {
	public static void displayDetails(Car car) {
		System.out.println("------------------------Details--------------------------");
		System.out.println("Car company name: "+car.getCarCompanyName());
		System.out.println("Car model: "+car.getCarModel());
		System.out.println("Year of purchase: "+car.getYearOfPerchase());
		System.out.println("Number of owner: "+car.getNumberOfOwner());
		System.out.println("Car registation number: "+car.getCarRegistrationNum());
		System.out.println("Last Serivice data: ");
		for(LastSrvData i : car.getLastServiceData()) {
			i.printDetails();
		}
		System.out.println("Odometer reading: "+car.getOdoReading());
		System.out.println("Insurance number: "+car.getInsuranceNum());
		System.out.println("Insurance expriry date: "+car.getInsuranceExpDate());
		System.out.println("Insurance type: "+car.getInsuranceType());
		System.out.println("Insurance premium amount paid: "+car.getInsPremAmntPaid());
		System.out.println("Chassis number: "+car.getChassisNum());
		System.out.println("Engine number: "+car.getEngineNum());
		System.out.println("---------------------------------------------------------");
	}

	public static void addCar(HashMap<String, Car> carDatabase ) {
		Scanner scan=new Scanner(System.in);
		//scan.nextLine();
		System.out.println("Please enter the following information: ");
		Car car = new Car();
		System.out.println("Enter car company name: ");
		String carName = scan.nextLine();
		car.setCarCompanyName(carName);
		System.out.println("Enter car model name: ");
		String carModelName = scan.nextLine();
		car.setCarModel(carModelName);
		System.out.println("Enter Year of purchase: ");
		int year = scan.nextInt();
		car.setYearOfPerchase(year);
		System.out.println("Enter car number of owner: ");
		long mobNum = scan.nextLong();
		car.setNumberOfOwner(mobNum);
		System.out.println("Enter car registration number: ");
		String carRegNum = scan.next();
		car.setCarRegistrationNum(carRegNum);
		System.out.print("Enter Number of miles driven: ");
		int odoReading = scan.nextInt();
		car.setOdoReading(odoReading);
		System.out.println("Enter Insurance Number: ");
		long insNum = scan.nextLong();
		car.setInsuranceNum(insNum);
		System.out.println("Enter insurance expiry date in format of (DD/MM/YYYY): ");
		String insExpDate = scan.next();
		while(!validateDate(insExpDate)) {
			System.out.println("Invalid Password\nEnter again in format of (DD/MM/YYYY)");
			insExpDate = scan.next();
		}
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     LocalDate insexpDate = LocalDate.parse(insExpDate, formatter);
		car.setInsuranceExpDate(insexpDate);
		System.out.println("Enter insurance type: ");
		String insType = scan.next();
		car.setInsuranceType(insType);
		System.out.println("Enter insurance premium amount paid: ");
		double amntpaid = scan.nextDouble();
		car.setInsPremAmntPaid(amntpaid);
		System.out.println("Enter Chassis number: ");
		long chassisNum = scan.nextLong();
		car.setChassisNum(chassisNum);
		System.out.println("Enter Engine number: ");
		long engineNum = scan.nextLong();
		car.setEngineNum(engineNum);
//		Car car = new Car(carName, carModelName, year, mobNum, carRegNum, odoReading, insNum, insexpDate, insType, amntpaid, chassisNum, engineNum )
		carDatabase.put(carRegNum, car);
		System.out.println("--------------------------------------------------\n");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Car Servicing application!");
		HashMap<String, Car> carDatabase = new HashMap<String, Car>();
		HashMap<String, ArrayList<String>> data = new HashMap<>();
		boolean test = true;
		while(test) {
			System.out.println("------------------------MENU----------------------------");
			System.out.println("1. Enter 1 for Create new Car");
			System.out.println("2. Enter 2 for Print all car details");
			System.out.println("3. Enter 3 for Update insurance");
			System.out.println("4. Enter 4 for Drop car to servies");
			System.out.println("5. Enter 5 for pick up car from servies");
			System.out.println("6. Enter 6 for exit");
			System.out.println("--------------------------------------------------------\n");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
			{
				addCar(carDatabase);
			}
			break;
			
			case 2:
			{
				if(carDatabase.isEmpty()) {
					System.out.println("No car is present\n");
				}else {
					for(Map.Entry<String , Car> car:carDatabase.entrySet()) {
						displayDetails(car.getValue());
					}
				}
			}
			break;
			
			case 3:
			{
				System.out.println("Enter car registration number: ");
				String regNum = scan.next();
				if(!carDatabase.containsKey(regNum)) {
					System.out.println("Car is not found");
				}else {
					
					System.out.println("Enter premium amount: ");
					double premamnt = scan.nextDouble();
					System.out.println("Enter insurance number: ");
					long insNum = scan.nextLong();
					System.out.println("Enter insurance type: ");
					String insType = scan.next();
					System.out.println("Enter insurance expiry date in format of (DD/MM/YYYY): ");
					String insExpDate = scan.next();
					while(!validateDate(insExpDate)) {
						System.out.println("Invalid Password\nEnter again in format of (DD/MM/YYYY)");
						insExpDate = scan.next();
					}
					 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				     LocalDate insexpDate = LocalDate.parse(insExpDate, formatter);
				     Car car = carDatabase.get(regNum);
				     LocalDate previousDate = car.getInsuranceExpDate();
				     if(previousDate.compareTo(insexpDate)<0) {
				    	 car.setInsPremAmntPaid(premamnt);
				    	 car.setInsuranceNum(insNum);
				    	 car.setInsuranceType(insType);
				    	 car.setInsuranceExpDate(insexpDate);
				     }
					displayDetails(car);
				}
			}
			break;
			
			case 4:
			{
				System.out.println("Enter car registration number");
				String carRegNum = scan.next();
				if(!carDatabase.containsKey(carRegNum)) {
					System.out.println("Please first add car");
				}else {	
					data.put(carRegNum, ServiceStation.addCar(carDatabase.get(carRegNum)));
				}
			}
			break;
			
			case 5:
			{
				System.out.println("Enter car registration number: ");
				String carRegNum = scan.next();
				if(!carDatabase.containsKey(carRegNum)) {
					System.out.println("Please first create car. ");
				}else if(!data.containsKey(carRegNum)) {
					System.out.println("First drop car for service. ");
				}
				else {
					Car car = ServiceStation.serviceCar(carRegNum, carDatabase.get(carRegNum), data);
					carDatabase.put(carRegNum, car);
					data.remove(carRegNum);
				}
			}
			break;
			
			case 6:
				test = false;
				break;
			default:
				System.out.println("Invalid Input!, Try Again\n");
			}
		}

	}

}
