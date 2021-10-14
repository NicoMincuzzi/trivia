package com.adaptionsoft.games.uglytrivia;

import com.adaptionsoft.games.uglytrivia.formatter.PlayerFormatter;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private final List<String> players = new ArrayList<>();
    private String name;
    private int currentPlayer = 0;

    private final Places places;
    private final Purses purses;
    private final Penalty penalty;

    public Players(Places places, Purses purses, Penalty penalty) {
        this.places = places;
        this.purses = purses;
        this.penalty = penalty;

        this.places.init(players.size());
        this.purses.init(players.size());
    }

    public void incrementCurrentPlayerOrReset() {
        currentPlayer++;
        if (currentPlayer == players.size())
            this.currentPlayer = 0;
    }

    public void insert(String playerName) {
        name = playerName;
        players.add(playerName);
        penalty.add(players.size());
    }

    public int retrievePlaceForCurrentPlayer() {
        return places.retrievePlace(currentPlayer);
    }

    public void updatePlace(int value) {
        places.updatePlace(currentPlayer, value);
    }

    public boolean currentPlayerPurses() {
        purses.incrementPurses(players.get(currentPlayer), currentPlayer);

        incrementCurrentPlayerOrReset();
        return purses.hasReachedThreshold(currentPlayer);
    }

    public boolean hasPenalty() {
        return penalty.isPenalty(currentPlayer);
    }

    public void set() {
        penalty.set(currentPlayer);
    }

    public boolean isGettingOutOfPenaltyBox() {
        return penalty.isGettingOutOfPenaltyBox();
    }

    public void setGettingOutOfPenaltyBox(boolean gettingOutOfPenaltyBox) {
        penalty.setGettingOutOfPenaltyBox(gettingOutOfPenaltyBox);
    }

    public String format(PlayerFormatter playerFormatter) {
        return playerFormatter.format(players.get(currentPlayer));
    }

    public String format(PlayerFormatter playerFormatter, int place) {
        return playerFormatter.format(players.get(currentPlayer), place);
    }

    public String msgPlayersNumber() {
        return name + " was added\n" + "They are player number " + players.size();
    }
}
