package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class UniquelyExistingElements {
	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//        System.out.println("Enetr no of arrays");
        int n = scan.nextInt();
        
         
        for (int i = 0; i<n; i++){
//        	System.out.println("Enter length of arrays");
            int tt = scan.nextInt();
            int [] arrat = new int[tt];
                for (int q = 0; q<tt; q++){
                    arrat[q] = scan.nextInt();
                }
               
            ArrayList<Integer> po = new ArrayList<Integer>(); 
                for (int k = 0; k <arrat.length; k++){
                	 int count =0;
                    for (int m = 0; m < arrat.length; m ++){
                        if (arrat[k] == arrat[m]){
                            count ++;
                        }
                        
                        }
                    if (count ==1){
                        po.add(arrat[k]);
                    }
                
                }
//                System.out.println(po);
                Collections.sort(po);
                for(int g =0 ; g < po.size(); g++)
                System.out.print (po.get(g) + " ");
                System.out.println();
                }

        }

        

}