package com.crt;

import java.util.*;
public class Program4 {
	//11111111111
	public static void Print(int arr[]) {
		 
        System.out.println("Elements of the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
	}
	//2222222222222
	public static void Total(int arr[]) {
//        //n= arr.length;
//        
		int cnt=0;
		for(int i : arr) {
			if(i!=0) {
				cnt++;
			}
		}
//        System.out.println("Total number of elements in the array: " + n);
		  System.out.println("Total number of elements in the array: " + cnt);
    }
	//33333333333333333333
    public static void EvenOdd(int arr[]) {
        int evenCount = 0, oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even elements: " + evenCount);
        System.out.println("Total odd elements: " + oddCount);
        
    }
	//4444444444444
    public static void Negative(int arr[]) {

        System.out.println("Negative elements in the array:");
        for (int num : arr) {
            if (num < 0) {
                System.out.println(num);
            }
        }
    }

	//5555555555
	static void Reverse(int nums[]) 
    { 
		int n=nums.length;
        int i, j, temp; 
        for (i = 0; i < n / 2; i++) { 
            temp = nums[i]; 
            nums[i] = nums[n - i - 1]; 
            nums[n - i - 1] = temp; 
        } 
  
        System.out.println("Reversed array is: \n"); 
        for (j = 0; j < n; j++) { 
            System.out.print(nums[j]+ " "); 
        } 
    } 
//6666666666666
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];
            start++;
            end--;
        }
    }

	//77777
    public static void Sum(int arr[]) {
    int sum = 0;

    for (int num : arr) {
        sum += num;
    }

    System.out.println("Sum of all array elements: " + sum);

    }
    //88888888888888
    static void MaxMin(int nums[]) {
        if (nums.length == 0) {
            System.out.println("Array is empty.");
            return;
        }
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            } else if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements of the array:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        Print(arr);
        Total(arr);
        EvenOdd(arr);
        Negative(arr);
        Reverse(arr);
        reverseArray(arr);
        Sum(arr);
        MaxMin(arr);
    }
}
