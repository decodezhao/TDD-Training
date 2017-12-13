package com.decodezhao.tdd;

import java.util.Scanner;


public class GameRunner {

    private ScannerHandler scannerHandler;

    public GameRunner(ScannerHandler scannerHandler) {
        this.scannerHandler = scannerHandler;
    }

    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner(new ScannerHandler(new Scanner(System.in)));
        gameRunner.start();
    }

    public void start() {
        System.out.println("Number Guess Game Start...");
        System.out.println("Type empty or 'q' to quit.");
        NumberGuess numberGuess = new NumberGuess();

        while (true) {
            System.out.print("Please input a 4-bit number(like '1234'):");
            String number = scannerHandler.readLine();
            if ("".equals(number) || "q".equals(number)) {
                break;
            }
            System.out.println("Your input number is: " + number);

            String result = numberGuess.guess(new UniqueNumber(number));

            System.out.println("The result is: " + result);
        }
    }
}
