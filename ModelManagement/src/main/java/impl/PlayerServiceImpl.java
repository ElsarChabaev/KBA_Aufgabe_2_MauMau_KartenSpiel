package impl;

import api.card.api.Card;
import api.player.api.Player;
import api.player.api.iPlayer;

import java.util.List;

public class PlayerServiceImpl implements iPlayer {
    @Override
    public boolean playCard(Card card) {
        return false;
    }

    @Override
    public int getNumberOfCards(Player player) {
        return 0;
    }

    @Override
    public boolean isHandEmpty(Player player) {
        return false;
    }

    @Override
    public void sayMau() {

    }

    @Override
    public boolean GiveUp() {
        return false;
    }

    @Override
    public List<Card> getValidMoves() {
        return null;
    }

}
