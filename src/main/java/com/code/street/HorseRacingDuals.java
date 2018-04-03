package com.code.street;

import java.util.*;
import java.io.*;
import java.math.*;


class HorseRacingDuals {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> power = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            power.add(pi);
        }

        Collections.sort(power);
        int D = 0;
        boolean first = true;
        for(int j = 1; j < N; j++)
        {
            if(first)
            {
                D = power.get(j) - power.get(j-1);
                first = false;
            }
            else
            {
                int diff = power.get(j) - power.get(j-1);
                D = D < diff ? D : diff;
            }
        }
        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(D);
    }
}
