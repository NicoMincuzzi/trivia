package com.adaptionsoft.games.uglytrivia.formatter;

public class CurrentPlayerFormatter implements PlayerFormatter {
    @Override
    public String format(String currentPlayer) {
        return currentPlayer + " is the current player";
    }
}
