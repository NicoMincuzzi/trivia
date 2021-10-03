package com.adaptionsoft.games.uglytrivia.formatter;

public class WrongAnswerFormatter implements PlayerFormatter {
    @Override
    public String format(String currentPlayer) {
        return "Question was incorrectly answered\n" + currentPlayer + " was sent to the penalty box";
    }
}
