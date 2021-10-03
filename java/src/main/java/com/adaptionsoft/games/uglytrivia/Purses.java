package com.adaptionsoft.games.uglytrivia;

public class Purses {
    private final int[] purses = new int[6];
    private final Players players;

    public Purses(Players players) {
        this.players = players;
    }

    public void init() {
        purses[players.playersNumber()] = 0;
    }

    public boolean bar() {
        purses[players.getCurrentPlayer()]++;
        System.out.println(players.get() + " now has " + purses[players.getCurrentPlayer()] + " Gold Coins.");

        players.incrementCurrentPlayerOrReset();
        return !(purses[players.getCurrentPlayer()] == 6);
    }
}
