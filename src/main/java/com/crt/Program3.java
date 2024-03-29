package com.crt;
import java.util.Arrays;
public class Program3 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;

        System.out.println("Original array: " + Arrays.toString(arr));
        rotateArray(arr, k);
        System.out.println("Rotated array: " + Arrays.toString(arr));
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; 
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1); 
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
//    
//    public static void main(String args[]) {
//    	int arr[]= {10,20,30,40,50};
//    	Scanner sc=new Scanner(System.in);
//    	int k =sc.nextInt();
//    	k%=arr.length;
//    	for(int i=0 ; i<k; i++) {
//    		int temp=arr[arr.length-1];
//    		for(int j=0 ; j<arr.length-1 ; j++) {
//    			arr[arr.length -1-j]=arr[arr.length-2-j];
//    		}
    // arr[0]=temp;
//    	}
    //System.out.println(Arrays.toString(arr));
//    	}
}

