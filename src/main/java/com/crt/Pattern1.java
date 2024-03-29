package com.crt;
 import java.util.*;
 
 
public class Pattern1 {
	/*
	  
	*
	**
	***
	****
	*****

	  */
	void pattern_01(int n ) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=1;j<=i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	1
	22
	333
	4444
	55555
	 */
	void pattern_02(int n ) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=1;j<=i ; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	/*
	5
	44
	333
	2222
	11111
	 */
	void pattern_03(int n ) {
		int a=n;
		for(int i=1 ; i<=n ; i++) {
			for(int j=1;j<=i ; j++) {
				System.out.print(a);
			}
			a--;
			System.out.println();
		}
	}
	
	/*
	1
	12
	123
	1234
	12345

	 */
	
	void pattern_1(int n ) {
		for(int i=1 ; i<=n ; i++) {
			for(int j=1;j<=i ; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/*
5
54
543
5432
54321

	 */
	
	void pattern_2(int n ) {
		
		for(int i=1 ; i<=n ; i++) {
			int a=n;
			for(int j=1;j<=i ; j++) {
				System.out.print(a--);
			}
			System.out.println();
		}
	}

	/*
1
21
321
4321
54321

	 */
	void pattern_3(int n ) {

		for(int i=1 ; i<=n ; i++) {
			int a=i;
			for(int j=1;j<=i ; j++) {
				System.out.print(a--);
			}
			System.out.println();
		}
	}
	
	/*
	 * 5
45
345
2345
12345

	 */
	void pattern_4(int n) {
		
		for(int i=1 ; i<=n ; i++) {
			int a=n-i+1;
			for(int j=1;j<=i ; j++) {
				System.out.print(a++);
			}
			System.out.println();
		}
	}
	/*
	 * A
BB
CCC
DDDD
EEEEEE

	 */
void pattern_5(int n) {
		char a='A';
		for(int i=1 ; i<=n ; i++) {
			for(int j=1;j<=i ; j++) {
				System.out.print(a);
			}
			a++;
			System.out.println();
		}
	}
/*
E
DD
CCC
BBBB
AAAAA

 */
void pattern_6(int n) {
	char a=(char) ('A'+n-1);
	for(int i=1 ; i<=n ; i++) {
		for(int j=1;j<=i ; j++) {
			System.out.print(a);
		}
		a--;
		System.out.println();
	}
}
/*
E
ED
EDC
EDCB
EDCBA
 */

void pattern_7(int n ) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char) (64+n);
		for(int j=1;j<=i ; j++) {
			System.out.print(a);
			a--;
		}
		
		System.out.println();
	}
}
/*
 * A
AB
ABC
ABCD
ABCDE

 */

void pattern_8(int n ) {
	
	for(int i=1 ; i<=n ; i++) {
		char a='A';
		for(int j=1;j<=i ; j++) {
			System.out.print(a);
			a++;
		}
		
		System.out.println();
	}
}
/*
E
DE
CDE
BCDE
ABCDE

 */
void pattern_9(int n ) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char) (65+n-i);
		for(int j=1;j<=i ; j++) {
			System.out.print(a);
			a++;
		}
		
		System.out.println();
	}
}
/*
 * A
BA
CBA
DCBA
EDCBA

 */

void pattern_10(int n ) {
	
	for(int i=1 ; i<=n ; i++) {
		char a=(char) (65+i-1);
		for(int j=1;j<=i ; j++) {
			System.out.print(a);
			a--;
		}
		
		System.out.println();
	}
}


	public static void main(String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		Pattern1 abc=new Pattern1();
		abc.pattern_03(n);
		
	}
}
