package by.epam.tr.mod4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.epam.tr.mod4.Student;

public class Task3 {
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		List<Student> studentList = new ArrayList<Student>();
		Group gr;
		int[][] marks = {
				{9,9,9,9,10},
				{2,9,3,9,5},
				{9,9,5,5,6},
				{10,10,10,10,2}
				};
		
		//Students' list	
		studentList.add(new Student("Ivanov","Ivan","Ivanovich","",
				"123456",new Date("1990/01/01"),"FKP",1,marks[0]));
		studentList.add(new Student("Sidorov","Petya","Ivanovich","",
				"123456",new Date("1957/02/03"),"FKP",3,marks[1]));
		studentList.add(new Student("Vasiliev","Petya","Ivanovich","",
				"123456",new Date("1989/01/01"),"FKP",5,marks[2]));
		studentList.add(new Student("Watson","John","Ivanovich","",
				"123456",new Date("1980/02/02"),"FITU",5,marks[3]));
		
		gr = new Group("Group 1",studentList);
		
		System.out.println("Group GPA: " + gr.getGroupGPA());
		for (Student st: gr.getStudentList()){
			System.out.println(st.getFirstName() +  " "
					+ st.getLastName() + " GPA: " + st.getGPA());
		}
		System.out.println("Number of HA students: " + gr.getHAStudentsAmount());
		System.out.println("Number of bad students: " + gr.getBadStudentsAmount());

	}
}