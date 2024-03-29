package com.crt;
import java.util.Arrays;

public class Program6 {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5, 3, 2};

        // 17. Delete an element from an array at the given index
        
        arr = deleteElementAtIndex(arr, 2);
        System.out.println("Array after deleting at index: " + Arrays.toString(arr));

        // 18. Count and print the frequency of each element in an array
        countAndPrintFrequency(arr2);

        // 19. Print the second largest element in an array
        System.out.println("Second largest element: " + findSecondLargest(arr));

        // 20. Count the total number of duplicate elements in an array
        System.out.println("Total number of duplicate elements: " + countDuplicates(arr2));

        // 21. Delete all duplicate elements from an array
        arr2 = deleteDuplicates(arr2);
        System.out.println("Array after deleting duplicates: " + Arrays.toString(arr2));

        // 22. Merge two arrays into a third array
        int[] mergedArray = mergeArrays(arr, arr2);
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        // 23. Separate even and odd numbers of an array into two separate arrays
        separateEvenOdd(arr);
        
    }

    // 17. Delete an element from an array at the given index
    static int[] deleteElementAtIndex(int[] nums, int index) {
        if (index < 0 || index >= nums.length) {
            return nums;
        }
        int[] newArr = new int[nums.length - 1];
        System.arraycopy(nums, 0, newArr, 0, index);
        System.arraycopy(nums, index + 1, newArr, index, nums.length - index - 1);
        return newArr;
    }

    // 18. Count and print the frequency of each element in an array
    static void countAndPrintFrequency(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int count = 1;
            while (i < n - 1 && nums[i] == nums[i + 1]) {
                count++;
                i++;
            }
            System.out.println(nums[i] + " occurs " + count + " times");
            i++;
        }
    }
    
  //  int count=1;
//	for(int i=1 ; i<arr.length; i++) {
//		if(arr[i-1]!=arr[i]) {
//			if(count==1) {
//				System.out.println(arr[i-1]);
//			}
//			//System.out.println(arr[i] + " : "+ count);
//			count=1;
//		}
//		else {
//			count++;
//		}
//	}
////
////	if(arr[arr.length-1]==arr[arr.length-2]) {
////		System.out.println(arr[arr.length-1] +" : "+ count);
////	}
//	
//	if(arr[arr.length-1]!=arr[arr.length-2]) {
//		System.out.println(arr[arr.length-1]);
//	}
//
//	


    // 19. Print the second largest element in an array
    static int findSecondLargest(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length - 2];
    }

    // 20. Count the total number of duplicate elements in an array
    static int countDuplicates(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                count++;
                while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                }
            }
        }
        return count;
    }

    // 21. Delete all duplicate elements from an array
    static int[] deleteDuplicates(int[] nums) {
        Arrays.sort(nums);
        int[] newArr = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                newArr[j++] = nums[i];
            }
        }
        newArr[j++] = nums[nums.length - 1];
        return Arrays.copyOfRange(newArr, 0, j);
    }

    // 22. Merge two arrays into a third array
    static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        return mergedArray;
    }

    // 23. Separate even and odd numbers of an array into two separate arrays
    static void separateEvenOdd(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[nums.length - evenCount];
        int evenIndex = 0, oddIndex = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }
        }
        System.out.println("Array of even numbers: " + Arrays.toString(evenArray));
        
        System.out.println("Array of even numbers: " + Arrays.toString(oddArray));
        
    }
}
