import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long r1 = in .nextLong();
        long r2 = in .nextLong();
        long c1 = 0;
        long a1 = 0;
        long c2 = 0;
        long a2 = 0;

        while (r1 != r2) {
            while (r1 < r2) {
                c1 = r1;
                while (c1 > 0) {
                    a1 = c1 % 10;
                    r1 = r1 + a1;
                    c1 = c1 / 10;
                }
            }
            if (r1 == r2) {
                System.out.println(r1);
                return;
            }
            while (r2 < r1) {
                c2 = r2;
                while (c2 > 0) {
                    a2 = c2 % 10;
                    r2 = r2 + a2;
                    c2 = c2 / 10;
                }
            }
            if (r1 == r2) {
                System.out.println(r1);
                return;
            }
        }
    }
}
