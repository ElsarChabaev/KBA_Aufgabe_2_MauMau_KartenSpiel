package engine;

import api.GameStatus;
import api.card.api.Card;
import api.card.api.Deck;
import api.card.api.iDeck;
import api.iGameFlow;
import api.iGameStatus;
import api.player.api.Player;
import api.player.api.iPlayer;
import impl.DeckServiceImpl;
import impl.GameRulesImpl;
import impl.GameStatusImpl;
import impl.PlayerServiceImpl;

import java.util.List;

/**
 * Die Klasse GameController steuert den gesamten Spielablauf des Mau-Mau-Spiels.
 * Sie initialisiert die notwendigen Dienste und startet das Spiel.
 */
public class GameController {

    private iGameFlow gameFlowService;
    private iGameStatus gameStatusService;
    private iDeck deckService;
    private iPlayer playerService;

    /**
     * Konstruktor für den GameController.
     * Initialisiert die notwendigen Dienste und stellt den Spielablaufservice bereit.
     *
     * @param players die Liste der Spieler, die am Spiel teilnehmen.
     * @param deck das Kartendeck, das für das Spiel verwendet wird.
     * @param gameStatus der aktuelle Spielstatus.
     */
    public GameController(List<Player> players, Deck deck, GameStatus gameStatus) {
        this.gameFlowService = new GameRulesImpl();
        this.gameStatusService = new GameStatusImpl();
        this.deckService = new DeckServiceImpl();
        this.playerService = new PlayerServiceImpl();
    }
}
