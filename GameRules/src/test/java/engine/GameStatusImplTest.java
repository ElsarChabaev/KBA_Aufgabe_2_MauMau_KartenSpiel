package engine;

import impl.GameStatusImpl;
import org.junit.Test;
import static org.junit.Assert.*;
import api.GameStatus;
import api.card.api.Card;
import api.card.api.Deck;
import api.player.api.Player;

/**
 * Testklasse für die Klasse GameStatusImpl.
 * Überprüft die Funktionalität der Methoden der GameStatusImpl-Klasse.
 */
public class GameStatusImplTest {

    /**
     * Überprüft die Methode isGameOver.
     * Erwartet, dass isGameOver false zurückgibt, da das Spiel nicht vorbei ist.
     */
    @Test
    public void testIsGameOver() {
        GameStatusImpl gameStatus = new GameStatusImpl();
        assertFalse("isGameOver should return false.", gameStatus.isGameOver());
    }

    /**
     * Überprüft die Methode getWinner.
     * Erwartet, dass getWinner null zurückgibt, da kein Gewinner festgelegt ist.
     */
    @Test
    public void testGetWinner() {
        GameStatusImpl gameStatus = new GameStatusImpl();
        GameStatus gs = new GameStatus();
        Player winner = gameStatus.getWinner(gs);
        assertNull("getWinner should return null.", winner);
    }

    /**
     * Überprüft die Methode incrementRound.
     * Erwartet, dass incrementRound ohne Ausnahme ausgeführt wird.
     */
    @Test
    public void testIncrementRound() {
        GameStatusImpl gameStatus = new GameStatusImpl();

        gameStatus.incrementRound();

        assertTrue("incrementRound should execute without exception.", true);
    }

    /**
     * Überprüft die Methode getRemainingDeckSize.
     * Erwartet, dass getRemainingDeckSize 0 zurückgibt, wenn das Deck leer ist.
     */
    @Test
    public void testGetRemainingDeckSize() {
        GameStatusImpl gameStatus = new GameStatusImpl();
        Deck deck = new Deck();
        int size = gameStatus.getRemainingDeckSize(deck);
        assertEquals("getRemainingDeckSize should return 0.", 0, size);
    }

    /**
     * Überprüft die Methode getTopCardOnDiscardPile.
     * Erwartet, dass getTopCardOnDiscardPile null zurückgibt, wenn der Ablagestapel leer ist.
     */
    @Test
    public void testGetTopCardOnDiscardPile() {
        GameStatusImpl gameStatus = new GameStatusImpl();
        Deck deck = new Deck();
        Card topCard = gameStatus.getTopCardOnDiscardPile(deck);
        assertNull("getTopCardOnDiscardPile should return null.", topCard);
    }
}
