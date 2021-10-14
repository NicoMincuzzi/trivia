package com.adaptionsoft.games.uglytrivia;

import java.util.LinkedList;

public class ScienceQuestions implements Questions {
    LinkedList<String> scienceQuestions = new LinkedList<>();

    @Override
    public void init() {
        for (int i = 0; i < 50; i++) {
            scienceQuestions.addLast(("Science Question " + i));
        }
    }

    @Override
    public String removeFirst() {
        return scienceQuestions.removeFirst();
    }

    @Override
    public String getCategory() {
        return "Science";
    }
}
