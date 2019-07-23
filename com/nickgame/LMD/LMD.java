package com.nickgame.LMD;

import java.util.Random;
import java.util.Scanner;

class LMD {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random r = new Random();
    private static boolean[] a;
    private static int answer;

    public static void main(String[] args) {
        while (true) {
            a = new boolean[4];
            a[(byte) r.nextInt(3)] = true;
            ans();
            System.out.print("Do you wanna know wrong one? ");
            if (YN()) {
                System.out.print(
                        (wrong((byte) r.nextInt(2))) + " is wrong.\nDo you wanna change your choice? ");
                if (YN()) {
                    System.out.println("What's your new choice?");
                    ans();
                }
            }

            System.out.print("You " + ((a[3]) ? "win!" : "lose.") + "\nDo you wanna replay? ");
            if (!YN()) System.exit(0);
        }
    }

    private static boolean YN() {
        System.out.println("(Y/N)");
        switch (sc.next().toLowerCase()) {
            case "yes":
            case "y":
                return true;
            case "no":
            case "n":
                return false;
            default:
                return YN();
        }
    }

    private static boolean ans() {
        System.out.println("Input 1, 2 or 3");
        answer = sc.nextByte();
        if (answer == 1 || answer == 2 || answer == 3) return a[3] = a[--answer];
        else return ans();
    }

    private static byte wrong(byte k) {
        byte[] a1 = new byte[2];
        int cnt = 0;
        for (byte i = 0; i < 3; ++i) {
            if (!a[i]) {
                a1[cnt] = i;
                ++cnt;
            }
        }
        if (answer == a1[0]) return ++a1[1];
        else if (answer == a1[1]) return ++a1[0];
        else return ++a1[k];
    }
}