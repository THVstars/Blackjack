package com.carolinasanchez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck;
    private final static int[] RANKS = {1,2,3,4,5,6,7,8,9,10,11,12,13}; // final variables are named in all caps.

    public Deck() {
        deck = new ArrayList<>();
        for (int i = 0; i < RANKS.length; i++) {
            for (Suit s : Suit.values()) { // s is the arbitrary name we assigned to the Suits. : and then the collection we want to iterate over (the values in Suit)
                deck.add(new Card(s, RANKS[i]));
                System.out.println(deck.get(deck.size()-1)); // ???
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    } // collections is a class that contains static methods we can use on collections (we don't need to make an instance of collections to access them). here we used the method shuffle. the shuffled cards get stored in the original deck, not a new arraylist.

    public List<Card> getCards() {
        return deck;
    }
}
