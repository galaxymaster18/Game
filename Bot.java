package com.myfirstgame;

import java.util.Random;
import java.util.Scanner;

public class Bot extends Thread {
  static byte i1 = 0, i2 = 0, i3 = 0;
  static int i10 = 0;
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
    byte i11 = 0;
    while (i11 == 0) {
      System.out.print("Input 1, 2 or 3\n");
      i10 = sc.nextByte();
      switch (i10) {
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
          
      }
    }
  }
  public static void star(){
    
    i10 = r.nextInt(2);
    
      if (i10 == 0 && i1 == 0 && Game.ii != 1) {
        System.out.print("1\n");
        i10 -= 5;
      } else if (i10 == 1 && i2 == 0 && Game.ii != 2) {
          System.out.print("2\n");
          i10 -= 5;
      } else if (i10 == 2 && i3 == 0 && Game.ii != 3) {
          System.out.print("3\n");
          i10 -= 5;
      }
      else {
        System.out.print("error");
      }
    
  }
}
