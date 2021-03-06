package com.adaptionsoft.games.trivia;

import com.adaptionsoft.games.uglytrivia.Game;

import java.util.Random;

public class OurGameRunner {

    private static boolean notAWinner;


    public void gameRunner(int seed){
        Game aGame = new Game();

        aGame.add("Chet");
        aGame.add("Pat");
        aGame.add("Sue");

        Random rand = new Random(seed);

        do {

            aGame.roll(rand.nextInt(5) + 1);

            if (rand.nextInt(9) == 7) {
                notAWinner = aGame.wrongAnswer();
            } else {
                notAWinner = aGame.wasCorrectlyAnswered();
            }



        } while (notAWinner);

    }
    }

