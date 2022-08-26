package com.array;

import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int []arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int smallest=arr[0];
		
		for(int i=0;i<n;i++) {
			if(smallest>arr[i])
				smallest=arr[i];
		}
		int sec_smallest=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]!=smallest && arr[i]<sec_smallest)
				
				sec_smallest=arr[i];
		}
		System.out.println(sec_smallest);
	}

}
