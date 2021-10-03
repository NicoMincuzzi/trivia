package com.adaptionsoft.games.uglytrivia.formatter;

public class PlayerLocationFormatter implements PlayerFormatter {
    @Override
    public String format(String currentPlayer, int place) {
        return currentPlayer + "'s new location is " + place;
    }
}
