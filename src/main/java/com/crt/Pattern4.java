package com.crt;

import java.util.Scanner;



public class Pattern4 {
	/*
*****
 ****
  ***
   **
    *
	 */
	
	public static void pattern41(int n ) {
		
		for(int i=1 ; i<=n ; i++) {
			for(int j =1 ; j<=n;j++) {
				
				if(j<=i-1) {
					System.out.print(" ");
					}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	/*
	 * 11111
  2222
    333
      44
        5

	 */
public static void pattern42(int n ) {
		
		for(int i=1 ; i<=n ; i++) {
			for(int j =1 ; j<=n;j++) {
				
				if(j<=i-1) {
					System.out.print(" ");
					}
				else {
					System.out.print(i);
				}
			}
			System.out.println();
		}
	}
/*
 * 55555
  4444
    333
      22
        1

 */
public static void pattern43(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(n-i+1);
			}
		}
		System.out.println();
	}
}
/*
 * 12345
  1234
    123
      12
        1

 */

public static void pattern44(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(j-i+1);
			}
		}
		System.out.println();
	}
}
/*
 * 54321
  5432
    543
      54
        5

 */
public static void pattern45(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		int a=n;
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a--);
			}
		}
		System.out.println();
	}
}
/*
 * 54321
  4321
    321
      21
        1

 */
public static void pattern46(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		int a=n-i+1;
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a--);
			}
		}
		System.out.println();
	}
}
/*
 * 12345
  2345
    345
      45
        5

 */
public static void pattern47(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		int a=i;
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a++);
			}
		}
		System.out.println();
	}
}
/*
 * AAAAA
   BBBB
     CCC
       DD
         E

 */
public static void pattern48(int n) {
	char a='A';
	for(int i=1 ; i<=n ; i++) {
		
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a);
			}
		}
		a++;
		System.out.println();
	}
}
/*
 * EEEEE
DDDD
    CCC
      BB
        A

 */
public static void pattern49(int n) {
	char a=(char)(64+n);
	for(int i=1 ; i<=n ; i++) {
		
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a);
			}
		}
		a--;
		System.out.println();
	}
}
/*
 * ABCDE
  ABCD
    ABC
      AB
        A

 */
public static void pattern4_1(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char)(65);
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a++);
			}
		}
		
		System.out.println();
	}
}
/*
 * EDCBA
  EDCB
    EDC
      ED
        E

 */
public static void pattern4_2(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char)(64+n);
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a--);
			}
		}
		
		System.out.println();
	}
}
/*
 * EDCBA
  DCBA
    CBA
      BA
        A

 */
public static void pattern4_3(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char)(65+n-i);
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a--);
			}
		}
		
		System.out.println();
	}
}
/*
 * ABCDE
  BCDE
    CDE
      DE
        E

 */
public static void pattern4_4(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char)(64+i);
		for(int j =1 ; j<=n;j++) {
			
			if(j<=i-1) {
				System.out.print(" ");
				}
			else {
				System.out.print(a++);
			}
		}
		
		System.out.println();
	}
}

	public static void main(String args[]) {
		System.out.println("Enter the number = ");
		Scanner scanner=new Scanner(System.in);
		int n =scanner.nextInt();
		pattern4_4(n);
		
	}
}
