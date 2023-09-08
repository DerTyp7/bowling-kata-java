package de.tealfire;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BowlingTest {
    private Bowling bowling;
    @BeforeEach
    public void setUp() {
        bowling = new Bowling();
    }

    @Test
    public void testScoreGutterGame() {
        for (int i = 0; i < 20; i++) {
            bowling.roll(0);
        }
        assert bowling.score() == 0;
    }

    @Test
    public void testScoreGameOfOnes() {
        for (int i = 0; i < 20; i++) {
            bowling.roll(1);
        }
        assert bowling.score() == 20;
    }
}
