package org.example;

import java.util.Scanner;

public class Player extends CardGame {

    public boolean twoPlayer;

    public void startSnapGame2player() {


        CardGame snap = new CardGame();
        Scanner scanner = new Scanner(System.in);
        Introduction into2Player = new Introduction();

        into2Player.introSnapTwoPlayer();
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
                long startTime = System.currentTimeMillis();
                String result = scanner.nextLine().toLowerCase();
                long stopTime = System.currentTimeMillis();
                long reactionTime = stopTime - startTime;
                if(result.length()>0) {
                    if (result.charAt(0) == 'q' && reactionTime < 5000) {
                        twoPlayer = true;
                        System.out.println("_____________SNAP!!!_____________");
                        System.out.println("PLAYER ONE - YOU WIN!!!");

                    }
                    if (result.charAt(0) == 'p' && reactionTime < 5000) {
                        twoPlayer = true;
                        System.out.println("_____________SNAP!!!_____________");
                        System.out.println("PLAYER TWO - YOU WIN!!!");
                    } else {
                        System.out.println("Sorry to slow your time was " + reactionTime);
                    }
                }

            }
            if (deckOfCards.size() == 0) {
                snap.setup();
                snap.shuffleDeck();
                System.out.println(" ");
                System.out.println("End of the deck, re-shuffling");
                twoPlayer = false;
            }
        }

    }
}
