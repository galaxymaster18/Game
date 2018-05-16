package com.myfirstgame;

import java.util.Random;
import java.util.Scanner;

public class Bot extends Thread {
  static byte i1 = 0, i2 = 0, i3 = 0, i11 = 0;
static Random r = new Random();
static Scanner sc = new Scanner(System.in);
  public void run() {
    
    int x = r.nextInt(3);
    switch (x) {
      case 1:
        ++i1;
        break;
      case 2:
        ++i2;
        break;
      case 3:
        ++i3;
        break;
     }
  }
  public static void ans(){
    while (i11 == 0) {
      switch (Game.i10) {
        case 1:
          Game.answr = i1;
          --i11;
        break;
        case 2:
          Game.answr = i2;
          --i11;
        break;
        case 3:
          Game.answr = i3;
          --i11;
        break;
        default:
          System.out.print("Input 1, 2 or 3\n");
          Game.i10 = sc.nextByte();
      }
    }
  }
  public static void star(){
    Game.i10 = r.nextInt(2);
    while (Game.i10 >= 0) {
      if (Game.i10 == 0 && Bot.i1 == 0 && Game.answr != Bot.i1) {
        System.out.print("1\n");
        Game.i10 -= 5;
      } else if (Game.i10 == 1 && Bot.i2 == 0 && Game.answr != Bot.i2) {
          System.out.print("2\n");
          Game.i10 -= 5;
      } else if (Game.i10 == 2 && Bot.i3 == 0 && Game.answr != Bot.i3) {
          System.out.print("3\n");
          Game.i10 -= 5;
      }
    }
  }
}
