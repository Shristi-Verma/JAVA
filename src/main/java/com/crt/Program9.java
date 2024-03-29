package com.crt;


//Question 31: Find first duplicate element in an array

//import java.util.HashSet;
//
//public class Program9{
//    public static int findFirstDuplicate(int[] nums) {
//        HashSet<Integer> set = new HashSet<>();
//        for (int num : nums) {
//            if (set.contains(num)) {
//                return num;
//            }
//            set.add(num);
//        }
//        return -1; // If no duplicates fou
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {2, 3, 4, 5, 3, 6, 2};
//        System.out.println("First duplicate element: " + findFirstDuplicate(nums));
//    }
//}

//Question 32: Find sub Array of maximum sum in an Array of positive and negative elements (Kadane’s Algorithm)

//public class Program9{
//    public static int maxSubarraySum(int[] nums) {
//        int maxCurrent = nums[0];
//        int maxGlobal = nums[0];
//
//        for (int i = 1; i < nums.length; i++) {
//            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
//            maxGlobal = Math.max(maxGlobal, maxCurrent);
//        }
//
//        return maxGlobal;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
//        System.out.println("Maximum sum of subarray: " + maxSubarraySum(arr));
//    }
//}


//Question 33: Find common element from two arrays



//public class Program9 {
//    public static HashSet<Integer> findCommonElements(int[] arr1, int[] arr2) {
//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> commonElements = new HashSet<>();
//        
//        for (int num : arr1) {
//            set1.add(num);
//        }
//        
//        for (int num : arr2) {
//            if (set1.contains(num)) {
//                commonElements.add(num);
//            }
//        }
//        
//        return commonElements;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {3, 4, 5, 6, 7};
//        System.out.println("Common elements: " + findCommonElements(arr1, arr2));
//    }
//}

//Question 34: Find the common element in three sorted arrays


//public class Program9 {
//    public static HashSet<Integer> findCommonElementsThree(int[] arr1, int[] arr2, int[] arr3) {
//        HashSet<Integer> set1 = new HashSet<>();
//        HashSet<Integer> commonElements = new HashSet<>();
//        
//        for (int num : arr1) {
//            set1.add(num);
//        }
//        
//        for (int num : arr2) {
//            if (set1.contains(num)) {
//                commonElements.add(num);
//            }
//        }
//        
//        HashSet<Integer> set2 = new HashSet<>(commonElements);
//        commonElements.clear();
//        
//        for (int num : arr3) {
//            if (set2.contains(num)) {
//                commonElements.add(num);
//            }
//        }
//        
//        return commonElements;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {3, 4, 5, 6, 7};
//        int[] arr3 = {5, 6, 7, 8, 9};
//        System.out.println("Common elements: " + findCommonElementsThree(arr1, arr2, arr3));
//    }
//}


//Question 35: Find the element that appears once in an array where every other element appears twice

//public class Program9 {
//    public static int findSingleElement(int[] nums) {
//        int result = 0;
//        for (int num : nums) {
//            result ^= num;
//        }
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 3, 4};
//        System.out.println("Element that appears once: " + findSingleElement(arr));
//    }
//}


//Question 37: Longest SubArray size with the sum ‘s’


//public class Program9 {
//    public static int longestSubArraySizeWithSum(int[] arr, int s) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int maxLen = 0;
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            if (sum == s) {
//                maxLen = i + 1;
//            } else if (map.containsKey(sum - s)) {
//                maxLen = Math.max(maxLen, i - map.get(sum - s));
//            }
//            if (!map.containsKey(sum)) {
//                map.put(sum, i);
//            }
//        }
//        return maxLen;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
//        int s = 5;
//        System.out.println("Longest subarray size with sum " + s + ": " + longestSubArraySizeWithSum(arr, s));
//    }
//}


//Question 38: Sort an array which contains 0, 1, 2 only (Dutch National Flag Algorithm)
//
//public class Program9{
//    public static void sortArray(int[] arr) {
//        int low = 0;
//        int mid = 0;
//        int high = arr.length - 1;
//
//        while (mid <= high) {
//            if (arr[mid] == 0) {
//                int temp = arr[low];
//                arr[low] = arr[mid];
//                arr[mid] = temp;
//                low++;
//                mid++;
//            } else if (arr[mid] == 1) {
//                mid++;
//            } else {
//                int temp = arr[mid];
//                arr[mid] = arr[high];
//                arr[high] = temp;
//                high--;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 1, 1, 0, 2, 2, 0, 1, 2, 0, 0, 1};
//        sortArray(arr);
//        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
//    }
//}

//Question 39: Majority Element (Moore's Voting Algorithm)

//public class Program9 {
//    public static int findMajorityElement(int[] arr) {
//        int candidate = 0;
//        int count = 0;
//
//        for (int num : arr) {
//            if (count == 0) {
//                candidate = num;
//                count = 1;
//            } else if (num == candidate) {
//                count++;
//            } else {
//                count--;
//            }
//        }
//
//        // Verify if the candidate is a majority element
//        count = 0;
//        for (int num : arr) {
//            if (num == candidate) {
//                count++;
//            }
//        }
//
//        return count > arr.length / 2 ? candidate : -1; // Return -1 if there's no majority element
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
//        System.out.println("Majority element: " + findMajorityElement(arr));
//    }
//}

//Question 40: Rearrange elements by sign (+, - , +, - , +, ...)

//public class Program9 {
//    public static void rearrangeElementsBySign(int[] arr) {
//        int i = 0;
//        int j = arr.length - 1;
//
//        while (i < j) {
//            while (i < arr.length && arr[i] > 0) {
//                i++;
//            }
//            while (j >= 0 && arr[j] < 0) {
//                j--;
//            }
//            if (i < j) {
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {3, -2, 1, -5, 2, -4};
//        rearrangeElementsBySign(arr);
//        System.out.println("Rearranged array: " + java.util.Arrays.toString(arr));
//    }
//}
//

//Question 41: Leaders in the array

import java.util.ArrayList;
import java.util.List;

public class Program9{
    public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }

        return leaders;
    }

    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        List<Integer> leaders = findLeaders(arr);
        System.out.println("Leaders in the array: " + leaders);
    }
}