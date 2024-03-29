package com.crt;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,11,4,15,123,7,71,28,45,804,2002,144,161,22};
        for(int i = 0; i < arr.length; i++) {
            System.out.print(digits(arr[i]) + " ");
    }
	}
    public static int digits(int num) {
        if(num == 0)
            return 1;
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;

	}

}