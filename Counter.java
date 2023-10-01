import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        int parameterOne;
        int parameterTwo;


        try {
            System.out.println("Type the first parameter: ");
            parameterOne = terminal.nextInt();

            System.out.println("Type the second parameter: ");
            parameterTwo = terminal.nextInt();

            count(parameterOne, parameterTwo);

        } catch (java.util.InputMismatchException ex) {
            System.out.println("You must only enter integers.");
        } catch (InvalidParametersException ex) {
            System.out.println("Error: The second parameter must be greater than the first parameter. ");
        }
    }

    static void count(int parameterOne, int parameterTwo ) throws InvalidParametersException {
        if (parameterOne >= parameterTwo) {
            throw new InvalidParametersException();
        }
        int counter = parameterTwo - parameterOne;
        System.out.println("The count is: " + counter);


    }
}
class InvalidParametersException extends Exception {
}
