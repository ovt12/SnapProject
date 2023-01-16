package org.example;

import java.util.Scanner;

public class GameChoice {

    public void playersChoice() {

       boolean match = false;

        System.out.println("Choose your card game!");
        System.out.println("Enter 1 for a single player game: ");
        System.out.println("Enter 2 for a two player game: ");


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
                playersChoice();
            }

        }
    }
}
