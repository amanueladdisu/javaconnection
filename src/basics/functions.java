package basics;

public class functions {
	public static void main(String[] args){
		 Printname();
		 int numa=10;
		 int numb = 2;
		 addnumber(numa,numb);
		 multiplication(numa,numb);
		 int product = multiplication(numa,numb);
		 System.out.println(product);

		 
		
	}
	static void Printname(){
		System.out.println("My name is Amanuel");}
	static void addnumber(int numa, int numb){
		int sum = numa +numb;
		System.out.println("The sum of " +numa+ " and " +numb+ " is "+ sum);
	}
	static int multiplication(int numa,int numb){
		int product = numa * numb;
		addnumber( product +50, numa);
		return product;
	
/*	addnumber()
	multiplication()
	*/

}}
