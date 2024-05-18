package api.player.api;

import api.card.api.Card;

import java.util.List;

/**
 * Repräsentiert einen Spieler im Kartenspiel.
 */
public class Player{
    private List<Card> hand;
    private String name;
    private boolean mau;

    public Player(List<Card> hand, String name, boolean mau) {
        this.hand = hand;
        this.name = name;
        this.mau = mau;
    }

    public List<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}
