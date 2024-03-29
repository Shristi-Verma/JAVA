package com.crt;

import java.util.Scanner;


public class Pattern3 {
	/*
	 
	 *
    **
   ***
  ****
 *****

	 */
	void pattern31(int n ) {
		
		for(int i=1 ; i<=n ; i++) {
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
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
 *         1
      22
    333
  4444
55555

 */
	void pattern32(int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(i);
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
	 * 5
      44
    333
  2222
11111

	 */
	void pattern33(int n) {
		int a =n;
		for(int i=1 ; i<=n ; i++) {
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(a);
					}
				else {
					System.out.print(" ");
				}
			}
			a--;
			System.out.println();
		}
	}
	
	/*
	 *         1
      12
    123
  1234
12345

	 */
	void pattern34(int n) {
		for(int i=1 ; i<=n ; i++) {
			int a =1;
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(a);
					a++;
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
	 *         5
      54
    543
  5432
54321

	 */
	void pattern35(int n) {
		for(int i=1 ; i<=n ; i++) {
			int a =n;
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(a);
					a--;
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
	 * 1
      21
    321
  4321
54321
	 */
	void pattern36(int n) {
		for(int i=1 ; i<=n ; i++) {
			int a =i;
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(a);
					a--;
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
/*
 *         5
      45
    345
  2345
12345

 */
	void pattern37(int n) {
		for(int i=1 ; i<=n ; i++) {
			
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(j);
					}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	/*
	 *         A
      BB
    CCC
DDDD
EEEEE

	 */
	void pattern38(int n) {
		char a='A';
		for(int i=1 ; i<=n ; i++) {
			
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(a);
					}
				else {
					System.out.print(" ");
				}
			}
			a++;
			System.out.println();
		}
	}
	/*
	 *         e
      dd
     ccc
  bbbb
aaaaa

	 */
	void pattern39(int n) {
		char a=(char)(96+n);
		for(int i=1 ; i<=n ; i++) {
			
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(a);
					}
				else {
					System.out.print(" ");
				}
			}
			a--;
			System.out.println();
		}
	}
/*
 *         A
      AB
    ABC
  ABCD
ABCDE

 */
	void pattern3_10(int n) {
		
		for(int i=1 ; i<=n ; i++) {
			char a=(char)(65);
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(a);
					a++;
					
					}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
	/*
	 * e
      ed
    edc
  edcb
edcba

	 */
void pattern3_11(int n) {
		
		for(int i=1 ; i<=n ; i++) {
			char a=(char)(96+n);
			for(int j =1 ; j<=n;j++) {
				
				if(j>=n-i+1) {
					System.out.print(a);
					a--;
					
					}
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}
/*
 *         A
      BA
    CBA
  DCBA
EDCBA

 */
void pattern3_12(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char)(64+i);
		for(int j =1 ; j<=n;j++) {
			
			if(j>=n-i+1) {
				System.out.print(a);
				a--;
				
				}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
}
/*
 *         e
      de
    cde
  bcde
abcde

 */
void pattern3_13(int n) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char)(97+n-i);
		for(int j =1 ; j<=n;j++) {
			
			if(j>=n-i+1) {
				System.out.print(a);
				a++;
				
				}
			else {
				System.out.print(" ");
			}
		}
		
		System.out.println();
	}
}

	public static void main(String args[]) {
		System.out.println("Enter n:   ");
		Scanner ab=new Scanner(System.in);
		int n =ab.nextInt();
		Pattern3 bcd=new Pattern3();
		bcd.pattern31(n);
		
	}
}
