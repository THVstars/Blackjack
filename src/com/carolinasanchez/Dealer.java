package com.carolinasanchez;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Actor {
    private List<Card> hand;

    public Dealer() {
        this.hand = new ArrayList<>();
    }

    @Override
    public void drawCard(Deck deck) {
        this.hand.add(deck.getCards().get(0));
        System.out.println(deck.getCards().get(0));
        deck.getCards().remove(0);
    } // SHOULDN'T THIS LOGIC BE IN THE ACTOR INTERFACE SINCE IT'S SOMETHING BOTH THE DEALER AND PLAYER SHARE AND LOOKS EXACTLY THE SAME?

    public List<Card> getHand() {
        return hand;
    }

    public void setHand(List<Card> hand) {
        this.hand = hand;
    }
}
