package com.highestInArray;

public class HighestNumber {

	 static int largeNumber(int[] arr,int n)
	{
		 int max=0;
		 for(int i=0;i<n;i++)
		 {
			 if(arr[i]>max)
			 {
				 max=arr[i];
			 }
		 }
		return max;
	}
	public static void main(String[] args) {
		
		int arr[]= {-1, 3, 5, 6, 99, 12, 2};
		
		System.out.println("Highest Number: " +largeNumber(arr, arr.length));
	}
}
