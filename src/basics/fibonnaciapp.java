package basics;

public class fibonnaciapp{
public static void main(String[] args){
	System.out.println(fib(6));
	System.out.println(fac(99));
}
public static int fib(int n){
	
	if(n ==0){
		return 0;
		
	}else if(n==1){
		return 1;
		
	}
	return((fib(n-2))+(fib(n-1)));
}
public static int fac(int i){
	if(i==0){
		return 1;
	}else if(i ==1){
		return 1;
	}
	return (i*(fac(i-1)));
}
}



