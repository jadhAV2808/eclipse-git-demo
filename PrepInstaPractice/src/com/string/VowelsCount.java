package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VowelsCount {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str=br.readLine();
		
		char[] arr=str.toCharArray();
		
		int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' ||
				arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U'	) {
			count=count+1;	
		}
	}
	System.out.println(count);
	}

}
