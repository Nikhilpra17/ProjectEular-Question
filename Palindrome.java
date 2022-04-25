package com.company;

public class Palindrome {
	public static int solve(String A) {

	      int ispalindrome = 1;
	      
	      int firstpointer = 0;
	      int secondpointer = A.length()-1;
	    	  
	    	  if (A.length() % 2 == 0) {
	    		  while (firstpointer<secondpointer) {
	    			  if (A.charAt(firstpointer) == A.charAt(secondpointer)) {
	    				  ispalindrome = 1;
	    			  }else {
	    				  ispalindrome = 0;
	    				  break;
	    			  }
	    			  firstpointer ++;
	    		      secondpointer --;
	    		  }
	    	  }
	    	  else {
	    		  while (firstpointer <= secondpointer) {
	    			  if (A.charAt(firstpointer) == A.charAt(secondpointer)) {
	    				  ispalindrome = 1;
	    			  }else {
	    				  ispalindrome = 0;
	    				  break;
	    			  }
	    			  firstpointer ++;
	    		      secondpointer --;
	    		  
	    	  }
	      }

	  
	   return ispalindrome;
	    }
	
	public static void main(String[] args) {
		
		String aa = "epdhumzuulwiddnhtsoshblbybirwrtaiyjcl";
		
int aaa = solve(aa);
System.out.println(aaa);
	
	}
}

