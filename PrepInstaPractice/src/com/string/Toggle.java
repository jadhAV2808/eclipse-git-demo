package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toggle {

	public static void main(String[] args) throws IOException {
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();

		
		char[] s=str.toCharArray();
		
		for(int i=0;i<s.length;i++) {
			if(s[i]>='a' && s[i]<='z')
				s[i]=(char)(s[i]+'A'-'a');
			else if(s[i]>='A' && s[i]<='Z')
				s[i]=(char)(s[i]+'a'-'A');
			
		}
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]);
		}
		
		
		
	}

}
