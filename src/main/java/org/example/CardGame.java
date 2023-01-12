package org.example;

        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Comparator;

public class CardGame {
        public static ArrayList<Card> deckOfCards = new ArrayList<>(52);
        public static ArrayList<Card> playerOne = new ArrayList<>(52);
        public static ArrayList<Card> playerTwo = new ArrayList<>(52);

        private String name;




    public void setup(){

        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] symbols = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < symbols.length; j++) {
                deckOfCards.add(new Card(suits[i], symbols[j], j + 1));
            }
        }
    }


    public void dealCard() {
            Collections.shuffle(deckOfCards);
        for (int i = 0; i < deckOfCards.size(); i++) {
            if (i % 2 == 0) {
                playerOne.add(deckOfCards.remove(deckOfCards.size() - 1));
            } else {
                playerTwo.add(deckOfCards.remove(deckOfCards.size() - 1));
            }
        }

    }

    public void sortingDeckInNumberOrder() {
        Collections.sort(deckOfCards, new Comparator<Card>() {
            @Override
            public int compare(Card c1, Card c2) {
                return c1.getValue() - c2.getValue();
            }
        });
        System.out.println("Sorted Deck: " + deckOfCards);
    }

    public void sortingDeckIntoSuits() {
        Collections.sort(deckOfCards, new Comparator<Card>() {
            @Override
            public int compare(Card c1, Card c2) {
                return c1.getSuit().compareTo(c2.getSuit());
            }
        });
    }

    public void shuffleDeck(){
        Collections.shuffle(deckOfCards);

    }



}