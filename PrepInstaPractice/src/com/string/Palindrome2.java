package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter String");
		String str=br.readLine();
		
		int n=str.length();
		boolean isPalindrome=true;
		
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i) != str.charAt(n-1-i)) {
				isPalindrome=false;
				break;
			}
		}

		if(isPalindrome)
			System.out.println("Palindrome-YES");
		else
			System.out.println("Palindrome-NO");
	}

}
