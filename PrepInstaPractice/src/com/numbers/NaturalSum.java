package com.numbers;

import java.util.Scanner;

public class NaturalSum {
	
	static int usingForLoop( int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		
		System.out.println(NaturalSum.usingForLoop(num));

	}

}
