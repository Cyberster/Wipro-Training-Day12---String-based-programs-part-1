package com.w3epic.wiprotraining;

import java.io.*;
import  java.util.*;
import java.math.BigDecimal;

// Read only region start
class AdditionUusingStrings {

	public String addNumberStrings(String input1,String input2){
		// Read only region end
		BigDecimal x = new BigDecimal(input1);
		BigDecimal y = new BigDecimal(input2);
		
		return String.valueOf(x.add(y));
	}
}