package com.crt;


//Question 1:


public class Program11 {
    public static void main(String[] args) {
        String input = "India";
        String output = shiftLastToFirst(input);
        System.out.println(output); // Output: aIndi
    }

    public static String shiftLastToFirst(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        char lastChar = input.charAt(input.length() - 1);
        String substring = input.substring(0, input.length() - 1);
        return lastChar + substring;
    }
}

//Question 2:

//
//public class Program11 {
//    public static void main(String[] args) {
//        String input = "India";
//        String output = swapFirstAndLast(input);
//        System.out.println(output); // Output: andiI
//    }
//
//    public static String swapFirstAndLast(String input) {
//        if (input == null || input.isEmpty()) {
//            return input;
//        }
//        char firstChar = input.charAt(0);
//        char lastChar = input.charAt(input.length() - 1);
//        String middleSubstring = input.substring(1, input.length() - 1);
//        return lastChar + middleSubstring + firstChar;
//    }
//}

//Question 3:


//public class Program11 {
//    public static void main(String[] args) {
//        String input = "This is an international airport";
//        int count = countVowels(input);
//        System.out.println(count); // Output: 12
//    }
//
//    public static int countVowels(String input) {
//        if (input == null || input.isEmpty()) {
//            return 0;
//        }
//        int count = 0;
//        String vowels = "aeiouAEIOU";
//        for (char ch : input.toCharArray()) {
//            if (vowels.indexOf(ch) != -1) {
//                count++;
//            }
//        }
//        return count;
//    }
//}


//Question 4:

//public class Program11 {
//    public static void main(String[] args) {
//        String input = "     I am a ja  va developer       ";
//        int count = countWords(input);
//        System.out.println(count); // Output: 5
//    }
//
//    public static int countWords(String input) {
//        if (input == null || input.trim().isEmpty()) {
//            return 0;
//        }
//        String[] words = input.trim().split("\\s+");
//        return words.length;
//    }
//}

//Question 5:

//public class Program11 {
//    public static void main(String[] args) {
//        String input = "This is an international airport";
//        String longestWord = findLongestWord(input);
//        System.out.println(longestWord); // Output: international
//    }
//
//    public static String findLongestWord(String input) {
//        if (input == null || input.trim().isEmpty()) {
//            return null;
//        }
//        String[] words = input.trim().split("\\s+");
//        String longestWord = "";
//        for (String word : words) {
//            if (word.length() > longestWord.length()) {
//                longestWord = word;
//            }
//        }
//        return longestWord;
//    }
//}

//Question 6:

//
//public class Program11 {
//    public static void main(String[] args) {
//        String input = "Never odd or even";
//        boolean isPalindrome = isPalindrome(input);
//        System.out.println(isPalindrome);
//    }
//
//    public static boolean isPalindrome(String input) {
//        if (input == null || input.isEmpty()) {
//            return false;
//        }
//        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
//        int left = 0;
//        int right = cleanInput.length() - 1;
//        while (left < right) {
//            if (cleanInput.charAt(left) != cleanInput.charAt(right)) {
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}