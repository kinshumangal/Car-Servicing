package com.carservicing;

import java.time.LocalDate;
import java.util.*;

public class LastSrvData {
	private int odoReading;
	private ArrayList<String> issue = new ArrayList<>();
	private LocalDate dateOfServies;
	private double amntPaid = 0;

	public int getOdoReading() {
		return odoReading;
	}

	public ArrayList<String> getIssue() {
		return issue;
	}


	public LocalDate getDateOfServies() {
		return dateOfServies;
	}


	public double getAmntPaid() {
		return amntPaid;
	}


	public void setOdoReading(int odoReading) {
		this.odoReading = odoReading;
	}

	public void setIssue(ArrayList<String> issue) {
		this.issue = issue;
	}

	public void setDateOfServies(LocalDate dateOfServies) {
		this.dateOfServies = dateOfServies;
	}


	public void setAmntPaid(double amntPaid) {
		this.amntPaid = amntPaid;
	}


	public String getDetails() {
		String details = "Odo: "+getOdoReading()+"\nIssues: "+getIssue() + "\nDate: "+getDateOfServies()+
				"\nAmount: "+getAmntPaid()+"\n";
		return details;
	}
	public void printDetails() {
		System.out.println("	Odo: "+getOdoReading()+"\n	Issues: ");
		System.out.println("	"+getIssue());
		System.out.println("	Date: "+getDateOfServies()+"\n	Amount: "+getAmntPaid()+"\n");
	}
}
