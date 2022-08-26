package com.numbers;

import java.util.Scanner;

public class SuminRange {

	public static void main(String[] args) {
        
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the starting number: ");
		int start=sc.nextInt();
		
		System.out.println("Enter the ending number: ");
		int end=sc.nextInt();
		
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum=sum+i;
		}
		
		System.out.println(sum);
	}

}
