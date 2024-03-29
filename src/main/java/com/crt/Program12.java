package com.crt;

//
//public class Program12 {
//
//    public static void main(String[] args) {
//        int n = 5;
//        printPattern(n);
//    }
//
//    public static void printPattern(int n) {
//        for (int i = 1; i <= n; i++) {
//            // Print the increasing numbers
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            // Print the decreasing numbers
//            for (int j = i - 1; j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

//2. Armstrong Number
//
//public class Program12 {
//
//    public static void main(String[] args) {
//        int num = 153;
//        if (isArmstrongNumber(num)) {
//            System.out.println(num + " is an Armstrong number");
//        } else {
//            System.out.println(num + " is not an Armstrong number");
//        }
//    }
//
//    public static boolean isArmstrongNumber(int num) {
//        int original = num;
//        int length = getLength(num);
//        int sum = 0;
//        while (num > 0) {
//            int digit = num % 10;
//            sum += Math.pow(digit, length);
//            num /= 10;
//        }
//        return original == sum;
//    }
//
//    public static int getLength(int num) {
//        int count = 0;
//        while (num > 0) {
//            count++;
//            num /= 10;
//        }
//        return count;
//    }
//}

//3. Shift Array

//public class Program12 {
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int n = 4;
//        shiftArray(arr, n);
//        System.out.println("Shifted Array:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static void shiftArray(int[] arr, int n) {
//        int temp, j;
//        for (int i = 0; i < n; i++) {
//            temp = arr[0];
//            for (j = 0; j < arr.length - 1; j++) {
//                arr[j] = arr[j + 1];
//            }
//            arr[j] = temp;
//        }
//    }
//}


// Print Pattern

//public class Program12 {
//
//    public static void main(String[] args) {
//        int n = 5;
//        printPattern(n);
//    }
//
//    public static void printPattern(int n) {
//        for (int i = 1; i <= n; i++) {
//            // Print the increasing numbers
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j);
//            }
//            // Print the decreasing numbers
//            for (int j = i - 1; j >= 1; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}


//2. Pascal's Triangle

//
//public class Program12 {
//
//    public static void main(String[] args) {
//        int n = 5;
//        printPascalTriangle(n);
//    }
//
//    public static void printPascalTriangle(int n) {
//        for (int i = 0; i < n; i++) {
//            // Calculate the binomial coefficient for each element in the row
//            for (int j = 0; j <= i; j++) {
//                System.out.print(pascalCoefficient(i, j) + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static int pascalCoefficient(int n, int k) {
//        if (k == 0 || k == n) {
//            return 1;
//        } else {
//            return pascalCoefficient(n - 1, k - 1) + pascalCoefficient(n - 1, k);
//        }
//    }
//}


// SOLVE PATTERN


//Pattern
// WRONGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG

//
//public class Program12 {
//
//    public static void main(String[] args) {
//        int n = 6;
//        printPattern(n);
//    }
//
//    public static void printPattern(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            if (i < n) {
//                for (int j = i - 1; j >= 1; j--) {
//                    System.out.print(j + " ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}
