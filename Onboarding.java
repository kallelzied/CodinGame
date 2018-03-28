import java.util.*;
import java.io.*;
import java.math.*;

class Onboarding {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2

            String target_enemy = "";
            if (dist1 <= dist2)
                target_enemy= enemy1;
            else
                target_enemy = enemy2;
            // You have to output a correct ship name to shoot ("Buzz", enemy1, enemy2, ...)
            System.out.println(target_enemy);

        }
    }
}