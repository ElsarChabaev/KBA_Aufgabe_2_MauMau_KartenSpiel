package api.card.api;

public interface iDeck {

    /**
     * Iniziiert ein deues Deck
     * @return das neu iniziierte Deck (ungemischt)
     */
    Deck initialize();

    /**
     * Mischt das neu iniziierte Deck
     * @param deck nimmt das neu iniziierte Deck
     * @return gibt das neu iniziierte Deck zurück
     */
    Deck shuffleDeck(Deck deck);


    /**
     * Prüft, ob das Deck leer ist
     * @return Ergebnis der Prüfung
     */
    boolean isDeckempty(Deck deck);

    /**
     * Iniziiert ein deues Deck
     * @return das neu iniziierte Deck (ungemischt)
     */
    void addCardToPile(Card card);
}
