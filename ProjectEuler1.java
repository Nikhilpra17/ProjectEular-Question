package com.company;
import java.util.*;

public class ProjectEuler1 {
	
	public static int multipleSums(int[] data) {
		
		ArrayList<Integer>  multiple = new ArrayList<Integer>();
		
		for (int i = 0; i <data.length; i++) {
			if (data[i]%3 ==0 || data[i] %5 == 0) {
				multiple.add(data[i]);
			}
		}
			
			int sum =0;
			
			for (int k = 0 ; k< multiple.size(); k++) {
				sum = sum + multiple.get(k);
			}
		
		return sum;
		
	}

	public static void main(String[] args) {
	
		int[] table = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		int sums = multipleSums(table);
		
		System.out.println(sums);

	}

}
