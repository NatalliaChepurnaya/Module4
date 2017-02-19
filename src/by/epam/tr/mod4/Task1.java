package by.epam.tr.mod4;

import by.epam.tr.mod4.Student;
import by.epam.tr.mod4.Customer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import by.epam.tr.mod4.InputCheck;
import java.util.Date;

public class Task1 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		List<Student> studentList = new ArrayList<Student>();
		List<Customer> customerList = new ArrayList<Customer>();
		Scanner sc = new Scanner(System.in);
		String lastName;
		String firstName;
		int opt = 1; //User's choice
		
		String dateStr = "1990/01/01";
		Date date = new Date(dateStr);
		//Students' list	
		studentList.add(new Student("Petrov","Petya","FPM",3));
		studentList.add(new Student("Ivanov","Ivan","Ivanovich","",
				"123456",date,"FKP",1));
		studentList.add(new Student("Sidorov","Petya","FPM",5));
		studentList.add(new Student("Vasiliev","Petya","FITU",2));
		
		//Customers' list	
		customerList.add(new Customer("Petrov","Petya"));
		customerList.add(new Customer("Ivanov","Ivan","Ivanovich","",
						"123456","fvner12"));
		customerList.add(new Customer("Sidorov","Petya"));
		customerList.add(new Customer("Vasiliev","Petya"));
		
	
		while (opt <= 2){
			opt = InputCheck.getInt(sc, "Choose option:\n 1 - search for the student\n"
					+ " 2 - search for the student customer\n"
					+ " Other - quit");
			if (opt == 1){
				System.out.println("Enter last name: ");
				lastName = sc.next();
				System.out.println("Enter first name: ");
				firstName = sc.next();
				
				for (Student st : studentList){
					if (st.hasName(lastName,firstName) == true){
						st.showStudent();
					}
				}
			} else if (opt == 2) {
				System.out.println("Enter last name: ");
				lastName = sc.next();
				
				for (Customer c : customerList){
					if (c.hasLastName(lastName) == true){
						c.showCustomer();
					}
				}
			} else {
				return;
			}
		}
		
	}

}
