package Array;

import java.util.Arrays;

public class Sort {
	
	public static void sortsc(int[] arr) {
		
		
	int temp=0;
	
	for(int i=0;i<arr.length;i++) {
		
		for(int j=i+1;j<arr.length-1;j++) {
			
			
			if(arr[i]>arr[j]) {
				
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		
	}
	} 
	
	public static void main(String args[]) {
		
		int array[]= {1,56,42,3,55};
		
	System.out.println(Arrays.toString(array));
	sortsc(array);
	
	System.out.println(Arrays.toString(array));

	}
	
	
	
	
	

}

