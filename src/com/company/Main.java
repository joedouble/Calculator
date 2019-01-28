package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int userChoice = 0;
        double firstNumber = 0;
        double secondNumber = 0;
        double total = 0;
        double remainder = 0;
        boolean goAgain = false;

        do {

            System.out.println("What type of operation would you like to perform?\n1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Square Root");
            userChoice = myScanner.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.println("You've chosen to do Addition.");
                    System.out.println("Please enter the first number?");
                    firstNumber = myScanner.nextDouble();
                    System.out.println("Please enter the second number?");
                    secondNumber = myScanner.nextDouble();

                    total = firstNumber + secondNumber;

                    System.out.println("The total is:  " + total);
                    break;

                case 2:
                    System.out.println("You've chosen to do Subtraction.");
                    System.out.println("Please enter the first number?");
                    firstNumber = myScanner.nextDouble();
                    System.out.println("Please enter the second number?");
                    secondNumber = myScanner.nextDouble();

                    total = firstNumber - secondNumber;

                    System.out.println("The difference is:  " + total);
                    break;

                case 3:
                    System.out.println("You've chosen to do Multiplication.");
                    System.out.println("Please enter the first number?");
                    firstNumber = myScanner.nextDouble();
                    System.out.println("Please enter the second number?");
                    secondNumber = myScanner.nextDouble();

                    total = firstNumber * secondNumber;

                    System.out.println("The product is:  " + total);
                    break;

                case 4:
                    System.out.println("You've chosen to do Division.");
                    System.out.println("Please enter the first number?");
                    firstNumber = myScanner.nextDouble();
                    System.out.println("Please enter the second number?");
                    secondNumber = myScanner.nextDouble();

                    total = firstNumber / secondNumber;
                    remainder = firstNumber % secondNumber;

                    System.out.println("The quotient is:  " + total);
                    System.out.println("The remainder is:  " + remainder);
                    break;

                case 5:
                    System.out.println("You've chosen to do Square Root.");
                    System.out.println("Please enter the number?");
                    firstNumber = myScanner.nextDouble();

                    total = Math.sqrt(firstNumber);

                    System.out.println("The Square Root is:  " + total);
                    break;

                case 6:
                    System.out.println("Wrong choice.  Please try again.");
                    break;
            }

            System.out.println("Would you like to go again?\n1) Yes\n2) No");
            userChoice = myScanner.nextInt();

            if (userChoice == 1) {
                goAgain = true;
            } else {
                goAgain = false;
            }
        } while (goAgain);
    }
}