package by.epam.tr.mod4;

import java.util.Scanner;

public class InputCheck {
	public static void main(String[] args){}
	
	public static double getDouble(Scanner sc, String str){		
		double x;
		System.out.println(str);
		while (!sc.hasNextDouble()) {
			System.out.println("Error! Please enter a number:");
			sc.next();
		}
		x = sc.nextDouble();
		return x;
	}
	
	public static int getInt(Scanner sc, String str){		
		int x;
		System.out.println(str);
		while (!sc.hasNextInt()) {
			System.out.println("Error! Please enter integer");
			sc.next();
		}
		x = sc.nextInt();
		return x;
	}


}
