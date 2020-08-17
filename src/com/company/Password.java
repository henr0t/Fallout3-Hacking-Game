package com.company;

import java.util.Random;

public class Password {
    int correctCount ;
    static String password = randomPassword().toString();

    static public Code randomPassword(){
        int pick = new Random().nextInt(Code.values().length);
        return Code.values()[pick];
    }

    public boolean check(String input){
        correctCount = 0;
        for(int x=0 ; x<input.length(); x++){
            if(input.charAt(x) == password.charAt(x)){
                correctCount += 1;
            }
        }

        if(correctCount != 5)System.out.println(">Entry denied\n"+">"+correctCount+"/"+password.length()+" correct.");
        else System.out.println(">Exact match!\n>Please wait\n>while system\n>is accessed.");
        return correctCount == 5;
    }
}
