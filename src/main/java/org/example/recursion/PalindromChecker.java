package org.example.recursion;

public class PalindromChecker {


        public static boolean check(String number) {
            if (number.length() <= 1) {
                // Basisfall: Ein- oder kein-stellige Zahl ist immer ein Palindrom
                return true;
            } else if (number.charAt(0) == number.charAt(number.length() - 1)) {
                // Wenn die erste und letzte Ziffer übereinstimmen, prüfe den Rest
                String rest = number.substring(1, number.length() - 1);
                return check(rest);
            } else {
                // Wenn die erste und letzte Ziffer unterschiedlich sind, ist es kein Palindrom
                return false;
            }
        }

        public static void main(String[] args) {
            String number1 = "12321";
            String number2 = "123";
            String number3 = "9";
            System.out.println(check(number1)); // true
            System.out.println(check(number2)); // false
            System.out.println(check(number3)); // true
        }

    }
