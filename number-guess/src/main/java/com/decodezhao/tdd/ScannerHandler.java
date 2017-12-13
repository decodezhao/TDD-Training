package com.decodezhao.tdd;


import java.util.Scanner;

public class ScannerHandler {

    private Scanner scanner;
    public ScannerHandler(Scanner scanner){
        this.scanner = scanner;
    }

    public String readLine() {
        return scanner.nextLine();
    }
}
