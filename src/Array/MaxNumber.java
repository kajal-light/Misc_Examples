package Array;

public class MaxNumber {
	
	public static int  maxNumber(int[] arr) {
		 int max=arr[0];
		 
		 for(int i=1;i<arr.length;i++) {
			 
			 
			 if(arr[i]>max) {
				 
				 
				 max+=arr[i];
				 
			 }
		 }
		 return max;
		 
		
	}


public static void main(String args[]) {
	
	int array[]= {1,5,3,6,4};
	System.out.println("the max number is:"+ maxNumber(array));
	
}
}