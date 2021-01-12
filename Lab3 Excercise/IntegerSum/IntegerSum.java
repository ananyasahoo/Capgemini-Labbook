package com.cg.IntegerSum;
import java.util.StringTokenizer;

public class IntegerSum {
	public int sumOfInteger(String input) {
		StringTokenizer strToken = new StringTokenizer(input," ");
		int sum=0;
		while(strToken.hasMoreTokens()) {
			String number=strToken.nextToken();
			sum+=Integer.parseInt(number);
		}
		return sum;

	}
}