package by.epam.tr.mod4;
import java.util.Scanner;
import by.epam.tr.mod4.InputCheck;
import by.epam.tr.mod4.Fraction;

public class Task2 {
	public static void main(String[] args){
		int k; //Number of fractions
		int num; //Numerator
		int denom; //Denominator
		Fraction[] arr;
		Scanner sc = new Scanner(System.in);
		
		k = InputCheck.getInt(sc, "Please enter number of fractions");
		arr = new Fraction[k];
		
		for (int i = 0; i < k; i++){
			num = InputCheck.getInt(sc, "Please enter the numerator of " 
		+ (i + 1) + " fraction:");
			denom = InputCheck.getInt(sc, "Please enter the denominator of " 
					+ (i + 1) + " fraction:");
			arr[i] = new Fraction(num,denom);
			arr[i].show();
		}		
		
	}

}
