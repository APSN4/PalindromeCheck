package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(94149));
    }

    public static boolean isPalindrome(int x) {
        int lenght_palindrome = String.valueOf(x).length();
        String one_half = "";
        String two_half = "";
        String input_value = Integer.toString(x);
        double local_center = lenght_palindrome / 2.0;
        local_center = Math.floor(local_center);

        if (lenght_palindrome % 2 != 0) {
            for (int i = 0; i < lenght_palindrome; i++) {
                if (i < local_center) {
                    one_half += input_value.substring(i, i + 1);
                } else if (i > local_center) {
                    two_half += input_value.substring(i, i + 1);
                }
            }
            if (new StringBuilder(two_half).reverse().toString().equals(one_half)) {
                return true;
            } else {
                return false;
            }
        }
        else {
            for (int i = 0; i < lenght_palindrome; i++){
                if (i < (lenght_palindrome / 2)){
                    one_half += input_value.substring(i, i+1);
                }
                else {
                    two_half += input_value.substring(i, i+1);
                }
            }
            if (new StringBuilder(two_half).reverse().toString().equals(one_half)) {
                return true;
            } else {
                return false;
            }
        }
    }
}