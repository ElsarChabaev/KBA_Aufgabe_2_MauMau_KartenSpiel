package api;

import api.card.api.Card;
import api.player.api.Player;

public interface iGameRulesSpecial {

    /**
     * Überprüft, ob eine spezielle Regel für die gegebene Karte angewendet werden muss.
     *
     * @param card die gespielte Karte
     * @return true, wenn eine spezielle Regel angewendet werden muss, false sonst
     */
    boolean isSpecialRuleApplicable(Card card);

    /**
     * Überprüft, ob ein Spieler nach einer speziellen Regel eine zusätzliche Karte ziehen muss.
     *
     * @param player der Spieler, der möglicherweise eine zusätzliche Karte ziehen muss
     * @param card die gespielte Karte, die die Regel auslöst
     * @return true, wenn der Spieler eine zusätzliche Karte ziehen muss, false sonst
     */

    boolean mustDrawExtraCard(Player player, Card card);

    /**
     * Wendet Sonderregeln an, wenn eine spezielle Karte gespielt wird.
     *
     * @param player der Spieler, der die spezielle Karte gespielt hat
     * @param card die gespielte spezielle Karte
     */

    /**
     * Bestimmt, ob die Spielrichtung aufgrund einer speziellen Regel geändert werden muss.
     *
     * @param card die gespielte Karte, die die Regel auslöst
     * @return true, wenn die Spielrichtung geändert werden muss, false sonst
     */
    boolean shouldChangeDirection(Card card);


    void applySpecialRules(Player player, Card card);
    /**
     * Legt fest, ob ein Spieler nach einer speziellen Regel eine zusätzliche Karte ziehen muss.
     *
     * @param player der Spieler, der möglicherweise eine zusätzliche Karte ziehen muss
     * @param card die gespielte Karte, die die Regel auslöst
     * @return true, wenn der Spieler eine zusätzliche Karte ziehen muss, false sonst
     */

    /**
     * Überprüft, ob ein Spieler übersprungen werden muss aufgrund einer speziellen Regel.
     *
     * @param card die gespielte Karte, die die Regel auslöst
     * @return true, wenn der nächste Spieler übersprungen werden muss, false sonst
     */
    boolean shouldSkipNextPlayer(Card card);

    /**
     * Wendet eine spezielle Regel an, die den nächsten Spieler betrifft.
     *
     * @param currentPlayer der Spieler, der gerade an der Reihe ist
     * @param nextPlayer der nächste Spieler in der Spielreihenfolge
     * @param card die gespielte Karte, die die Regel auslöst
     */
    void applyNextPlayerRule(Player currentPlayer, Player nextPlayer, Card card);
}


