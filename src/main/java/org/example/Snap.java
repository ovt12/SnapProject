package org.example;

import java.util.Scanner;
public class Snap extends CardGame {

    public static boolean game;

    public void startSnapGame() {

    CardGame snap = new CardGame();
    Scanner scanner = new Scanner(System.in);
    Introduction snapIntro = new Introduction();

        snapIntro.introSnapOnePlayer();
        snap.setup();
        snap.shuffleDeck();
        snap.dealCard();
        game = false;


    while (!game) {
        scanner.nextLine();
        snap.dealCard();
        Card player1 = playerOne.remove(0);
        System.out.println("Player one's card" + player1);
        scanner.nextLine();
        Card player2 = playerTwo.remove(0);
        System.out.println("Player two's card" + player2);
        System.out.println(" ");

        if (player1.getValue() == player2.getValue()) {
            String type = scanner.nextLine().toLowerCase();
            if (type.equals("snap")) {
                game = true;
                System.out.println("SNAP!!!");
                System.out.println("You win");
            }
        }
        if (deckOfCards.size() == 0){
            snap.setup();
            snap.shuffleDeck();
            System.out.println("End of the deck, re-shuffling");
            game = false;
        }
    }

    }
}


