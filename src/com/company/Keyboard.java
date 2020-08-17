package com.company;

import java.util.Scanner;

public class Keyboard {
    private String inputText;

    public void inputText(){
        Scanner scnr = new Scanner(System.in);

        inputText = scnr.next().toUpperCase();

    }

    public String getText(){
        return inputText;
    }
}
