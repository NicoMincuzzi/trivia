package com.adaptionsoft.games.uglytrivia;

import java.util.LinkedList;

public class SportsQuestions implements Questions {
    private final LinkedList<String> sportsQuestions = new LinkedList<>();

    @Override
    public void init() {
        for (int i = 0; i < 50; i++) {
            sportsQuestions.addLast(("Sports Question " + i));
        }
    }

    @Override
    public String removeFirst() {
        return sportsQuestions.removeFirst();
    }

    @Override
    public String getCategory() {
        return "Sports";
    }
}
