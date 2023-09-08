package de.tealfire;

import org.junit.jupiter.api.Test;

public class BowlingTest {
    @Test
    public void testScoreGutterGame() {
        Bowling bowling = new Bowling();
        for (int i = 0; i < 20; i++) {
            bowling.roll(0);
        }
        assert bowling.score() == 0;
    }

    @Test
    public void testScoreGameOfOnes() {
        Bowling bowling = new Bowling();
        for (int i = 0; i < 20; i++) {
            bowling.roll(1);
        }
        assert bowling.score() == 20;
    }
}
