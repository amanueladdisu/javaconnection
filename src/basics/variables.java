package basics;

public class variables {
	public static void main(String[] args){
		String career;
		career = "Software engineering";
		System.out.println("Program is starting");
		System.out.println("My career is " +career);
		
		int hourperweek =40;
		int weakperyear =50;
		double rate = 42.5;
		career = "civil engineer";		
		double Salary = hourperweek*weakperyear*rate;
		System.out.println("My career as "+ career+ " at the rate of "+rate+ " is " + Salary);
	}

}
