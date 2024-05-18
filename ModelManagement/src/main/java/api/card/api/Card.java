package api.card.api;

public class Card {
    private CardColor color;
    private CardSymbol symbol;

    public Card(CardColor color, CardSymbol symbol) {
        this.color = color;
        this.symbol = symbol;
    }

    public CardColor getColor() {
        return color;
    }

    public CardSymbol getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return color + " " + symbol;
    }
}
