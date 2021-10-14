package com.adaptionsoft.games.uglytrivia;

import java.util.LinkedList;

public class RockQuestions implements Questions {
    private final LinkedList<String> rockQuestions = new LinkedList<>();

    @Override
    public void init() {
        for (int i = 0; i < 50; i++) {
            rockQuestions.addLast("Rock Question " + i);
        }
    }

    @Override
    public String removeFirst() {
        return rockQuestions.removeFirst();
    }

    @Override
    public String getCategory() {
        return "Rock";
    }
}
