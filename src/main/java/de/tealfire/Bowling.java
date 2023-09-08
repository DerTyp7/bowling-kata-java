package de.tealfire;

public class Bowling {
    int score = 0;
    int roll = 0;

    public void roll(int i) {
        score += i;
        roll++;
    }

    public int score() {
        return score;
    }
}
