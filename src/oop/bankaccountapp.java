package oop;

public class bankaccountapp {

	public static void main(String[] args) {
	//instantiate an object
		bankaccount acc1 = new bankaccount();
		acc1.accnumber = "0211320320";
		bankaccount acc2 = new bankaccount("check in account");
		acc2.accnumber = "65461664";
		bankaccount acc3 = new bankaccount("saving account",+500);
		acc3.accnumber = "541404684";
		acc3.checkbalance();
		System.out.println(acc2.routinnumber);
	}

}
