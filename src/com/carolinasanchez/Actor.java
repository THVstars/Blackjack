package com.carolinasanchez;

import java.util.ArrayList;
import java.util.List;

public interface Actor {
// an enum contains constant information and cannot contain behavior/methods. for that we use an interface.

    List<Card> hand = new ArrayList<>();

    public void drawCard(Deck deck);
}
