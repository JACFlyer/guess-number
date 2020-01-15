package edu.cnm.deepdive;

import java.util.Random;
import java.util.Scanner;


  private static Random random = new Random();
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    boolean playAgain;

    do {
      int secret;

      secret = 1 + random.nextInt(100);
      play(secret);
      System.out.println("Play again? (y/[n])");
      String playAgaininput;
      while (!input.hasNextLine()){
    //Do nothing while scanner buffer is empty
    }
      playAgaininput = input.nextLine().toLowerCase();
      playAgain = playAgaininput.length() > 0 && playAgaininput.charAt(0) == 'y';
    } while (playAgain);
    System.out.println("Game Over");
  }

  public static void play(int secret) {
    boolean correct;

    System.out.println("Type a number from 1 to 100.");
    do {
      int guess;

      guess = input.nextInt();
      if (guess == secret) {
        correct = true;
        System.out.println("Good job!  The secret number was " + secret);
      } else {
        correct = false;
        if (guess < secret) {
          System.out.println("Too low.  Guess a higher number.");
        } else {
          System.out.println("Too high.  Guess a lower number.");
        }
      }
    } while (!correct);
  }
}
