package org.example;

public class Introduction {

    public void introSnapOnePlayer(){
        System.out.println("____________WELCOME TO SNAP____________ ");
        System.out.println("RULES: Click enter until you find a SNAP!");
    }

    public void introSnapTwoPlayer(int TIME_LIMIT){
        System.out.println("____________WELCOME TO SNAP____________ ");
        System.out.println("RULES: ");
        System.out.println("# Player One click enter to pick up card randomly from the deck");
        System.out.println("# Player Two click enter to pick up the next card randomly from the deck");
        System.out.println("When a number is matched you will have " + TIME_LIMIT + " seconds to type in your designated letters and click ENTER");
        System.out.println("PLAYER ONE'S LETTER = Q");
        System.out.println("PLAYER TWO'S LETTER = P");
    }
}
