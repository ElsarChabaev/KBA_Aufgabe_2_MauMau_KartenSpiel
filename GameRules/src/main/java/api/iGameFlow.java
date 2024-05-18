package api;

import api.GameStatus;
import api.card.api.Card;
import api.card.api.Deck;
import api.player.api.Player;

import java.util.List;

public interface iGameFlow extends iGameRules {

    /**
     * Erstellen eines neuen Spiels
     */
    Player createGame();

    /**
     * Erstellen eines neuen Mitspielers
     */
    Player createPlayer();

    /**
     * Teilt die Anfangskarten an die Spieler aus.
     */
    void dealInitialCards(Deck deck, Player player);

    /**
     * Fügt einen Spieler dem Spiel hinzu.
     * @param player Der Spieler, der dem Spiel hinzugefügt werden soll.
     */
    void addPlayer(Player player);

    /**
     * Zieht eine Karte für den angegebenen Spieler.
     * @return Die gezogene Karte.
     */
    Card drawCard(Player player, Card card);

    /**
     * Startet das Spiel und führt die erforderlichen Initialisierungen durch.
     */
    void startGame(Deck deck, List<Player> players, GameStatus gameStatus);

    /**
     * Überspringt den angegebenen Spieler.
     * @param player Der Spieler, der übersprungen werden soll.
     */
    void skipPlayer(Player player);

    /**
     * Gibt eine Liste der Spieler in der Reihenfolge zurück, in der sie am Zug sind.
     * @return Eine Liste der Spieler in der Reihenfolge, in der sie am Zug sind.
     */
    List<Player> getPlayersInTurnOrder();

    /**
     * Gibt den nächsten Spieler in der Reihenfolge zurück, nachdem der aktuelle Spieler seinen Zug beendet hat.
     * @param currentPlayer Der aktuelle Spieler.
     * @return Der nächste Spieler in der Reihenfolge.
     */
    Player getNextPlayer(Player currentPlayer);

    /**
     * Gibt die Anzahl der Karten an, die ein Spieler ziehen muss, wenn er keine gültige Karte spielen kann.
     *
     * @param currentPlayer der Spieler, der keine gültige Karte spielen konnte
     * @return die Anzahl der Karten, die der Spieler ziehen muss
     */
    int numberOfCardsToDraw(Player currentPlayer);

    /**
     * Bestimmt die nächste Spielreihenfolge nach einem bestimmten Zug.
     *
     * @param currentPlayer der Spieler, der gerade an der Reihe ist
     * @param players die Liste aller Spieler im Spiel
     * @return der nächste Spieler, der an der Reihe ist
     */
    Player determineNextPlayer(Player currentPlayer, List<Player> players);

}
