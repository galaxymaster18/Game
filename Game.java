package com.myfirstgame;

import java.util.Scanner;
import java.util.Random;

public class Game {
  static byte j = 0, k = 0, m = 0, n = 0, i12 = 0;
  static int answr = 0, ii = 0;
  static String i9 = "";

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rn = new Random();
    Bot x = new Bot();
    LOOP:
    while (true) {

      x.start();

      Bot.ans();
      ii = Bot.i10;

      System.out.print("Do you wanna know wrong one?\n");
      LOOP1:
      do {
        switch (i9) {
          case "yes":
            Bot.star();
            break LOOP1;
          case "no":
            break LOOP1;
          default:
            System.out.print("yes/no\n");
            i9 = sc.next();
            break;
        }
      } while (true);
      System.out.print("Do you wanna change your choice?\nyes/no\n");
      LOOP2:
      do {
        i9 = sc.next();
        switch (i9) {
          case "yes":
            System.out.print("What's your new choice?\n");
            Bot.ans();
          case "no":
            break LOOP2;
          default:
            System.out.print("yes/no\n");
        }
      } while (true);

      if (answr == 1) {
        System.out.print("You win!\n");
        --j;
      } else {
        System.out.print("You lose.\n");
        --j;
      }
      System.out.print("Do you wanna replay?\nyes/no\n");
      while (m == 0) {

        i9 = sc.next();
        switch (i9) {
          case "yes":
            --m;
            break;
          case "no":
            --m;
            System.out.print("Thanks for playing!");
            break LOOP;
          default:
            System.out.print("yes/no\n");
            break;
        }
      }
    }
  }
}
