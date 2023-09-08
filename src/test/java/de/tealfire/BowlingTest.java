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
        roll(20, 0);
        assert bowling.score() == 0;
    }

    @Test
    public void testScoreGameOfOnes() {
        roll(20, 1);
        assert bowling.score() == 20;
    }

    private void roll(int n, int pins) {
        for (int i = 0; i < n; i++) {
            bowling.roll(pins);
        }
    }

    @Test
    public void testScoreSpare() {
        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(3);
        roll(17, 0);
        assert bowling.score() == 16;
    }

}
