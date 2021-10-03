package com.adaptionsoft.games.uglytrivia;

public class Places {
    private final int[] places = new int[6];
    private final Players players;

    public Places(Players players) {
        this.players = players;
    }

    public void init() {
        places[players.playersNumber()] = 0;
    }

    public int retrievePlaceForCurrentPlayer() {
        return places[players.getCurrentPlayer()];
    }

    public void updatePlace(int value) {
        places[players.getCurrentPlayer()] = retrievePlaceForCurrentPlayer() + value;
        if (retrievePlaceForCurrentPlayer() > 11)
            places[players.getCurrentPlayer()] = retrievePlaceForCurrentPlayer() - 12;
    }
}
