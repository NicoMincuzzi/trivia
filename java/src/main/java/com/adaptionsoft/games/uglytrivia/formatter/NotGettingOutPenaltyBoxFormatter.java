package com.adaptionsoft.games.uglytrivia.formatter;

public class NotGettingOutPenaltyBoxFormatter implements PlayerFormatter {
    @Override
    public String format(String currentPlayer) {
        return currentPlayer + " is not getting out of the penalty box";
    }
}
