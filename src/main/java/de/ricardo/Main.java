package de.ricardo;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");
    }
        public static int add(int a, int b) {
            return a + b;
        }

        public static boolean isEven(int number) {
            return number % 2 == 0;
        }

        public static int product(int a, int b) {
        return a * b;
        }

        public static String toUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
        }

        public static boolean isPositive(int number) {
        return number > 0;
        }
    }
