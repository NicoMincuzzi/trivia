package com.adaptionsoft.games.uglytrivia;

public class Places {
    private final int[] places = new int[6];

    public void init(int playersNumber) {
        places[playersNumber] = 0;
    }

    public int retrievePlace(int currentPlayer) {
        return places[currentPlayer];
    }

    public void updatePlace(int currentPlayer,int value) {
        places[currentPlayer] = retrievePlace(currentPlayer) + value;
        if (retrievePlace(currentPlayer) > 11)
            places[currentPlayer] = retrievePlace(currentPlayer) - 12;
    }
}
