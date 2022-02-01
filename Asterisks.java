/*
*
* The Asterisks program.
*
*
* @author Jakob
* @version 1.0
* @since 2020-12-15
*/

import java.util.Scanner;

/**
* This is the main class.
*/
final class Asterisks {
    /**
    * Asteristic.
    */
    public static final String ASTERISK = "*";

    /**
    * Prevent instantiation.
    *
    * @throws IllegalStateException
    *
    */

    private Asterisks() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The asterisks function.
    *
    * @param integer integer
    * @param spacesNum number of spaces
    */
    public static void asterisks(final int integer, final int spacesNum) {
        String output = "";

        for (int counter = 0; counter < spacesNum; counter++) {
            output = " " + output;
        }

        if (integer == 1) {
            System.out.println(output + ASTERISK);
            System.out.println(output + ASTERISK);
        }
        else if (integer < 1) {
            System.out.println("Cannot enter an integer less than 1.");
        }
        else {
            for (int counter = 0; counter < integer; counter++) {
                output = output + ASTERISK;
            }

            System.out.println(output);

            asterisks(integer - 1, spacesNum + 1);

            System.out.println(output);
        }
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Insert an integer:");
        final String input = scanner.nextLine();

        try {
            final int inputInt = Integer.parseInt(input);
            asterisks(inputInt, 0);
        }
        catch (java.lang.NumberFormatException error) {
            System.out.println("Not a number.");
        }
    }
}
