package by.epam.tr.mod4;
import by.epam.tr.mod4.Human;

public class Customer extends Human {
	private String creditCard;
	private String bankAccount;
	
	public Customer (String _lastName,String _firstName) {
		setId(humanId);
		humanId += 1;
		
		setLastName(_lastName);
		setFirstName(_firstName);
		setFathersName("");
		setAddress("");
		creditCard = "";
		bankAccount = "";
	}
	
	public Customer (String _lastName,String _firstName, String _fathersName,
			String _address, String _creditCard, String _bankAccount) {
		this(_lastName,_firstName);		
		setFathersName(_fathersName);
		setAddress(_address);
		creditCard = _creditCard;
		bankAccount = _bankAccount;
	}
	
	public String getCreditCrad(){
		return this.creditCard;
	}

	public void setCreditCrad(String creditCard){
		this.creditCard = creditCard;
	}
	
	public String getBankAccount(){
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount){
		this.bankAccount = bankAccount;
	}
	
	public void showCustomer (){
		System.out.print(this.getLastName() + " " + this.getFirstName() 
				+ " " + this.getFathersName() + " is a customer" 
				+ "\nAddress: " + this.getAddress() 
				+ "\nCredit card number: " + this.getCreditCrad() 
				+ "\nBank account: " + this.getBankAccount() + "\n");
		System.out.println();
	}
	
	public boolean hasLastName(String lastName){
		return lastName.equals(this.getLastName());
	}
}
