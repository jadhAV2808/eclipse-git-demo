package com.array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		System.out.println("Enter the elements of array");
		int []arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			System.out.print (arr[i]+" ");
		}
		
		int start=0;int end=n-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		
		System.out.println("-----------------------");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	

}
