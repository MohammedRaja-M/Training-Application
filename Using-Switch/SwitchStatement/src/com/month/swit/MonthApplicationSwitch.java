package com.month.swit;

public class MonthApplicationSwitch {
	public static void main(String[]args) {
		String Food = "Chicken Curry";
		System.out.println(Food +" "+listOfFoods(Food));
		
	}
	public static String listOfFoods(String Food) {
		switch(Food) {
		case "Chicken Curry":
		case "Beef Gravy":
		case "Mutton Chukka":
		  return "It's Non-Veg";
		case "dosa":
		case "idly":
		case "pongal":
			return "it is Pure-Veg";
		case "Noodles":
		case "tikka":
		case "Maggi":
			return "it's a Chinese Food's";
		}
		return "Your Need is Not There!!!";
		
		
	}

}
