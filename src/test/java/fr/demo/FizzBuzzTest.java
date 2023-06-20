package fr.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void should_return_Fizz_when_3() {
        String result = FizzBuzz.evaluate(3);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_Fizz_when_divisible_by_3() {
        String result = FizzBuzz.evaluate(6);

        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void should_return_Fizz_when_5() {
        String result = FizzBuzz.evaluate(5);

        Assertions.assertEquals("Buzz", result);
    }
}