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
      if (YN()) {
        System.out.print((wrng() + 1) + " is wrong.\nDo you wanna change your choice?\n");
        if (YN()) {
          System.out.print("What's your new choice?\n");
          a[4] = ans();
        }
      }
      System.out.print("You " + ((a[4] == 1) ? "win!" : "lose.") + "\nDo you wanna replay?\n");
      if (!YN()) System.exit(0);
    }
  }

  public static boolean YN() {
    System.out.print("yes/no\n");
    switch (sc.next()) {
      case "yes":
        return true;
      case "no":
        return false;
      default:
        return YN();
    }
  }

  public static byte ans() {
    System.out.print("Input 1, 2 or 3\n");
    switch (a[3] = sc.nextByte()) {
      case 1:
      case 2:
      case 3:
        return a[a[3] - 1];
      default:
        return ans();
    }
  }

  public static byte wrng() {
    byte k = (byte) r.nextInt(3);
    if (a[k] == 0 && a[3] != k + 1) return k;
    else return wrng();
  }
}
