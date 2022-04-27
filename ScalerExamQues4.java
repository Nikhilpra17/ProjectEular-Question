package com.company;

import java.util.ArrayList;

public class ScalerExamQues4 {
		public static void main(String[] args) {
	        
			String A ="abbaabbbb";
		        String special = "Yes";
		        
		        ArrayList<Character> ao = new ArrayList<Character>();
		        ArrayList<Character> bo = new ArrayList<Character>();
		        
		        for (int i =0; i< A.length(); i++){
		            if (A.charAt(i) == 'a'){
		                ao.add(A.charAt(i));
		            }
		            else if (A.charAt(i) == 'b'){
		                bo.add(A.charAt(i));
		            }
		        }
		        System.out.println(ao);
		        System.out.println(bo);
		        
		        int to = ao.size() + bo.size();
		        System.out.println(to);
		        
		        ArrayList<Integer> anum = new ArrayList<Integer>();
		        ArrayList<Integer> bnum = new ArrayList<Integer>();
		        
		       
		        
		        for(int i =0; i< A.length(); i++){
		        	 if (A.charAt(i) == 'a'){
			                anum.add(i);
			            }
		        	 else if (A.charAt(i) == 'b'){
			                bnum.add(i);
		        	 }
		        }
		        System.out.println(anum);
		        System.out.println(bnum);
		        
		        int tempa = 1;
		        int tempb = 1;
		        
		        int ssss = anum.get(2);
		        System.out.println(ssss);
		        
		        for(int i =1; i< anum.size(); i++){
		        if ((anum.get(i)- anum.get(i-1)) != 1) {
		        	tempa = 0;
		        	break;
		        }
		        }
		        System.out.println(tempa);
		        
		        for(int i =1; i< bnum.size(); i++){
			        if (bnum.get(i)- bnum.get(i-1)!=1) {
			        	tempb = 0;
			        	break;
			        }
		        }
		        
		        if (to == A.length() && ao.size() != 0 && bo.size() != 0 && tempa ==1 && tempb ==1){
		            special = "Yes";
		        } else{
		            special = "No";
		        }
		        
		        System.out.println(special);
		  
		    }
		}

