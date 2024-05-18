package engine;

import api.GameStatus;
import api.card.api.Deck;
import api.player.api.Player;
import org.junit.Test;
import static org.junit.Assert.*;

import impl.DeckServiceImpl;
import impl.GameRulesImpl;
import impl.GameStatusImpl;
import impl.PlayerServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Testklasse für den GameController.
 * Überprüft die korrekte Initialisierung des GameControllers.
 */
public class GameControllerTest {

    /**
     * Testet die Initialisierung des GameControllers.
     * Stellt sicher, dass der GameController korrekt instanziiert wird und nicht null ist.
     */
    @Test
    public void testGameControllerInitialization() {

        // Erstelle leeres Deck
        Deck deck = new Deck();

        // Erstelle leeren GameStatus
        GameStatus gameStatus = new GameStatus();

        // Erstelle leere Spielerliste
        List<Player> players = Arrays.asList();

        // Erstelle GameController
        GameController controller = new GameController(players, deck, gameStatus);

        // Überprüfe, ob der Controller nicht null ist
        assertNotNull(controller);
    }
}

