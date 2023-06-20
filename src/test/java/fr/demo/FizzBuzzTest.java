package fr.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void should_return_Fizz() {
        String result = FizzBuzz.evaluate(3);

        Assertions.assertEquals("Fizz", result);
    }
}