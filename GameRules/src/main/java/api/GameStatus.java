package api;

import api.card.api.Card;
import api.card.api.CardColor;
import api.player.api.Player;

public class GameStatus{
    private boolean isGameOver = false;
    private Player currentPlayer;
    private Card topCardOnDiscardPile;
    private int remainingDeckSize;
    private Player winner;
    private int round;
    private int penaltyCard;
    private CardColor desiredColor;
    private boolean switchDirection;

    public GameStatus(boolean isGameOver, Player currentPlayer, Card topCardOnDiscardPile, int remainingDeckSize, Player winner, int round, int penaltyCard, CardColor desiredColor, boolean switchDirection) {
        this.isGameOver = isGameOver;
        this.currentPlayer = currentPlayer;
        this.topCardOnDiscardPile = topCardOnDiscardPile;
        this.remainingDeckSize = remainingDeckSize;
        this.winner = winner;
        this.round = round;
        this.penaltyCard = penaltyCard;
        this.desiredColor = desiredColor;
        this.switchDirection = switchDirection;
    }

    public GameStatus() {

    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public Player getWinner() {
        return winner;
    }
}
