package api.player.api;

import api.card.api.Card;

import java.util.List;

public interface iPlayer {

    /**
     * Spielt eine Karte für den angegebenen Spieler aus.
     * @return true, wenn die Karte erfolgreich gespielt wurde, ansonsten false.
     */
    boolean playCard(Card card);

    /**
     * Ermittelt Zahl der sich auf der Hand des Spielers befindlichen Karten
     * @return Anzahl der Karten auf der Hand
     */
    int getNumberOfCards(Player player);

    /**
     * Ermittelt, ob die Hand des Spielers leer ist
     * @return false/true
     */
    boolean isHandEmpty(Player player);

    void sayMau();

    /**
     * Spieler gibt auf
     * @return false/true
     */
    boolean GiveUp();

    /**
     * Gibt eine Liste der gültigen Spielzüge für den angegebenen Spieler zurück.
     * @return Eine Liste der gültigen Spielzüge für den Spieler.
     */
    List<Card> getValidMoves();
}
