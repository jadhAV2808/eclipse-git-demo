package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveSpace {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter String");
		String str=br.readLine();
		
		String result="";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==' ')
				continue;
			else
				result=result+str.charAt(i);		
		}
		
		System.out.println(result);

	}

}
