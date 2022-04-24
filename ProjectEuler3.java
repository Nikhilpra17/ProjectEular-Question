package com.company;

public class ProjectEuler3 {

	public static void main(String[] args) {
		long number= 600851475143L ;
		boolean prime  = true;
		
		for (int i = 2; i<= number/2; i++) {
			if (number % i ==0) {
				for (int k = 2; k <i/2; k++ ) {
					if (i % k == 0) {
						prime = false;
						break;
					}
				}
				if (prime == true) {
					System.out.println(i);
				}
			}
			
		}
	}

}
