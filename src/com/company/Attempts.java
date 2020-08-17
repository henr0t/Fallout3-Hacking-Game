package com.company;

public class Attempts {
    int attemptsCount = 4;
    int removeBlock = 0;
    String attemptsText = " ATTEMPT(S) LEFT: [] [] [] []\n";


    public String minusAttempt(){
        attemptsCount-=1;
        if(attemptsCount==1) System.out.println("!!! WARNING LOCKOUT IMINENT !!!");
        removeBlock += 3;
        return ((attemptsCount) + attemptsText.substring(0,(attemptsText.length()-removeBlock)));
    }

    public boolean attemptsCheck(){
        if (attemptsCount == 1){
            System.out.println("TERMINAL LOCKED\nPLEASE CONTACT AN ADMINISTRATOR");
        return true;
        }
        else return false;
    }

    Attempts(){
        System.out.println(attemptsCount + attemptsText);
    }
}
