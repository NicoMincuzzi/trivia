
package com.adaptionsoft.games.trivia.runner;

import com.adaptionsoft.games.uglytrivia.*;

import java.util.Random;


public class GameRunner {

    public static void main(String[] args) {
        Players players = new Players(new Places(), new Purses(), new Penalty());
        Game aGame = new Game(players, new PopQuestions(), new ScienceQuestions(), new SportsQuestions(), new RockQuestions());

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        Random rand = new Random();
        do {
            aGame.roll(rand.nextInt(5) + 1);
        } while (rand.nextInt(9) == 7 ? aGame.wrongAnswer() : aGame.wasCorrectlyAnswered());
    }
}
