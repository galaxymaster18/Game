package com.myfirstgame;

import java.util.Scanner;
import java.util.Random;

public class Game {
  static Scanner sc = new Scanner(System.in);
  static Random r = new Random();
  static byte a[] = new byte[5];
  static String i = "";

  public static void main(String[] args) {
    LOOP:
    while (true) {
      ++a[r.nextInt(2)];
      ans();
      System.out.print("Do you wanna know wrong one?\nyes/no\n");
      LOOP1:
      while (true) {
        i = sc.next();
        switch (i) {
          case "yes":
            if (a[0] == 0 && a[3] != 1) {
              System.out.print("1 is wrong\n");
            } else if (a[1] == 0 && a[3] != 2) {
              System.out.print("2 is wrong\n");
            } else if (a[2] == 0 && a[3] != 3) {
              System.out.print("3 is wrong\n");
            }
            break LOOP1;
          case "no":
            break LOOP1;
          default:
            System.out.print("yes/no\n");
            break;
        }
      };
      System.out.print("Do you wanna change your choice?\nyes/no\n");
      LOOP2:
      while (true) {
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
      };
      if (a[4] == 1) {
        System.out.print("You win!\n");
      } else {
        System.out.print("You lose.\n");
      }
      System.out.print("Do you wanna replay?\nyes/no\n");
      LOOP3:
      while (true){
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
      };
    }
  }

  public static void ans() {
    LOOP3:
    do {
      System.out.print("Input 1, 2 or 3\n");
      a[3] = sc.nextByte();
      switch (a[3]) {
        case 1:
          a[4] = a[0];
          break LOOP3;
        case 2:
          a[4] = a[1];
          break LOOP3;
        case 3:
          a[4] = a[2];
          break LOOP3;
      }
    } while (true);
  }
}
