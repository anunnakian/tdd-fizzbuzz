package fr.demo;

public class FizzBuzz {

    public static String evaluate(int number) {
        if (isDivisibleBy5(number)) {
            return "Buzz";
        }
        return "Fizz";
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
