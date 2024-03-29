package com.crt;

import java.util.*;

public class Program5 {
//99999999999999999999
    static void countNegativeElements(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num < 0) {
                count++;
            }
        }
        System.out.println("Total negative elements: " + count);
    }
    
//100000000
    static void copyArray(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        System.out.println("Copied array: " + Arrays.toString(arr));
        
    }
    
//1111111111111111111111
    static void insertElementAtEnd(int[] nums, int element) {
        int[] newArr = Arrays.copyOf(nums, nums.length + 1);
        newArr[newArr.length - 1] = element;
        System.out.println("Array after inserting at end: " + Arrays.toString(newArr));
    }
    
//121212
    static void insertElementAtBeginning(int[] nums, int element) {
        int[] newArr = new int[nums.length + 1];
        newArr[0] = element;
        System.arraycopy(nums, 0, newArr, 1, nums.length);
        
        System.out.println("Array after inserting at beginning: " + Arrays.toString(newArr));
    }
    
//1313131313131131
    
    static void findTopTwoMax(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for (int num : nums) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        
        System.out.println("Top two maximum numbers: " + max1 + ", " + max2);
    }
    
//14444444444444
    static void insertElementAtIndex(int[] nums, int index, int element) {
        int[] newArr = new int[nums.length + 1];
        System.arraycopy(nums, 0, newArr, 0, index);
        newArr[index] = element;
        System.arraycopy(nums, index, newArr, index + 1, nums.length - index);
        System.out.println("Array after inserting at index: " + Arrays.toString(newArr));
    }
//1555555555555555555555
    static void deleteElementAtEnd(int[] nums) {
        int[] newArr = Arrays.copyOf(nums, nums.length - 1);
        System.out.println("Array after deleting at end: " + Arrays.toString(newArr));
    }
//16666666666666
    static void deleteElementAtBeginning(int[] nums) {
        int[] newArr = new int[nums.length - 1];
        System.arraycopy(nums, 1, newArr, 0, nums.length - 1);
        System.out.println("Array after deleting at beginning: " + Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int[] arr = {10, -20, 30, -40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};

        countNegativeElements(arr);
        copyArray(arr);
        insertElementAtEnd(arr, 60);
        insertElementAtBeginning(arr, 5);
        findTopTwoMax(arr2);
        insertElementAtIndex(arr, 3, 100);
        deleteElementAtEnd(arr);
        deleteElementAtBeginning(arr);
    }
}
