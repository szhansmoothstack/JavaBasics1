package com.ss.JavaBasics.one;

/**
 * Assignment 1 class
 * @author Zhan Su
 */
public class AssignmentOne {

    /**
     * Method to print problem one
     * @param rows specifies number of rows in the pyramid
     */
    public static void printProblemOne (int rows){
        System.out.println("1)");
        for (int i = 1; i <= rows; i ++){
            for (int j = 0; j < i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(".........");
    }
    /**
     * Method to print problem two
     * @param rows specifies number of rows in the pyramid
     */
    public static void printProblemTwo (int rows){
        System.out.println("2)");
        System.out.println("..........");
        for (int i = rows; i >= 1; i --){
            for (int j = 0; j < i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Method to print problem three
     * @param rows specifices the number of rows
     */
    public static void printProblemThree (int rows){
        System.out.println("3)");

        //the max number of stars for the rows specified
        int maxStars = rows * 2 - 1;

        //outside loop goes through the number of rows
        for (int i = 1; i <= rows; i ++){
            //prints the number of spaces before the stars begin
            for (int j = 0; j < (maxStars / 2) - (i - 3); j ++){
                System.out.print(" ");
            }

            //prints the number of stars based on the row
            for (int j = 0; j < (i * 2) - 1; j ++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("...........");
    }

    /**
     * Method to print problem four
     * @param rows specifices the number of rows
     */
    public static void printProblemFour (int rows){
        System.out.println("4)");
        System.out.println("............");

        //the max number of stars for the rows specified
        int maxStars = rows * 2 - 1;

        //outside loop goes through the number of rows
        for (int i = rows; i >= 1; i --){

            //prints the number of spaces before the stars begin
            for (int j = 0; j < (maxStars / 2) - (i - 3); j ++){
                System.out.print(" ");
            }

            //prints the number of stars based on the row
            for (int j = 0; j < (i * 2) - 1; j ++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * Main method, all problems are printed out here
     * @param args command line parameters (not used)
     */
    public static void main (String[] args){
        //problem 1
        printProblemOne(4);
        //problem 2
        printProblemTwo(4);
        //problem 3
        printProblemThree(4);
        //problem 4
        printProblemFour(4);
    }
}
