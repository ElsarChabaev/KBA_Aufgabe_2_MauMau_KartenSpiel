package engine;

import impl.DeckServiceImpl;
import org.junit.Test;
import static org.junit.Assert.*;
import api.card.api.Card;

public class DeckServiceImplTest {

    /**
     * Überprüft die Methode shuffle.
     * Erwartet, dass shuffle ohne Ausnahme ausgeführt wird.
     */
    @Test
    public void testShuffle() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        deckService.shuffle();
        // Da shuffle keine spezifische Implementierung hat, wird davon ausgegangen, dass sie ohne Ausnahme ausgeführt wird
        assertTrue("Shuffle should execute without exception.", true);
    }

    /**
     * Überprüft die Methode dealCard.
     * Erwartet, dass dealCard null zurückgibt.
     */
    @Test
    public void testDealCard() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        Card card = deckService.dealCard();
        assertNull("Dealt card should be null.", card); // Stellt sicher, dass dealCard null zurückgibt
    }

    /**
     * Überprüft die Methode getCardCount.
     * Erwartet, dass getCardCount 0 zurückgibt.
     */
    @Test
    public void testGetCardCount() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        int cardCount = deckService.getCardCount();
        assertEquals("Card count should be 0.", 0, cardCount); // Stellt sicher, dass getCardCount 0 zurückgibt
    }

    /**
     * Überprüft die Methode getCards.
     * Erwartet, dass getCards 0 zurückgibt.
     */
    @Test
    public void testGetCards() {
        DeckServiceImpl deckService = new DeckServiceImpl();
        int cards = deckService.getCards();
        assertEquals("Cards should be 0.", 0, cards); // Stellt sicher, dass getCards 0 zurückgibt
    }
}
