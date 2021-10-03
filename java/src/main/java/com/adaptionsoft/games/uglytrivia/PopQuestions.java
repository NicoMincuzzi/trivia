package com.adaptionsoft.games.uglytrivia;

import java.util.LinkedList;

public class PopQuestions implements Questions{
    private final LinkedList<String> popQuestions = new LinkedList<>();

    @Override
    public void init() {
        for (int i = 0; i < 50; i++) {
            popQuestions.addLast("Pop Question " + i);
        }
    }

    @Override
    public String removeFirst() {
        return popQuestions.removeFirst();
    }

    @Override
    public String getCategory() {
        return "Pop";
    }
}
