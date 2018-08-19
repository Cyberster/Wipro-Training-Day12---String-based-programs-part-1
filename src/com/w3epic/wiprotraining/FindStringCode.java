package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;

// Read only region start
class FindStringCode {

	public int findStringCode(String input1){
		// Read only region end
		String[] words = input1.split(" ");
		StringBuffer output = new StringBuffer();
		
        for (String word : words) {
			//int range = word.length() % 2 == 0 ? word.length() / 2 : word.length() / 2 + 1;
			int sum = 0;
			
			for (int i = 0; i < (word.length() / 2); i++) {
				int j = word.length() - i - 1; // complement of i
				
				int larger;
				int smaller;
				
				if (letterToNo(word.charAt(i)) > letterToNo(word.charAt(j))) {
					larger = letterToNo(word.charAt(i));
					smaller = letterToNo(word.charAt(j));
				} else {
					larger = letterToNo(word.charAt(j));
					smaller = letterToNo(word.charAt(i));
				}
					
				
				sum += larger - smaller;
				//System.out.println(letterToNo(word.charAt(i)) + " - " + letterToNo(word.charAt(j)));
			}
			
			if (word.length() % 2 == 1) {
				sum += letterToNo(word.charAt(word.length() / 2));
				//System.out.println(" + " + letterToNo(word.charAt(word.length() / 2)));
			}
			
			//System.out.println("sum: " + sum);
			output.append(sum);
		}
		
		//System.out.println(output);
		
		return Integer.parseInt(output.toString());
	}
	
	public static int letterToNo(char ch) {
		if (ch >= 65 && ch <= 90)
			return ch - 64;
			
		if (ch >= 97 && ch <= 122)
			return ch - 96;
		
		return 0;
	}
	
}