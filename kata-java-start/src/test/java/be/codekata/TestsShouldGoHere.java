package be.codekata;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestsShouldGoHere {
    private final CodeShouldGoHere codeShouldGoHere = new CodeShouldGoHere();

    @Test
    public void numbersCase() {
        int[] numbers = {1, 2, 4, 7, 52, 86, 98};
        for (int number: numbers) {
            String result = codeShouldGoHere.fizzBuzz(number);
            assertThat(result, equalTo("" + number));
        }
    }

    public void fizzBuzzTest(int[] inputNumbers, String expectedResult) {
        for (int inputNumber: inputNumbers) {
            String result = codeShouldGoHere.fizzBuzz(inputNumber);
            assertThat(result, equalTo(expectedResult));
        }
    }

    @Test
    public void fizzCase() {
        int[] numbers = {3, 6, 9, 12, 99, 51, 96};
        fizzBuzzTest(numbers, "Fizz");
    }

    @Test
    public void buzzCase() {
        int[] numbers = {5, 10, 20, 50, 95, 55, 35};
        fizzBuzzTest(numbers, "Buzz");
    }

    @Test
    public void fizzBuzzCase() {
        int[] numbers = {15, 30, 45, 60, 75, 90};
        fizzBuzzTest(numbers, "FizzBuzz");
    }
}
