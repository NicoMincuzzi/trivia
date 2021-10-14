package com.adaptionsoft.games.uglytrivia;

public class Purses {
    private final int[] purses = new int[6];

    public void init(int playersNumber) {
        purses[playersNumber] = 0;
    }

    public void incrementPurses(String player, int currentPlayer) {
        purses[currentPlayer]++;
        System.out.println(player + " now has " + purses[currentPlayer] + " Gold Coins.");

    }

    public boolean hasReachedThreshold(int currentPlayer) {
        return !(purses[currentPlayer] == 6);
    }
}
