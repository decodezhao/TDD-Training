package com.decodezhao.tdd;

import java.util.Scanner;


public class GameRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Guess Game Start...");
        System.out.println("Type empty or 'q' to quit.");
        while (true) {
            System.out.print("Please input a 4-bit number(like '1234'):");
            String number = scanner.nextLine();
            if ("".equals(number) || "q".equals(number)) {
                break;
            }
            System.out.println("Your input number is: " + number);

            NumberGuess numberGuess = new NumberGuess();
            String result = numberGuess.guess(new UniqueNumber(number));

            System.out.println("The result is: " + result);
        }

    }
}
