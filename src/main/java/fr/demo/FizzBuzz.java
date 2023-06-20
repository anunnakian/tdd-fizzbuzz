package fr.demo;

public class FizzBuzz {

    public static String evaluate(int number) {
        StringBuilder sb = new StringBuilder();
        if (isDivisibleBy3(number)) {
            sb.append("Fizz");
        }
        if (isDivisibleBy5(number)) {
            sb.append("Buzz");
        }
        if (sb.isEmpty()) {
            return String.valueOf(number);
        }
        return sb.toString();
    }

    private static boolean isDivisibleBy3(int number) {
        return number % 3 == 0;
    }

    private static boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }
}
