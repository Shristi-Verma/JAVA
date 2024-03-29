package com.crt;

import java.util.Scanner;


public class Pattern2 {
/*
*****
****
***
**
*
 */
	void pattern11(int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=n-i+1 ; j>=1 ; j--) {
				System.out.print("*");
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
	void pattern12(int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=n-i+1 ; j>=1 ; j--) {
				System.out.print(i);
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
	void pattern13(int n) {
		int a=n;
		for(int i=1 ; i<=n ; i++) {
			
			for(int j=n-i+1; j>=1 ; j--) {
				System.out.print(a);
			}
			a--;
			System.out.println();
		}
	}
	/*
12345
1234
123
12
1
	 */
	void pattern14(int n) {
		for(int i=1 ; i<=n ; i++) {
			
			for(int j=1; j<=n-i+1 ; j++) {
				System.out.print(j);
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
	void pattern15(int n) {
		for(int i=1 ; i<=n ; i++) {
			int a=n;
			for(int j=1; j<=n-i+1 ; j++) {
				System.out.print(a);
				a--;
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
	void pattern16(int n) {
		for(int i=1 ; i<=n ; i++) {
			int a=n-i+1;
			for(int j=1; j<=n-i+1 ; j++) {
				System.out.print(a);
				a--;
			}
			System.out.println();
		}
	}
	/*
12345
2345
345
45
5
	 */
	void pattern17(int n) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=i; j<=n ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	/*
EEEEE
DDDD
CCC
BB
A

	 */
	void pattern18(int n) {
		for(int i=1 ; i<=n ; i++) {
			char a=(char)(65+n-i);
			for(int j=i; j<=n ; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	/*
aaaaa
bbbb
ccc
dd
e

	 */
	void pattern19(int n) {
		for(int i=1 ; i<=n ; i++) {
			char a=(char)(97+n-i);
			for(int j=i; j<=n ; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
	}
	
	/*
edcba
edcb
edc
ed
e
	 */
	void pattern20(int n) {
		for(int i=1 ; i<=n ; i++) {
			char a=(char)(97+n);
			for(int j=i; j<=n ; j++) {
				System.out.print(a--);
			}
			System.out.println();
		}
	}
	/*
abcde
abcd
abc
ab
a

	 */
	void pattern21(int n) {
		for(int i=1 ; i<=n ; i++) {
			char a=(char)(97);
			for(int j=i; j<=n ; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
	}
	/*
abcde
bcde
cde
de
e

	 */
	void pattern22(int n) {
		for(int i=1 ; i<=n ; i++) {
			char a=(char)(97+i-1);
			for(int j=i; j<=n ; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
	}
	/*
	 * edcba
dcba
cba
ba
a

	 */
	void pattern23(int n) {
		for(int i=1 ; i<=n ; i++) {
			char a=(char)(97+n-i);
			for(int j=i; j<=n ; j++) {
				System.out.print(a--);
			}
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		Pattern2 xyz=new Pattern2();
		xyz.pattern23(n);
		
	}
}
