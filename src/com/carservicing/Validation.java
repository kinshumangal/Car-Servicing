package com.carservicing;

public class Validation {
	public static boolean validateDate (String date) {
		if(date.length()==10) {
			if(Character.isDigit(date.charAt(0)) && Character.isDigit(date.charAt(1))  && Character.isDigit(date.charAt(3))
					&& Character.isDigit(date.charAt(4)) && Character.isDigit(date.charAt(6)) && Character.isDigit(date.charAt(7)) &&
					Character.isDigit(date.charAt(8)) && Character.isDigit(date.charAt(9))) {
				return true;
			}
			else return false;
		}
		return false;
	}
}
