package org.example;

import java.util.Scanner;

public class Player extends CardGame {

    private boolean twoPlayer;
    private int TIME_LIMIT = 3;

    public void startSnapGame2player() {

        Scanner scanner = new Scanner(System.in);
        Introduction into2Player = new Introduction();

        into2Player.introSnapTwoPlayer(TIME_LIMIT);
        setup();
        shuffleDeck();
        dealCard();

        while (!twoPlayer) {
            scanner.nextLine();
            dealCard();
            Card player1 = playerOne.remove(0);
            System.out.println("Player one's card" + player1);
            scanner.nextLine();
            Card player2 = playerTwo.remove(0);
            System.out.println("Player two's card" + player2);
            System.out.println(" ");

            if (player1.getValue() == player2.getValue()) {
                long startTime = System.currentTimeMillis() / 1000;
                String result = scanner.nextLine().toLowerCase();
                long stopTime = System.currentTimeMillis() / 1000;
                long reactionTime = stopTime - startTime;
                if(result.length() > 0) {
                    if (result.charAt(0) == 'q' && reactionTime < TIME_LIMIT) {
                        twoPlayer = true;
                        System.out.println("_____________SNAP!!!_____________");
                        System.out.println("PLAYER ONE - YOU WIN!!!");
                    } else if (result.charAt(0) == 'q' && reactionTime > TIME_LIMIT){
                        System.out.println("Sorry to slow your time was " + reactionTime + " seconds");
                    }
                    if (result.charAt(0) == 'p' && reactionTime < TIME_LIMIT) {
                        twoPlayer = true;
                        System.out.println("_____________SNAP!!!_____________");
                        System.out.println("PLAYER TWO - YOU WIN!!!");
                    } else if (result.charAt(0) == 'p' && reactionTime > TIME_LIMIT) {
                        System.out.println("Sorry to slow your time was " + reactionTime + " seconds");
                    }
                }

            }
            if (deckOfCards.size() == 0) {
                setup();
                shuffleDeck();
                System.out.println(" ");
                System.out.println("End of the deck, re-shuffling");
                twoPlayer = false;
            }
        }

    }
}
