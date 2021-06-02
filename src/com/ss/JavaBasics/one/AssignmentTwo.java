package com.ss.JavaBasics.one;

import java.util.Random;
import java.util.Scanner;

public class AssignmentTwo {
    /**
     * Main method
     * All operations for assignment two is done here
     * @param args command line parameters
     */
    public static void main (String[] args){

        //Scanner for user input
        Scanner scannerInput = new Scanner (System.in);

        //random number generation between 1 to 100
        Random randomGenerator = new Random();
        int number = randomGenerator.nextInt(99) + 1;

        //initialize attempt counter and guess variable
        int attempts = 4;
        int guess;

        //main loop for the guessing process
        // ends when attempt limit is exceeded
        do {
            System.out.println("Please guess an integer between 1 - 100. Attempts remaining: " + (attempts + 1));

            //Loop filters out non-integer inputs
            while (!scannerInput.hasNextInt()){
                String input = scannerInput.next();
                System.out.printf("\"%s\": is not an integer. Please enter a valid integer between 1 - 100 \n", input);
            }

            //store the next available integer input in guess
            guess = scannerInput.nextInt();

            //if guess is not in range, attempt is not reduced and process restarts
            if (guess > 0 && guess < 101) {
                //check if guess is in range and reduces attempt if not
                if (guess >= number - 10 && guess <= number + 10) {
                    System.out.println("Good guess, the number was: " + number);
                    break;
                }
                attempts--;
            }
        }while (attempts >= 0);
        if (attempts < 0) System.out.println("Sorry, maximum attempts exceeded. The correct number was: " + number);
    }
}
