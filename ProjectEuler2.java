package com.company;
import java.util.*;

public class ProjectEuler2 {

	public static int SumFibonacci() {
		
		ArrayList<Long> series = new ArrayList<Long>();
		
		long firstnum = 1;
		series.add(firstnum);
		long secondnumber = 2;
		series.add(secondnumber);
		long nextterm = firstnum + secondnumber;
		
		while (nextterm <= 4000000) {
			nextterm = firstnum + secondnumber;
			series.add(nextterm);
			firstnum = secondnumber;
			secondnumber = nextterm;
			
		}
//		for (long i =0; i<series.size(); i++) {
//			System.out.print(series.get((int) i) + ", ");
//		}
//		System.out.println();
//		
		int sum =0;
		
		for (int i =0; i<series.size(); i++) {
			if (series.get(i)%2 ==0) {
			sum = (int) (sum+ series.get(i));
		}
		}
		
		return sum;
		
	
		
		
	}
	
	public static void main(String[] args) {
	
		int seriespo = SumFibonacci();
		
		System.out.println(seriespo);

	}

}
