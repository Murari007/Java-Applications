package org.meicode.guessme;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Wonderland");
        System.out.println("May I have Your Name : ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        System.out.println("Shall we start the game ?");
        System.out.println("\t1. Yes");
        System.out.println("\t2. No");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer != 1)
        {
            System.out.println("Shall we start the game ?");
            System.out.println("\t1. Yes");
            System.out.println("\t2. No");
            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.println("Please Guess a Number : ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean haswon = false;
        boolean shouldFinish = false;

        while(!shouldFinish)
        {
            timesTried++;
            if(timesTried<5) {
                if (userInput == x) {
                    haswon = true;
                    shouldFinish = true;
                } else if (userInput > x) {
                    System.out.println("Guess Lower");
                    userInput = scanner.nextInt();
                } else {
                  System.out.println("Guess Higher");
                  userInput = scanner.nextInt();
              }
            }
            else
            {
               shouldFinish = true;
            }
        }

        if(haswon)
        {
            System.out.println("Congratulations! You Guessed in " + timesTried + " guesses");
        }else {
            System.out.println("Game Over!");
            System.out.println("The number was :" + x);
        }
    }
}
