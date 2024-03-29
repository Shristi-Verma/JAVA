package com.crt;

public class Subseq {
	public static void main(String args[]) {
		//Program to count 
		String S="abaabadbsbcbdbacabababa";
		String S1="aba";
		int count=0;
		for(int i=0 ; i<=(S.length()-S1.length()) ; i++) {
			if(S.charAt(i)=='a') {
				String temp=S.substring(i,i+S1.length());
			if(temp.equals(S1)) {
				count++;
			}
			}	
		}
		System.out.println(count);
	}
}
