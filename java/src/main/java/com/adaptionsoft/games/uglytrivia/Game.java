package com.adaptionsoft.games.uglytrivia;

import com.adaptionsoft.games.uglytrivia.formatter.*;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class Game {
    private final Players players;
    private final PopQuestions popQuestions;
    private final ScienceQuestions scienceQuestions;
    private final SportsQuestions sportsQuestions;
    private final RockQuestions rockQuestions;

    public Game(Players players, Questions... questions) {
        this.players = players;

        popQuestions = (PopQuestions) questions[0];
        scienceQuestions = (ScienceQuestions) questions[1];
        sportsQuestions = (SportsQuestions) questions[2];
        rockQuestions = (RockQuestions) questions[3];

        Arrays.stream(questions).forEach(Questions::init);
    }

    public void add(String playerName) {
        players.insert(playerName);
        System.out.println(players.msgPlayersNumber());
    }

    public void roll(int roll) {
        System.out.println(players.format(new CurrentPlayerFormatter()));
        System.out.println("They have rolled a " + roll);

        if (players.hasPenalty()) {
            players.updatePlace(roll);
            System.out.println(players.format(new PlayerLocationFormatter(), players.retrievePlaceForCurrentPlayer()));
            System.out.println("The category is " + currentCategory().getCategory() + "\n" + currentCategory().removeFirst());
            return;
        }
        if (roll % 2 != 0) {
            players.setGettingOutOfPenaltyBox(true);

            System.out.println(players.format(new GettingOutPenaltyBoxFormatter()));
            players.updatePlace(roll);
            System.out.println(players.format(new PlayerLocationFormatter(), players.retrievePlaceForCurrentPlayer()));
            System.out.println("The category is " + currentCategory().getCategory() + "\n" + currentCategory().removeFirst());
            return;
        }
        System.out.println(players.format(new NotGettingOutPenaltyBoxFormatter()));
        players.setGettingOutOfPenaltyBox(false);
    }

    private Questions currentCategory() {
        if (asList(0, 4, 8).contains(players.retrievePlaceForCurrentPlayer()))
            return popQuestions;
        if (asList(1, 5, 9).contains(players.retrievePlaceForCurrentPlayer()))
            return scienceQuestions;
        if (asList(2, 6, 10).contains(players.retrievePlaceForCurrentPlayer()))
            return sportsQuestions;
        return rockQuestions;
    }

    public boolean wasCorrectlyAnswered() {
        if (players.hasPenalty()) {
            System.out.println("Answer was corrent!!!!");
            return players.currentPlayerPurses();
        }
        if (players.isGettingOutOfPenaltyBox()) {
            System.out.println("Answer was correct!!!!");
            return players.currentPlayerPurses();
        }
        players.incrementCurrentPlayerOrReset();
        return true;
    }

    public boolean wrongAnswer() {
        System.out.println(players.format(new WrongAnswerFormatter()));
        players.set();

        players.incrementCurrentPlayerOrReset();
        return true;
    }
}
