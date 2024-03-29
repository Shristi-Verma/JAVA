package com.crt;

import java.util.*;

public class Pattern5 {
/*    *    
     ***	 
	*****
   *******
	 */
	
	void pattern51(int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=1; j<=n*2-1 ; j++) {
				
				if((j<=n-i) || (j>=n+i) ) {
					System.out.print(" ");
				}
				
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	/* ******
       *    *
       *    *
       *    *
       ******    */
	
	void pattern52(int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=1; j<=n ; j++) {
				
				if(j==n || j==1 || i==1 || i==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/* 
	   *   *
	    * *
	     * 
	    * *
	   *   *
	   

	 */
	
	void pattern53(int n ) {
		for(int i=1 ; i<=n ;i++) {
			for(int j=1 ; j<=n ; j++) {
				if(i==j || i+j==n+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	void pattern54(int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=1 ; j<=n ;j++) {
				
			}
		}
	}
		public static void main(String args[]) {
			System.out.println("Enter n ");
			Scanner s=new Scanner(System.in);
			int n =s.nextInt();
			Pattern5 bcd=new Pattern5();
			bcd.pattern53(n);
			
		}
}
