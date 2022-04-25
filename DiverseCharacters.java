package com.company;

public class DiverseCharacters {
	
public static int solve(final String A) {
		
		int alphaCount = 0;
		int digitCount = 0;
		
		for (int i = 0; i < A.length(); i++ ) {
			if (A.charAt(i) >='a' && A.charAt(i) <= 'z'  || A.charAt(i) >='A' && A.charAt(i) <= 'Z') {
				alphaCount = alphaCount + 1 ;
			}
			if (A.charAt(i) >= '0' && A.charAt(i) <= '9') {
				digitCount = digitCount +1;
			}
		}
		
		if (digitCount >= alphaCount) {
			return digitCount;
		}else {
			return alphaCount;
		}
		
	}
	
	
	public static void main(String[] args) {
   
		String op = "Agdahfgrih35435";
		int pos = solve(op);
		System.out.println(pos);
    }


}

