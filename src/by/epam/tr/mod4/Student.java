package by.epam.tr.mod4;
import java.util.Date;
import by.epam.tr.mod4.Human;

public class Student extends Human {
	private Date dateOfBirth;
	private String phone;
	private String department;
	private int course;
	private int[] mark;
	
	public Student (String _lastName,String _firstName, String _department, 
			int _course) {
		setId(humanId);
		humanId += 1;
		
		setLastName(_lastName);
		setFirstName(_firstName);
		setFathersName("");
		setAddress("");
		dateOfBirth = null;
		phone = "";
		department = _department;
		course = _course;
	}
	
	public Student (String _lastName,String _firstName, String _fathersName,
			String _address, String _phone, Date _dateOfBirth,
			String _department, int _course) {
		this(_lastName,_firstName,_department,_course);
		
		setFathersName(_fathersName);
		setAddress(_address);
		dateOfBirth = _dateOfBirth;
		phone = _phone;
	}
	
	public Student (String _lastName,String _firstName, String _fathersName,
			String _address, String _phone, Date _dateOfBirth,
			String _department, int _course, int[] _marks) {
		this(_lastName,_firstName,_fathersName,_address,
				_phone,_dateOfBirth,_department,_course);
		mark = _marks;
	}
	
	public String getPhone(){
		return this.phone;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public Date getDateOfBirth(){
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date date){
		this.dateOfBirth = date;
	}
	
	public String getDepartment(){
		return this.department;
	}

	public void setDepartment(String department){
		this.department = department;
	}
	
	public int getCourse(){
		return this.course;
	}

	public void setCourse(int course){
		this.course = course;
	}
	
	public int[] getMarks(){
		return this.mark;
	}

	public void setMarks(int[] marks){
		this.mark = marks;
	}
	
	public void showStudent (){
		System.out.print(this.getLastName() + " " + this.getFirstName() 
				+ " " + this.getFathersName() + " is a " + this.getCourse() 
				+ " year student of "
				+ this.getDepartment() + " department\n"
				+ "Date of Birth: " + this.getDateOfBirth()
				+ "\nPhone number: " + this.getPhone()
				+ "\nAddress: " + this.getAddress() + "\n");
		System.out.println();
	}
	
	public boolean hasName(String lastName, String firstName){
		return lastName.equals(this.getLastName()) && firstName.equals(this.getFirstName());
	}
	
	public double getGPA(){
		double gpa = 0;
		for (int i = 0; i < this.mark.length; i++){
			gpa += this.mark[i];
		}
		gpa /= this.mark.length;
		return gpa;
	}
	
	public boolean isHA(){
		return this.getGPA() > 9;
	}
	
	public boolean hasBadMark(){
		for (int i = 0; i < this.mark.length; i++){
			if (this.mark[i] == 2){
				return true;
			}
		}
		return false;
	}
}
