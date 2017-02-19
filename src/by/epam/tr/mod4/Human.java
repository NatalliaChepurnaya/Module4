package by.epam.tr.mod4;

public abstract class Human {
	public static int humanId = 1;
	private int id;
	private String lastName = "";
	private String firstName = "";
	private String fathersName;
	private String address;
	
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFathersName(){
		return this.fathersName;
	}
	public void setFathersName(String fathersName){
		this.fathersName = fathersName;
	}
	
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address = address;

	}
}
