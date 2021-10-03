package com.adaptionsoft.games.uglytrivia;

import com.adaptionsoft.games.uglytrivia.formatter.*;

import java.util.Arrays;

import static java.util.Arrays.asList;

public class Game {
    private final Players players;
    private final Places places;
    private final PopQuestions popQuestions;
    private final ScienceQuestions scienceQuestions;
    private final SportsQuestions sportsQuestions;
    private final RockQuestions rockQuestions;
    private final Purses purses;
    private final Penalty penalty;

    public Game(Players players, Places places, Purses purses, Penalty penalty, Questions... questions) {
        this.players = players;
        this.places = places;
        this.purses = purses;
        this.penalty = penalty;
        popQuestions = (PopQuestions) questions[0];
        scienceQuestions = (ScienceQuestions) questions[1];
        sportsQuestions = (SportsQuestions) questions[2];
        rockQuestions = (RockQuestions) questions[3];

        Arrays.stream(questions).forEach(Questions::init);
    }

    public void add(String playerName) {
        players.insert(playerName);
        places.init();
        purses.init();
        penalty.add(players.playersNumber());

        System.out.println(players.msgPlayersNumber());
    }

    public void roll(int roll) {
        System.out.println(players.format(new CurrentPlayerFormatter()));
        System.out.println("They have rolled a " + roll);

        if (penalty.isPenalty(players.getCurrentPlayer())) {
            foo(roll);
            return;
        }
        if (roll % 2 != 0) {
            penalty.setGettingOutOfPenaltyBox(true);

            System.out.println(players.format(new GettingOutPenaltyBoxFormatter()));
            foo(roll);
            return;
        }
        System.out.println(players.format(new NotGettingOutPenaltyBoxFormatter()));
        penalty.setGettingOutOfPenaltyBox(false);
    }

    private void foo(int roll) {
        places.updatePlace(roll);
        System.out.println(players.format(new PlayerLocationFormatter(), places.retrievePlaceForCurrentPlayer()));
        System.out.println("The category is " + currentCategory().getCategory() + "\n" + currentCategory().removeFirst());
    }

    private Questions currentCategory() {
        if (asList(0, 4, 8).contains(places.retrievePlaceForCurrentPlayer()))
            return popQuestions;
        if (asList(1, 5, 9).contains(places.retrievePlaceForCurrentPlayer()))
            return scienceQuestions;
        if (asList(2, 6, 10).contains(places.retrievePlaceForCurrentPlayer()))
            return sportsQuestions;
        return rockQuestions;
    }

    public boolean wasCorrectlyAnswered() {
        if (penalty.isPenalty(players.getCurrentPlayer())) {
            System.out.println("Answer was corrent!!!!");
            return purses.bar();
        }
        if (penalty.isGettingOutOfPenaltyBox()) {
            System.out.println("Answer was correct!!!!");
            return purses.bar();
        }
        players.incrementCurrentPlayerOrReset();
        return true;
    }

    public boolean wrongAnswer() {
        System.out.println(players.format(new WrongAnswerFormatter()));
        penalty.set(players.getCurrentPlayer());

        players.incrementCurrentPlayerOrReset();
        return true;
    }
}
