import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse the standard input
 * according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int l = 0; // left
        int r = W - 1; // right
        int t = 0; //top
        int b = H - 1; // bottom
        int Xmid = X0;
        int Ymid = Y0;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D,
                                        // DL, L or UL)

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.err.println("bombDir " + bombDir);
            System.err.println("l " + l);
            System.err.println("r " + r);
            System.err.println("t " + t);
            System.err.println("b " + b);

            switch (bombDir) {
                case "U":
                    b = Ymid - 1;
                    break;
                case "UR":
                    l = Xmid + 1;
                    b = Ymid - 1;
                    break;
                case "R":
                    l = Xmid + 1;
                    break;
                case "DR":
                    l = Xmid + 1;
                    t = Ymid + 1;                    
                    break;
                case "D":
                    t = Ymid + 1;
                    break;
                case "DL":
                    r = Xmid - 1;
                    t = Ymid + 1;
                    break;
                case "L":
                    r = Xmid - 1;
                    break;
                case "UL":
                    r = Xmid - 1;
                    b = Ymid - 1;
                    break;
            }

            Ymid = (t + b) / 2;
            Xmid = (l + r) / 2;

            // the location of the next window Batman should jump to.
            System.out.println( Xmid + " " +  Ymid);
        }
    }
}
