package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a programme that tests a number and prints out \"Fizz\" when the number is only divisible by 5, \"Buzz\" when the number is only divisible by 3 \nand \"FizzBuzz\" when the number is divisible by both 5 and 3.");
        System.out.println("The programme returns the original number when it is neither divisible by 5 or 3.\n\nWould you like to try?");
        System.out.print("Please enter \"Yes\" or \"No\": ");


        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Yes")) {

            String response2 = "";

            do {
                System.out.print("Please enter a number to be tested:");
                int number = scanner.nextInt();

                if (number % 5 == 0 && number % 3 == 0)
                    System.out.println("FizzBuzz");
                else if (number % 5 == 0)
                    System.out.println("Fizz");
                else if (number % 3 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(number);


                System.out.print("Would you like to try again?\nPlease enter \"Yes\" to try again, else enter any key to quit:");
                response2 = scanner.nextLine();
            }
            while (response2.equalsIgnoreCase("yes"));
        }

        else if (response.equalsIgnoreCase("No"))
            System.out.println("Thank you for your time.");

    }
}
