package com.myfirstgame;

import java.util.Scanner;
import java.util.Random;

public class Game {
  static Scanner sc = new Scanner(System.in);
  static Random r = new Random();
  static byte a[];
  static String i = "";

  public static void main(String[] args) {
    while (true) {

      a = new byte[5];
      ++a[(byte) r.nextInt(3)];
      a[4] = ans();
      System.out.print("Do you wanna know wrong one?\n");
      if (YN()) System.out.print((wrng() + 1) + " is wrong.\nDo you wanna change your choice?\n");
      if (YN()) {
        System.out.print("What's your new choice?\n");
        a[4] = ans();
      }
      System.out.print("You " + ((a[4] == 1) ? "win!" : "lose.") + "\nDo you wanna replay?\n");
      if (!YN()) {
        System.out.print("Thanks for playing!");
        break;
      }
    }
  }

  public static boolean YN() {
    while (true) {
      System.out.print("yes/no\n");
      switch (sc.next()) {
        case "yes":
          return true;
        case "no":
          return false;
      }
    }
  }

  public static byte ans() {
    while (true) {
      System.out.print("Input 1, 2 or 3\n");
      a[3] = sc.nextByte();
      return a[a[3] - 1];
    }
  }

  public static byte wrng() {
    while (true) {
      byte k = (byte) r.nextInt(3);
      if (a[k] == 0 && a[3] != k + 1) return k;
    }
  }
}
