package com.crt;



public class Program7 {

	//24................Search an elmenent 
	
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        int elementToSearch = 30;
//        int index = searchElement(arr, elementToSearch);
//        if (index != -1) {
//            System.out.println("Element " + elementToSearch + " found at index: " + index);
//        } else {
//            System.out.println("Element " + elementToSearch + " not found in the array.");
//        }
//    }
//
//    static int searchElement(int[] arr, int element) {
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == element) {
//                return i;
//            }
//        }
//        return -1;
//    }


         //25..........sort
	
//    public static void main(String[] args) {
//        int[] arr = {50, 30, 10, 40, 20};
//        sortAscending(arr);
//        System.out.println("Array after sorting in ascending order: " + Arrays.toString(arr));
//    }
//
//    static void sortAscending(int[] arr) {
//        Arrays.sort(arr);
//    }

	//26.................sort

//public static void main(String[] args) {
//    int[] arr = {50, 30, 10, 40, 20};
//    sortDescending(arr);
//    System.out.println("Array after sorting in descending order: " + Arrays.toString(arr));
//}
//
//static void sortDescending(int[] arr) {
//    Arrays.sort(arr);
//    for (int i = 0; i < arr.length / 2; i++) {
//        int temp = arr[i];
//        arr[i] = arr[arr.length - 1 - i];
//        arr[arr.length - 1 - i] = temp;
//    }
//}
	
	//27.........left rotation

//	
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        leftRotate(arr);
//        System.out.println("Array after left rotation: " + Arrays.toString(arr));
//    }
//
//    static void leftRotate(int[] arr) {
//        int temp = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            arr[i - 1] = arr[i];
//        }
//        arr[arr.length - 1] = temp;
//    }

	//28.............Right rotation
//	
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 40, 50};
//        rightRotate(arr);
//        System.out.println("Array after right rotation: " + Arrays.toString(arr));
//    }
//
//    static void rightRotate(int[] arr) {
//        int temp = arr[arr.length - 1];
//        for (int i = arr.length - 1; i > 0; i--) {
//            arr[i] = arr[i - 1];
//        }
//        arr[0] = temp;
//    }

//	  //29......unique
	
//    public static void main(String[] args) {
//        int[] arr = {10, 20, 30, 20, 10, 40, 50};
//        printUniqueElements(arr);
//    }
//
//    static void printUniqueElements(int[] arr) {
//        Set<Integer> set= new HashSet<>();
//        for (int num : arr) {
//            set.add(num);
//        }
//        System.out.println("Unique elements in the array: " + set);
//    
//    }
//
//    
	
	
	
	
    //29 wala dubara 
//    public static void main(String args[]) {
//    	int arr[]= {1,2,2,3,4,4,4,5,5,23,123,5,6,7,8,8,9};
//    	int count=1;
//    	for(int i=1 ; i<arr.length; i++) {
//    		if(arr[i-1]!=arr[i]) {
//    			if(count==1) {
//    				System.out.println(arr[i-1]);
//    			}
//    			//System.out.println(arr[i] + " : "+ count);
//    			count=1;
//    		}
//    		else {
//    			count++;
//    		}
//    	}
////
////		if(arr[arr.length-1]==arr[arr.length-2]) {
////			System.out.println(arr[arr.length-1] +" : "+ count);
////		}
//		
//    	if(arr[arr.length-1]!=arr[arr.length-2]) {
//			System.out.println(arr[arr.length-1]);
//		}
//
//    	
//    }
//    
    
    
	//30.........length of largest digit
    
    
    public static void main(String[] args) {
        int[] arr = {12, 345, 6789, 123456};
        int maxLength = findMaxLength(arr);
        System.out.println("Length of the largest digit in the array: " + maxLength);
    }

    static int findMaxLength(int[] arr) {
        int max = 0;
        for (int num : arr) {
            int length = String.valueOf(num).length();
            if (length > max) {
                max = length;
            }
        }
        return max;
  }
}








