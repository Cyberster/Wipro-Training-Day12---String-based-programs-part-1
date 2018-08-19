package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;

// Read only region start
class GetCodeThroughStrings {

	public int getCodeThroughStrings(String input1){
		// Read only region end
		//System.out.println(input1);
		String[] words = input1.split(" ");
		int pin = 0;
		
		for(String word : words) {
			pin += word.length();
		}
		
		if (String.valueOf(pin).length() == 1) return pin;
		
		int pin2 = 0;
		
		// this wont wok for numbers line 230
		/*while (pin % 10 != 0) {
			pin2 += pin % 10;
			pin /= 10;
		}*/
		
		// but this will
		String pinStr = String.valueOf(pin);
		for (int i = 0; i < pinStr.length(); i++) {
			pin2 += Integer.parseInt(String.valueOf(pinStr.charAt(i)));
		}
		
		return pin2;
	}
}