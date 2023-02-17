package com.carservicing;

import java.time.LocalDate;
import java.util.*;

public class Car {
	private String carCompanyName, carModel, insuranceType, carRegistrationNum;
	private int yearOfPerchase, odoReading;
	private long numberOfOwner, insuranceNum, chassisNum, engineNum;
	private LocalDate insuranceExpDate;
	private double insPremAmntPaid;
	private ArrayList<LastSrvData> lastServiceData = new ArrayList<>();
	
	public String getCarCompanyName() {
		return carCompanyName;
	}
	public String getCarModel() {
		return carModel;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public String getCarRegistrationNum() {
		return carRegistrationNum;
	}
	public int getYearOfPerchase() {
		return yearOfPerchase;
	}
	public int getOdoReading() {
		return odoReading;
	}
	public long getNumberOfOwner() {
		return numberOfOwner;
	}
//	public Car(String carCompanyName, String carModel, int yearOfPerchase, long numberOfOwner,
//			String carRegistrationNum, int odoReading, long insuranceNum,
//			LocalDate insuranceExpDate, String insuranceType, double insPremAmntPaid, long chassisNum, long engineNum) {
//		super();
//		this.carCompanyName = carCompanyName;
//		this.carModel = carModel;
//		this.yearOfPerchase = yearOfPerchase;
//		this.numberOfOwner = numberOfOwner;
//		this.carRegistrationNum = carRegistrationNum;
//		this.lastServiceData = lastServiceData;
//		this.odoReading = odoReading;
//		this.insuranceNum = insuranceNum;
//		this.insuranceExpDate = insuranceExpDate;
//		this.insuranceType = insuranceType;
//		this.insPremAmntPaid = insPremAmntPaid;
//		this.chassisNum = chassisNum;
//		this.engineNum = engineNum;
//	}
	public long getInsuranceNum() {
		return insuranceNum;
	}
	public long getChassisNum() {
		return chassisNum;
	}
	public long getEngineNum() {
		return engineNum;
	}
	
	public double getInsPremAmntPaid() {
		return insPremAmntPaid;
	}
	public ArrayList<LastSrvData> getLastServiceData() {
		return lastServiceData;
	}
	public void setCarCompanyName(String carCompanyName) {
		this.carCompanyName = carCompanyName;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public void setCarRegistrationNum(String carRegistrationNum) {
		this.carRegistrationNum = carRegistrationNum;
	}
	public void setYearOfPerchase(int yearOfPerchase) {
		this.yearOfPerchase = yearOfPerchase;
	}
	public void setOdoReading(int odoReading) {
		this.odoReading = odoReading;
	}
	public void setNumberOfOwner(long numberOfOwner) {
		this.numberOfOwner = numberOfOwner;
	}
	public void setInsuranceNum(long insuranceNum) {
		this.insuranceNum = insuranceNum;
	}
	
	
	public void setChassisNum(long chassisNum) {
		this.chassisNum = chassisNum;
	}
	public void setEngineNum(long engineNum) {
		this.engineNum = engineNum;
	}
	public void setInsPremAmntPaid(double insPremAmntPaid) {
		this.insPremAmntPaid = insPremAmntPaid;
	}
	public void setLastServiceData(ArrayList<LastSrvData> lastServiceData) {
		this.lastServiceData = lastServiceData;
	}
	public void setLastServiceData(LastSrvData lastServiceData) {
		this.lastServiceData.add(lastServiceData);
	}
	public LocalDate getInsuranceExpDate() {
		return insuranceExpDate;
	}
	public void setInsuranceExpDate(LocalDate insuranceExpDate) {
		this.insuranceExpDate = insuranceExpDate;
	}
	
	
}
