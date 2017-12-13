package com.decodezhao.tdd;

import java.util.Scanner;


public class GameRunner {

    private ScannerHandler scannerHandler;

    private NumberGuess numberGuess;

    public GameRunner(ScannerHandler scannerHandler, NumberGuess numberGuess) {
        this.scannerHandler = scannerHandler;
        this.numberGuess = numberGuess;
    }

    public static void main(String[] args) {
        GameRunner gameRunner = new GameRunner(new ScannerHandler(new Scanner(System.in)), new NumberGuess());
        String result = gameRunner.start();
        System.out.println("The result is " + result);
    }

    public String start() {
        System.out.println("Number Guess Game Start...");

        System.out.print("Please input a 4-bit number(like '1234'):");
        String number = scannerHandler.readLine();
        if ("".equals(number)) {
            return "quit";
        }
        System.out.println("Your input number is: " + number);

        return numberGuess.guess(new UniqueNumber(number));
    }
}
