package org.example;

import java.util.Scanner;

public class Player extends CardGame {

    public static boolean twoPlayer;

    public void startSnapGame2player(){

        CardGame snap = new CardGame();
        Scanner scanner = new Scanner(System.in);
        Introduction snapIntro = new Introduction();

        snapIntro.introSnapTwoPlayer();
        snap.setup();
        snap.shuffleDeck();
        snap.dealCard();

        while (!twoPlayer) {
            scanner.nextLine();
            snap.dealCard();
            Card player1 = playerOne.remove(0);
            System.out.println("Player one's card" + player1);
            scanner.nextLine();
            Card player2 = playerTwo.remove(0);
            System.out.println("Player two's card" + player2);

            if (player1.getValue() == player2.getValue()) {
                String result = scanner.nextLine().toLowerCase();
                if (result.equals("q") || result.equals("p")) {
                    twoPlayer = true;
                    System.out.println("SNAP!!!");
                    System.out.println("You win");
                }
            }
            if (deckOfCards.size() == 0){
                snap.setup();
                snap.shuffleDeck();
                System.out.println("End of the deck, re-shuffling");
                startSnapGame2player();
            }
        }


    }
}
