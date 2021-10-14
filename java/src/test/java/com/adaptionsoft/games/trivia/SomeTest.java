package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.uglytrivia.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SomeTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void test1() {
        Questions popQuestions = new PopQuestions();
        Questions scienceQuestions = new ScienceQuestions();
        Questions sportsQuestions = new SportsQuestions();
        Questions rockQuestions = new RockQuestions();
        Players players = new Players(new Places(), new Purses(), new Penalty());
        Game aGame = new Game(players, popQuestions, scienceQuestions, sportsQuestions, rockQuestions);

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        do {
            aGame.roll(4 + 1);
        } while ((6 == 7) ? aGame.wrongAnswer() : aGame.wasCorrectlyAnswered());
        Assert.assertEquals(expected1, outputStreamCaptor.toString().trim());
    }

    @Test
    public void test2() {
        Questions popQuestions = new PopQuestions();
        Questions scienceQuestions = new ScienceQuestions();
        Questions sportsQuestions = new SportsQuestions();
        Questions rockQuestions = new RockQuestions();
        Players players = new Players(new Places(), new Purses(), new Penalty());
        Game aGame = new Game(players, popQuestions, scienceQuestions, sportsQuestions, rockQuestions);

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        do {
            aGame.roll(0 + 1);
        } while ((5 == 7) ? aGame.wrongAnswer() : aGame.wasCorrectlyAnswered());
        Assert.assertEquals(expected2, outputStreamCaptor.toString().trim());
    }

    @Test
    public void test3() {
        Questions popQuestions = new PopQuestions();
        Questions scienceQuestions = new ScienceQuestions();
        Questions sportsQuestions = new SportsQuestions();
        Questions rockQuestions = new RockQuestions();
        Players players = new Players(new Places(), new Purses(), new Penalty());
        Game aGame = new Game(players, popQuestions, scienceQuestions, sportsQuestions, rockQuestions);

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");
        do {
            aGame.roll(4 + 1);
        } while ((2 == 7) ? aGame.wrongAnswer() : aGame.wasCorrectlyAnswered());
        Assert.assertEquals(expected3, outputStreamCaptor.toString().trim());
    }

    @Test
    public void test4() {
        Questions popQuestions = new PopQuestions();
        Questions scienceQuestions = new ScienceQuestions();
        Questions sportsQuestions = new SportsQuestions();
        Questions rockQuestions = new RockQuestions();
        Players players = new Players(new Places(), new Purses(), new Penalty());
        Game aGame = new Game(players, popQuestions, scienceQuestions, sportsQuestions, rockQuestions);

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");
        do {
            aGame.roll(1 + 1);
        } while ((4 == 7) ? aGame.wrongAnswer() : aGame.wasCorrectlyAnswered());
        Assert.assertEquals(expected4, outputStreamCaptor.toString().trim());
    }

    String expected1 = "Chet was added\nThey are player number 1\nPat was added\nThey are player number 2\nSue was added\nThey are player number 3\nChet is the current player\nThey have rolled a 5\nChet\'s new location is 5\nThe category is Science\nScience Question 0\nAnswer was corrent!!!!\nChet now has 1 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat\'s new location is 5\nThe category is Science\nScience Question 1\nAnswer was corrent!!!!\nPat now has 1 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue\'s new location is 5\nThe category is Science\nScience Question 2\nAnswer was corrent!!!!\nSue now has 1 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet\'s new location is 10\nThe category is Sports\nSports Question 0\nAnswer was corrent!!!!\nChet now has 2 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat\'s new location is 10\nThe category is Sports\nSports Question 1\nAnswer was corrent!!!!\nPat now has 2 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue\'s new location is 10\nThe category is Sports\nSports Question 2\nAnswer was corrent!!!!\nSue now has 2 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet\'s new location is 3\nThe category is Rock\nRock Question 0\nAnswer was corrent!!!!\nChet now has 3 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat\'s new location is 3\nThe category is Rock\nRock Question 1\nAnswer was corrent!!!!\nPat now has 3 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue\'s new location is 3\nThe category is Rock\nRock Question 2\nAnswer was corrent!!!!\nSue now has 3 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet\'s new location is 8\nThe category is Pop\nPop Question 0\nAnswer was corrent!!!!\nChet now has 4 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat\'s new location is 8\nThe category is Pop\nPop Question 1\nAnswer was corrent!!!!\nPat now has 4 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue\'s new location is 8\nThe category is Pop\nPop Question 2\nAnswer was corrent!!!!\nSue now has 4 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet\'s new location is 1\nThe category is Science\nScience Question 3\nAnswer was corrent!!!!\nChet now has 5 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat\'s new location is 1\nThe category is Science\nScience Question 4\nAnswer was corrent!!!!\nPat now has 5 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue\'s new location is 1\nThe category is Science\nScience Question 5\nAnswer was corrent!!!!\nSue now has 5 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet\'s new location is 6\nThe category is Sports\nSports Question 3\nAnswer was corrent!!!!\nChet now has 6 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat\'s new location is 6\nThe category is Sports\nSports Question 4\nAnswer was corrent!!!!\nPat now has 6 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue\'s new location is 6\nThe category is Sports\nSports Question 5\nAnswer was corrent!!!!\nSue now has 6 Gold Coins.";
    String expected2 = "Chet was added\nThey are player number 1\nPat was added\nThey are player number 2\nSue was added\nThey are player number 3\nChet is the current player\nThey have rolled a 1\nChet's new location is 1\nThe category is Science\nScience Question 0\nAnswer was corrent!!!!\nChet now has 1 Gold Coins.\nPat is the current player\nThey have rolled a 1\nPat's new location is 1\nThe category is Science\nScience Question 1\nAnswer was corrent!!!!\nPat now has 1 Gold Coins.\nSue is the current player\nThey have rolled a 1\nSue's new location is 1\nThe category is Science\nScience Question 2\nAnswer was corrent!!!!\nSue now has 1 Gold Coins.\nChet is the current player\nThey have rolled a 1\nChet's new location is 2\nThe category is Sports\nSports Question 0\nAnswer was corrent!!!!\nChet now has 2 Gold Coins.\nPat is the current player\nThey have rolled a 1\nPat's new location is 2\nThe category is Sports\nSports Question 1\nAnswer was corrent!!!!\nPat now has 2 Gold Coins.\nSue is the current player\nThey have rolled a 1\nSue's new location is 2\nThe category is Sports\nSports Question 2\nAnswer was corrent!!!!\nSue now has 2 Gold Coins.\nChet is the current player\nThey have rolled a 1\nChet's new location is 3\nThe category is Rock\nRock Question 0\nAnswer was corrent!!!!\nChet now has 3 Gold Coins.\nPat is the current player\nThey have rolled a 1\nPat's new location is 3\nThe category is Rock\nRock Question 1\nAnswer was corrent!!!!\nPat now has 3 Gold Coins.\nSue is the current player\nThey have rolled a 1\nSue's new location is 3\nThe category is Rock\nRock Question 2\nAnswer was corrent!!!!\nSue now has 3 Gold Coins.\nChet is the current player\nThey have rolled a 1\nChet's new location is 4\nThe category is Pop\nPop Question 0\nAnswer was corrent!!!!\nChet now has 4 Gold Coins.\nPat is the current player\nThey have rolled a 1\nPat's new location is 4\nThe category is Pop\nPop Question 1\nAnswer was corrent!!!!\nPat now has 4 Gold Coins.\nSue is the current player\nThey have rolled a 1\nSue's new location is 4\nThe category is Pop\nPop Question 2\nAnswer was corrent!!!!\nSue now has 4 Gold Coins.\nChet is the current player\nThey have rolled a 1\nChet's new location is 5\nThe category is Science\nScience Question 3\nAnswer was corrent!!!!\nChet now has 5 Gold Coins.\nPat is the current player\nThey have rolled a 1\nPat's new location is 5\nThe category is Science\nScience Question 4\nAnswer was corrent!!!!\nPat now has 5 Gold Coins.\nSue is the current player\nThey have rolled a 1\nSue's new location is 5\nThe category is Science\nScience Question 5\nAnswer was corrent!!!!\nSue now has 5 Gold Coins.\nChet is the current player\nThey have rolled a 1\nChet's new location is 6\nThe category is Sports\nSports Question 3\nAnswer was corrent!!!!\nChet now has 6 Gold Coins.\nPat is the current player\nThey have rolled a 1\nPat's new location is 6\nThe category is Sports\nSports Question 4\nAnswer was corrent!!!!\nPat now has 6 Gold Coins.\nSue is the current player\nThey have rolled a 1\nSue's new location is 6\nThe category is Sports\nSports Question 5\nAnswer was corrent!!!!\nSue now has 6 Gold Coins.";
    String expected3 = "Chet was added\nThey are player number 1\nPat was added\nThey are player number 2\nSue was added\nThey are player number 3\nChet is the current player\nThey have rolled a 5\nChet's new location is 5\nThe category is Science\nScience Question 0\nAnswer was corrent!!!!\nChet now has 1 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat's new location is 5\nThe category is Science\nScience Question 1\nAnswer was corrent!!!!\nPat now has 1 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue's new location is 5\nThe category is Science\nScience Question 2\nAnswer was corrent!!!!\nSue now has 1 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet's new location is 10\nThe category is Sports\nSports Question 0\nAnswer was corrent!!!!\nChet now has 2 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat's new location is 10\nThe category is Sports\nSports Question 1\nAnswer was corrent!!!!\nPat now has 2 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue's new location is 10\nThe category is Sports\nSports Question 2\nAnswer was corrent!!!!\nSue now has 2 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet's new location is 3\nThe category is Rock\nRock Question 0\nAnswer was corrent!!!!\nChet now has 3 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat's new location is 3\nThe category is Rock\nRock Question 1\nAnswer was corrent!!!!\nPat now has 3 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue's new location is 3\nThe category is Rock\nRock Question 2\nAnswer was corrent!!!!\nSue now has 3 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet's new location is 8\nThe category is Pop\nPop Question 0\nAnswer was corrent!!!!\nChet now has 4 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat's new location is 8\nThe category is Pop\nPop Question 1\nAnswer was corrent!!!!\nPat now has 4 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue's new location is 8\nThe category is Pop\nPop Question 2\nAnswer was corrent!!!!\nSue now has 4 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet's new location is 1\nThe category is Science\nScience Question 3\nAnswer was corrent!!!!\nChet now has 5 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat's new location is 1\nThe category is Science\nScience Question 4\nAnswer was corrent!!!!\nPat now has 5 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue's new location is 1\nThe category is Science\nScience Question 5\nAnswer was corrent!!!!\nSue now has 5 Gold Coins.\nChet is the current player\nThey have rolled a 5\nChet's new location is 6\nThe category is Sports\nSports Question 3\nAnswer was corrent!!!!\nChet now has 6 Gold Coins.\nPat is the current player\nThey have rolled a 5\nPat's new location is 6\nThe category is Sports\nSports Question 4\nAnswer was corrent!!!!\nPat now has 6 Gold Coins.\nSue is the current player\nThey have rolled a 5\nSue's new location is 6\nThe category is Sports\nSports Question 5\nAnswer was corrent!!!!\nSue now has 6 Gold Coins.";
    String expected4 = "Chet was added\nThey are player number 1\nPat was added\nThey are player number 2\nSue was added\nThey are player number 3\nChet is the current player\nThey have rolled a 2\nChet's new location is 2\nThe category is Sports\nSports Question 0\nAnswer was corrent!!!!\nChet now has 1 Gold Coins.\nPat is the current player\nThey have rolled a 2\nPat's new location is 2\nThe category is Sports\nSports Question 1\nAnswer was corrent!!!!\nPat now has 1 Gold Coins.\nSue is the current player\nThey have rolled a 2\nSue's new location is 2\nThe category is Sports\nSports Question 2\nAnswer was corrent!!!!\nSue now has 1 Gold Coins.\nChet is the current player\nThey have rolled a 2\nChet's new location is 4\nThe category is Pop\nPop Question 0\nAnswer was corrent!!!!\nChet now has 2 Gold Coins.\nPat is the current player\nThey have rolled a 2\nPat's new location is 4\nThe category is Pop\nPop Question 1\nAnswer was corrent!!!!\nPat now has 2 Gold Coins.\nSue is the current player\nThey have rolled a 2\nSue's new location is 4\nThe category is Pop\nPop Question 2\nAnswer was corrent!!!!\nSue now has 2 Gold Coins.\nChet is the current player\nThey have rolled a 2\nChet's new location is 6\nThe category is Sports\nSports Question 3\nAnswer was corrent!!!!\nChet now has 3 Gold Coins.\nPat is the current player\nThey have rolled a 2\nPat's new location is 6\nThe category is Sports\nSports Question 4\nAnswer was corrent!!!!\nPat now has 3 Gold Coins.\nSue is the current player\nThey have rolled a 2\nSue's new location is 6\nThe category is Sports\nSports Question 5\nAnswer was corrent!!!!\nSue now has 3 Gold Coins.\nChet is the current player\nThey have rolled a 2\nChet's new location is 8\nThe category is Pop\nPop Question 3\nAnswer was corrent!!!!\nChet now has 4 Gold Coins.\nPat is the current player\nThey have rolled a 2\nPat's new location is 8\nThe category is Pop\nPop Question 4\nAnswer was corrent!!!!\nPat now has 4 Gold Coins.\nSue is the current player\nThey have rolled a 2\nSue's new location is 8\nThe category is Pop\nPop Question 5\nAnswer was corrent!!!!\nSue now has 4 Gold Coins.\nChet is the current player\nThey have rolled a 2\nChet's new location is 10\nThe category is Sports\nSports Question 6\nAnswer was corrent!!!!\nChet now has 5 Gold Coins.\nPat is the current player\nThey have rolled a 2\nPat's new location is 10\nThe category is Sports\nSports Question 7\nAnswer was corrent!!!!\nPat now has 5 Gold Coins.\nSue is the current player\nThey have rolled a 2\nSue's new location is 10\nThe category is Sports\nSports Question 8\nAnswer was corrent!!!!\nSue now has 5 Gold Coins.\nChet is the current player\nThey have rolled a 2\nChet's new location is 0\nThe category is Pop\nPop Question 6\nAnswer was corrent!!!!\nChet now has 6 Gold Coins.\nPat is the current player\nThey have rolled a 2\nPat's new location is 0\nThe category is Pop\nPop Question 7\nAnswer was corrent!!!!\nPat now has 6 Gold Coins.\nSue is the current player\nThey have rolled a 2\nSue's new location is 0\nThe category is Pop\nPop Question 8\nAnswer was corrent!!!!\nSue now has 6 Gold Coins.";
}
