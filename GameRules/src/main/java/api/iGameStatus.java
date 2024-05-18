package api;

import api.card.api.Card;
import api.card.api.Deck;
import api.player.api.Player;

public interface iGameStatus {

    /**
     * Überprüft, ob das Spiel vorbei ist.
     * @return true, wenn das Spiel vorbei ist, ansonsten false.
     */
    boolean isGameOver();

    /**
     * Gibt den Gewinner des Spiels zurück.
     * @return Der Gewinner des Spiels.
     */
    Player getWinner(GameStatus gs);

    /**
     * Erhöht die Rundenzahl um eins.
     */
    void incrementRound();

    /**
     * Gibt die Zahl des Decks
     * @return Anzahl der verbleibenden karten
     */
    public int getRemainingDeckSize(Deck deck);


    /**
     * Gibt die aktuell oberste Karte zurück
     * @return Anzahl der verbleibenden karten
     */
    public Card getTopCardOnDiscardPile(Deck deck);
}

