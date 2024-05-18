package api;

import api.card.api.Card;
import api.player.api.Player;

public interface iGameRules extends iGameRulesSpecial{

    /**
     * Überprüft, ob eine Karte gespielt werden kann, basierend auf der Karte auf dem Tisch und der vom Spieler gewählten Karte.
     * @param cardOnTable Die Karte auf dem Tisch.
     * @param playerCard Die Karte, die der Spieler spielen möchte.
     * @return true, wenn die Karte spielbar ist, ansonsten false.
     */
    boolean isCardPlayable(Card cardOnTable, Card playerCard);

    /**
     * Überprüft, ob ein bestimmter Zug gültig ist.
     * @param card Die Karte, die überprüft werden soll.
     * @return true, wenn der Zug gültig ist, ansonsten false.
     */
    boolean isValidMove(Card card);


    /**
     * Überprüft, ob der angegebene Spieler übersprungen wurde.
     * @param player Der Spieler, der überprüft werden soll.
     * @return true, wenn der Spieler übersprungen wurde, ansonsten false.
     */
    boolean isPlayerSkipped(Player player);

    /**
     * Überprüft, ob der angegebene Spieler das Spiel gewonnen hat.
     * @param player Der Spieler, der überprüft werden soll.
     * @return true, wenn der Spieler das Spiel gewonnen hat, ansonsten false.
     */
    boolean hasPlayerWon(Player player);

    /**
     * Überprüft, ob der angegebene Spieler das Spiel verloren hat.
     * @param player Der Spieler, der überprüft werden soll.
     * @return true, wenn der Spieler das Spiel verloren hat, ansonsten false.
     */
    boolean hasPlayerLost(Player player);


}
