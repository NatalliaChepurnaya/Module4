package by.epam.tr.mod4;

public class Abiturient extends Human {
	private int[] mark;
	
	public Abiturient(String _lastName,String _firstName,int[] _mark){
		setLastName(_lastName);
		setFirstName(_firstName);
		mark = _mark;
	}
	
	public int[] getMarks(){
		return this.mark;
	}

	public void setMarks(int[] marks){
		this.mark = marks;
	}
	
	public double getGPA(){
		double gpa = 0;
		for (int i = 0; i < this.mark.length; i++){
			gpa += this.mark[i];
		}
		gpa /= this.mark.length;
		return gpa;
	}

}

