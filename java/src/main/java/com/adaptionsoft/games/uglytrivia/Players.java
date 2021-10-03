package com.adaptionsoft.games.uglytrivia;

import com.adaptionsoft.games.uglytrivia.formatter.PlayerFormatter;

import java.util.ArrayList;
import java.util.List;

public class Players {
    private final List<String> players = new ArrayList<>();
    private String name;
    private int currentPlayer = 0;

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public void incrementCurrentPlayerOrReset() {
        this.currentPlayer++;
        if (currentPlayer == players.size())
            this.currentPlayer = 0;
    }

    public String get() {
        return players.get(currentPlayer);
    }

    public void insert(String playerName) {
        name = playerName;
        players.add(playerName);
    }

    public int playersNumber() {
        return players.size();
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
