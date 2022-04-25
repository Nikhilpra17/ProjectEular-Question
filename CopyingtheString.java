package com.company;

import java.util.ArrayList;

public class CopyingtheString {
	 public String solve(final String A) {

	      ArrayList<Character> po = new ArrayList<Character>();  
		  
	        for (int i = 0; i <A.length()-1; i++) {
	        	po.add(i, A.charAt(i));
	        }
	        
//	        String word= new String();
	        String word = "" ;
	        for(char c: po){
	        word= word+ c; 
	        }
	        return word;
	        
//	        System.out.print(String.valueOf(po));
	    }
	  
	 public static void main(String[] args) {
		 String jh = "hhgfivh";
		 
		 solve(jh);
	 }
}
