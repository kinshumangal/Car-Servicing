package com.carservicing;

import java.time.LocalDate;
import java.util.*;

public class ServiceStation {
	private String name = "Sas car servicing";
	private String address = "Domlur, Bangalore";
	private ArrayList<String> issues = new ArrayList<>();
	private static ArrayList<String> currentCarList = new ArrayList<String>();
	public static void setCurrentCarList(String carRegNum) {
		currentCarList.add(carRegNum);
	}
	public static ArrayList<String> addCar(Car car) {
		Scanner scan = new Scanner(System.in);
		setCurrentCarList(car.getCarRegistrationNum());
		System.out.println("Enter odometer reading: ");
		int odoReading = scan.nextInt();
		car.setOdoReading(odoReading);
		System.out.println("Enter your issues comma(,) saparated ");
		scan.nextLine();
		String issue = scan.nextLine();
		String []issueArr = issue.split(",");
		ArrayList<String> list = new ArrayList<>();
		Arrays.stream(issueArr).forEach(list::add);
		//HashMap<String, ArrayList<String>> data = new HashMap<>();
		return list;
	}
	
	public static Car serviceCar(String carRegNum, Car car, HashMap carList) {
		Scanner scan = new Scanner(System.in);
		LastSrvData data = new LastSrvData();
		//data.setIssue(carList.get(car.getCarRegistrationNum()));
		//data.setIssue(carList.get(carRegNum));
		ArrayList<String> issue = (ArrayList<String>) carList.get(carRegNum);
		data.setIssue(issue);
		
		System.out.println("Enter bill amount paid: ");
		double billAmnt = scan.nextDouble();
		data.setAmntPaid(billAmnt);
		LocalDate currentDate = LocalDate.now();
		data.setDateOfServies(currentDate);
		car.setLastServiceData(data);
		data.setOdoReading(car.getOdoReading());
		return car;
	}
}
