package oop;
class person{
	String name;
	String email;
	String phonenumber;
	void walk(){
		System.out.println(name);
		System.out.println(email);
	}
	void sleep(){
		System.out.println(email);
	}
	void eat(){
		System.out.println(phonenumber);
	}
}
public class demo {

	public static void main(String[] args) {
// instantiating an object
		person person1 = new person();
		
		//define properties
		person1.name ="Aman";
		person1.email = "amani@gamil.com";
		person1.phonenumber ="15532542";
		
		person person2 = new person();
	
		person2.name = "sarah";
		person2.email= "sarah@gmail.com";
		// abstraction
		person1.walk();
		
		person1.sleep();
		person1.eat();
		person2.walk();	
		
	}

}
