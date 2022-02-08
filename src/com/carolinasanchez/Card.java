package com.carolinasanchez;

public class Card {
    // cards have two main properties: suit, rank
    // suit: clubs, diamonds, hearts,spades
    // rank: Ace, 2, 3... Queen, King
    // we need to make our own specific enum for Suit
    private Suit suit;
    private int rank; // 1 = ace, 11 = jack, 12 = queen, 13 = king

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() { // only overrides the toString method when we use it on a Card!
        String strRank = "";

        switch (rank) {
            case 1 -> strRank = "Ace";
            case 11 -> strRank = "Jack";
            case 12 -> strRank = "Queen";
            case 13 -> strRank = "King";
            default -> strRank = Integer.toString(rank);
        }
        return "This is the " + strRank + " of " + this.suit + ".";
    }
}
