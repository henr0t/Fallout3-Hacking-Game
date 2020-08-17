package com.company;

public class Terminal {
    boolean powerOff;

    public void activate() {
        System.out.println("ROBCO INDUSTRIES (TM) TERMLINK PROTOCOL \nENTER PASSWORD NOW\n");

        Attempts terminate = new Attempts();
        new CodeOutput().print();

        Password password = new Password();
        Keyboard type = new Keyboard();

        while (powerOff == false) {
            type.inputText();
            String outputText = type.getText();

            powerOff = password.check(outputText);
            if (powerOff==true){continue;}

            powerOff = terminate.attemptsCheck();

            if (powerOff==true){continue;}

            System.out.println(terminate.minusAttempt());
            if (outputText.equals("ESC")) powerOff = true;
        }

    }
}
