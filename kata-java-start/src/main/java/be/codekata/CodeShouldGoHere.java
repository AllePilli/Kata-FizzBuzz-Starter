package be.codekata;

public class CodeShouldGoHere {
    public String fizzBuzz(int number) {
        String result = "";

        if (number % 3 == 0) result += "Fizz";
        if (number % 5 == 0) result += "Buzz";
        else if (result.isEmpty()) result += number;

        return result;
    }

    public static void main(String[] args) {
        CodeShouldGoHere codeShouldGoHere = new CodeShouldGoHere();
        for (int number = 1; number <= 100; number++) {
            System.out.println(codeShouldGoHere.fizzBuzz(number));
        }
    }
}
