package impl;

import api.card.api.Card;
import api.card.api.Deck;
import api.card.api.iDeck;

public class DeckServiceImpl  implements iDeck {
    @Override
    public Deck initialize() {
        return null;
    }

    @Override
    public Deck shuffleDeck(Deck deck) {
        return null;
    }

    @Override
    public boolean isDeckempty(Deck deck) {
        return false;
    }

    @Override
    public void addCardToPile(Card card) {

    }

    public void shuffle() {
    }

    public int getCards() {
        return 0;
    }

    public Card dealCard() {
        return null;
    }

    public int getCardCount() {
        return 0;
    }
}
