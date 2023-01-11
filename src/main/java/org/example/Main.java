package org.example;

public class Main {
    public static void main(String[] args) {

        CardGame snap = new CardGame();

        snap.setup();
        snap.dealCard();
        snap.sortingDeckInNumberOrder();
        snap.sortingDeckIntoSuits();
        snap.shuffleDeck();

    }
}