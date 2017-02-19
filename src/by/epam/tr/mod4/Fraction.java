package by.epam.tr.mod4;


public class Fraction { 
	 private int numerator; 
	 private int denominator;
	 
	 public Fraction() {   
		 numerator = denominator = 1;  
	} 
	 
	 public Fraction(int num, int den) {   
		 numerator = num;   
		 denominator = den;  
	} 
	 
	 public void show() {
		 System.out.println(this.numerator + "/" + this.denominator);
	 }
	 
}	 