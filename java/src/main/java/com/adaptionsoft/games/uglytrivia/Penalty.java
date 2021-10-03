package com.adaptionsoft.games.uglytrivia;

public class Penalty {
    private final boolean[] inPenaltyBox = new boolean[6];
    private boolean isGettingOutOfPenaltyBox;

    public void add(int value) {
        inPenaltyBox[value] = false;
    }

    public boolean isPenalty(int value) {
        return !inPenaltyBox[value];
    }

    public void set(int value) {
        inPenaltyBox[value] = true;
    }

    public boolean isGettingOutOfPenaltyBox() {
        return isGettingOutOfPenaltyBox;
    }

    public void setGettingOutOfPenaltyBox(boolean gettingOutOfPenaltyBox) {
        isGettingOutOfPenaltyBox = gettingOutOfPenaltyBox;
    }
}
