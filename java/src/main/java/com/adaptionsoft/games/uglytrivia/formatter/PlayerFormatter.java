package com.adaptionsoft.games.uglytrivia.formatter;

public interface PlayerFormatter {
    default String format(String s) {
        return "";
    }

    default String format(String currentPlayer, int place) {
        return "";
    }
}
