package engine;

import org.junit.Test;
import static org.junit.Assert.*;
import impl.GameRulesImpl;

    /**
     * Testklasse für die Klasse GameRulesImpl.
     * Überprüft die Funktionalität der Methoden der GameRulesImpl-Klasse.
     */
    public class GameRulesImplTest {

        /**
         * Überprüft eine Methode der Spielregeln.
         * Erwartet, dass die Methode isGameOver false zurückgibt.
         */
        @Test
        public void testGameRuleMethod() {
            GameRulesImpl rules = new GameRulesImpl();

            boolean result = rules.isGameOver();
            assertFalse(result);
        }
    }
