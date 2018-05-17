package com.myfirstgame;

import java.util.Scanner;
import java.util.Random;

public class Game {
  static Scanner sc = new Scanner(System.in);
  static Random r = new Random();
  static byte a = 0, b = 0, c = 0, d = 0, e = 0;
  static int x = 0;
  static String i = "";

  public static void main(String[] args) {
    LOOP:
    while (true) {
      x = r.nextInt(2);
      switch (x) {
        case 0:
          ++a;
          break;
        case 1:
          ++b;
          break;
        case 2:
          ++c;
          break;
      }
      ans();
      System.out.print("Do you wanna know wrong one?\nyes/no\n");
      LOOP1:
      do {
        i = sc.next();
        switch (i) {
          case "yes":
            if (a == 0 && e != 1) {
              System.out.print("1 is wrong\n");
            } else if (b == 0 && e != 2) {
              System.out.print("2 is wrong\n");
            } else if (c == 0 && e != 3) {
              System.out.print("3 is wrong\n");
            }
            break LOOP1;
          case "no":
            break LOOP1;
          default:
            System.out.print("yes/no\n");
            break;
        }
      } while (true);
      System.out.print("Do you wanna change your choice?\nyes/no\n");
      LOOP2:
      do {
        i = sc.next();
        switch (i) {
          case "yes":
            System.out.print("What's your new choice?\n");
            ans();
          case "no":
            break LOOP2;
          default:
            System.out.print("yes/no\n");
        }
      } while (true);
      if (d == 1) {
        System.out.print("You win!\n");
      } else {
        System.out.print("You lose.\n");
      }
      System.out.print("Do you wanna replay?\nyes/no\n");
      LOOP3:
      do {
        i = sc.next();
        switch (i) {
          case "yes":
            break LOOP3;
          case "no":
            System.out.print("Thanks for playing!");
            break LOOP;
          default:
            System.out.print("yes/no\n");
            break;
        }
      } while (true);
    }
  }

  public static void ans() {
    LOOP4:
    do {
      System.out.print("Input 1, 2 or 3\n");
      e = sc.nextByte();
      switch (e) {
        case 1:
          d = a;
          break LOOP4;
        case 2:
          d = b;
          break LOOP4;
        case 3:
          d = c;
          break LOOP4;
      }
    } while (true);
  }
}
