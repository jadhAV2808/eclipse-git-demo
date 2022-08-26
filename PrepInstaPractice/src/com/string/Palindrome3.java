package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome3 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter String");
		String str=br.readLine();
		
		boolean isPalindrome=true;
		int end=str.length()-1 , start=0;
		
		while(start<=end) {
			if(str.charAt(start)!=str.charAt(end)) {
				isPalindrome=false;
				break;
			}
			start++;
			end--;
		}
		

		if(isPalindrome)
			System.out.println("Palindrome-YES");
		else
			System.out.println("Palindrome-NO");

	}

}
