package oop;

public class bankaccount {
	//define variables
	String accnumber;
	static String routinnumber = "9102077";
	String name;
	String SSN;
	String acctype;
	double balance = 1000;
	//constructors (used to define object)(must have the same name with the class)
	//
	bankaccount(){
		System.out.println("New account is created");
	}
	//overloading
	bankaccount(String acctype){
		System.out.println("new account: " +acctype);
	}
	bankaccount(String name, double intialdeposit){
		System.out.println("Amanuel");
		String msg = "null";
		if(intialdeposit <1000){
			msg = "Error";}
		else{
			msg= "Thanks for intial deposit";
		
	}
		System.out.println(msg);
		balance = intialdeposit + 200;
	
	}
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	//define methods;
	void deposit(){
		
	}
	void withdraw(){
		
		
	}
	void checkbalance(){
		System.out.println("balance is : " +balance);
		
	}
	void getstatus(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
