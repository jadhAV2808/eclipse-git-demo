package com.array;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int []arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		
		
		

	}

}
