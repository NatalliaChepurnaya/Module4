package by.epam.tr.mod4;

import java.util.List;

import by.epam.tr.mod4.Student;

public class Group {
	private String groupName;
	private List<Student> studentList;
	
	public Group(){
		groupName = "";
		studentList = null;
	}
	
	public Group(String _groupName,List<Student> _studentList){
		groupName = _groupName;
		studentList = _studentList;
	}
	
	public String getGroupName(){
		return this.groupName;
	}

	public void setGroupName(String groupName){
		this.groupName = groupName;
	}
	
	public List<Student> getStudentList(){
		return this.studentList;
	}

	public void setStudentList(List<Student> studentList){
		this.studentList = studentList;
	}
	
	public double getGroupGPA(){
		double gpa = 0;
		for (Student st: this.studentList){
			gpa += st.getGPA();
		}
		gpa /= this.studentList.size();
		return gpa;
	}
	
	public int getHAStudentsAmount(){
		int haAmount = 0;
		for (Student st: this.studentList){
			if (st.isHA() == true){
				haAmount++;
			};
		}
		return haAmount;
	}
	public int getBadStudentsAmount(){
		int badStAmount = 0;
		for (Student st: this.studentList){
			if (st.hasBadMark() == true){
				badStAmount++;
			};
		}
		return badStAmount;
	}
	

}
