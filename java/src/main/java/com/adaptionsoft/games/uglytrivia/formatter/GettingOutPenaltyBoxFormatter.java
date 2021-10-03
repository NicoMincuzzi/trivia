package com.adaptionsoft.games.uglytrivia.formatter;

public class GettingOutPenaltyBoxFormatter implements PlayerFormatter {
    @Override
    public String format(String currentPlayer) {
        return currentPlayer + " is getting out of the penalty box";
    }
}
