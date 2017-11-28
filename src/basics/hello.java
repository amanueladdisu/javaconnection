package basics;

public class hello {
	public static void main(String[] args){
		System.out.println("hello world!");
		System.out.println("  i am adding new repository");
		
		int temprature ;

		
		temprature =60;
		String suncondition = "Sunny";
		
		if(temprature >80){
			System.out.println("Its pleasant");}
		else if((temprature >29 ) && (suncondition != "Sunny" )){
				System.out.println("wear a hat to keep the sun ...");}
		else if((temprature < 20) || (suncondition == "Sunny")){
			System.out.println("fuck you");}
		else{
			System.out.println("perfect");
		}
	}

}
