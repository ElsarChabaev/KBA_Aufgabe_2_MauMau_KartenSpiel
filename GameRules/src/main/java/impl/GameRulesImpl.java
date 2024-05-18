package impl;

import api.GameStatus;
import api.card.api.Card;
import api.card.api.Deck;
import api.iGameFlow;
import api.iGameRules;
import api.iGameRulesSpecial;
import api.player.api.Player;

import java.util.List;

public class GameRulesImpl implements iGameFlow {
    @Override
    public Player createGame() {
        return null;
    }

    @Override
    public Player createPlayer() {
        return null;
    }

    @Override
    public void dealInitialCards(Deck deck, Player player) {

    }

    @Override
    public void addPlayer(Player player) {

    }

    @Override
    public Card drawCard(Player player, Card card) {
        return null;
    }

    @Override
    public void startGame(Deck deck, List<Player> players, GameStatus gameStatus) {

    }

    @Override
    public void skipPlayer(Player player) {

    }

    @Override
    public List<Player> getPlayersInTurnOrder() {
        return null;
    }

    @Override
    public Player getNextPlayer(Player currentPlayer) {
        return null;
    }

    @Override
    public int numberOfCardsToDraw(Player currentPlayer) {
        return 0;
    }

    @Override
    public Player determineNextPlayer(Player currentPlayer, List<Player> players) {
        return null;
    }

    @Override
    public boolean isCardPlayable(Card cardOnTable, Card playerCard) {
        return false;
    }

    @Override
    public boolean isValidMove(Card card) {
        return false;
    }

    @Override
    public boolean isPlayerSkipped(Player player) {
        return false;
    }

    @Override
    public boolean hasPlayerWon(Player player) {
        return false;
    }

    @Override
    public boolean hasPlayerLost(Player player) {
        return false;
    }

    @Override
    public boolean isSpecialRuleApplicable(Card card) {
        return false;
    }

    @Override
    public boolean mustDrawExtraCard(Player player, Card card) {
        return false;
    }

    @Override
    public boolean shouldChangeDirection(Card card) {
        return false;
    }

    @Override
    public void applySpecialRules(Player player, Card card) {

    }

    @Override
    public boolean shouldSkipNextPlayer(Card card) {
        return false;
    }

    @Override
    public void applyNextPlayerRule(Player currentPlayer, Player nextPlayer, Card card) {

    }

    public boolean isGameOver() {
        return false;
    }
}
