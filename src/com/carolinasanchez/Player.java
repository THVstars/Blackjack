package com.carolinasanchez;

import java.util.ArrayList;
import java.util.List;

public class Player implements Actor {
    private List<Card> hand;

    public Player() {
        this.hand = new ArrayList<>();
    } // don't pass in the list so that a new, empty hand is created every time a new player is created.

    @Override
    public void drawCard(Deck deck) {
        this.hand.add(deck.getCards().get(0));
        System.out.println(deck.getCards().get(0));
        deck.getCards().remove(0);
    }
    // interface = "implements"
    // abstract = "extends"
}
