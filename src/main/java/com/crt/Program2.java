package com.crt;
public class Program2 {
     void Reverse(int nums[], int n) 
    { 
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
  
    public static void main(String[] args) 
    { 
        int[] arr = { 10, 20, 30, 40, 50 }; 
        Program2 s=new Program2();
        s.Reverse(arr, arr.length); 
    } 

}

