package com.crt;


//1. Palindrome Number:

//public class Program10 {
//    public static boolean isPalindrome(int num) {
//        int originalNum = num;
//        int reverse = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            reverse = reverse * 10 + digit;
//            num /= 10;
//        }
//
//        return originalNum == reverse;
//    }
//
//    public static void main(String[] args) {
//        int num = 12321;
//        if (isPalindrome(num)) {
//            System.out.println(num + " is a palindrome number.");
//        } else {
//            System.out.println(num + " is not a palindrome number.");
//        }
//    }
//}

//2. Strong Number:
//
//public class Program10 {
//    public static int factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return n * factorial(n - 1);
//    }
//
//    public static boolean isStrong(int num) {
//        int originalNum = num;
//        int sum = 0;
//
//        while (num > 0) {
//            int digit = num % 10;
//            sum += factorial(digit);
//            num /= 10;
//        }
//
//        return originalNum == sum;
//    }
//
//    public static void main(String[] args) {
//        int num = 145;
//        if (isStrong(num)) {
//            System.out.println(num + " is a strong number.");
//        } else {
//            System.out.println(num + " is not a strong number.");
//        }
//    }
//}

//3. Armstrong Number:

public class Program10 {
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return originalNum == sum;
    }

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}

//4. Perfect Number:
//
//public class Program10 {
//    public static boolean isPerfect(int num) {
//        int sum = 0;
//
//        for (int i = 1; i < num; i++) {
//            if (num % i == 0) {
//                sum += i;
//            }
//        }
//
//        return sum == num;
//    }
//
//    public static void main(String[] args) {
//        int num = 28;
//        if (isPerfect(num)) {
//            System.out.println(num + " is a perfect number.");
//        } else {
//            System.out.println(num + " is not a perfect number.");
//        }
//    }
//}


//5. Magic Number:

//public class Program10 {
//    public static int digitSum(int num) {
//        int sum = 0;
//        while (num > 0) {
//            sum += num % 10;
//            num /= 10;
//        }
//        return sum;
//    }
//
//    public static boolean isMagicNumber(int num) {
//        while (num > 9) {
//            num = digitSum(num);
//        }
//        return num == 1;
//    }
//
//    public static void main(String[] args) {
//        int num = 19;
//        if (isMagicNumber(num)) {
//            System.out.println(num + " is a magic number.");
//        } else {
//            System.out.println(num + " is not a magic number.");
//        }
//    }
//}

