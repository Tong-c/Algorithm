package com.tong.lafore.chapterFour.stack;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {
    public static void main(String[] args) {
        String input;
        while (true) {
            System.out.println("Enter string containing delimeters:");
            System.out.flush();
            input = getString();
            if (input.equals("")) {
                break;
            }

            BracketChecker checker = new BracketChecker(input);
            checker.check();

        }
    }

    public static String getString() {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
