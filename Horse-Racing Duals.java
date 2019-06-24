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
        int N = in.nextInt();
        List<Integer> horseList = new ArrayList<>();
        List<Integer> horseDiffList = new ArrayList<>();
        int diff = 0;
        int minDiffIndex = 0;


        for (int i = 0; i < N; i++) {
            int pi = in.nextInt();
            horseList.add(pi);
        }
        
        Collections.sort(horseList,Collections.reverseOrder());
        //System.err.println(horseList);
        
        for (int k = 0; k < N-1; k++) {
            diff = horseList.get(k)-horseList.get(k+1);
            horseDiffList.add(diff);
        }
        
        //System.err.println(horseDiffList);

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        minDiffIndex = horseDiffList.indexOf(Collections.min(horseDiffList));
        System.out.println(horseDiffList.get(minDiffIndex));
    }
}
