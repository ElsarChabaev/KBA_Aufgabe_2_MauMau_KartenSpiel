package impl;

import api.GameStatus;
import api.card.api.Card;
import api.card.api.Deck;
import api.iGameStatus;
import api.player.api.Player;

public class GameStatusImpl implements iGameStatus {
    @Override
    public boolean isGameOver() {
        return false;
    }

    @Override
    public Player getWinner(GameStatus gs) {
        return null;
    }

    @Override
    public void incrementRound() {

    }

    @Override
    public int getRemainingDeckSize(Deck deck) {
        return 0;
    }

    @Override
    public Card getTopCardOnDiscardPile(Deck deck) {
        return null;
    }
}
