package basics;

public class min {

	public static void main(String[] args) {
		int[] num = {6,3,5,80};
	/*	System.out.println(findmin(num));
		int[] max1 ={60,8,7,45,100};
		System.out.println(findmax(max1));
		int[] aver = {60,8,7,45,100};
		System.out.println(findaverage(aver));*/
		System.out.println(fac(6));
		
	}/*
	public static int findmin(int[] num){
		int min = num[0];
		for(int i=0; i<num.length; i++){
			if(num[i] < min){
				min = num[i];
			}
		}
		return min;
		
	}
	
	public static int findmax(int[] max1){
		int max = max1[0];
		for (int n = 0; n<max1.length; n++){
			if(max1[n]> max){
				max = max1[n];
			}
			
		}
		return max;
	}
	public static int findaverage(int[] aver){
		int sum = 0;
		for(int r =0; r<aver.length; r++){
			sum = sum+aver[r];
			System.out.println("4444444444444");
			
		}
		return  sum/aver.length;
		
	}
*/
	public static int fac(int n){
	/*	for(int n =0; n<n.length; n++)*/
		if(n == 0){
			return 1;
		}else if(n==1){
			return 1;
		}
		System.out.println(n);
		
	return(n*fac(n-1));
	}
}
