package org.example;

import java.util.Scanner;

public class GameChoice {

    public void playersChoice() {

        boolean match = false;

        System.out.println("Enter number 1 for a single player game");
        System.out.println("Enter number 2 for a two player game");


        while(!match){
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                Snap snap = new Snap();
                snap.startSnapGame();
                match = true;
            }

            if (choice.equals("2")) {
                Player player2 = new Player();
                player2.startSnapGame2player();
                match = true;
            }

            else {
                System.out.println("Incorrect input, please choose from the options.");
                playersChoice();
            }

        }
    }
}
