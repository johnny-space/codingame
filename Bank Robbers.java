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
        int R = in.nextInt();
        int V = in.nextInt();
        double combNumbers = 0;
        double combVowels = 0;
        double combOneVault = 0;
        double combTotal = 0;
        double solution = 0;
        List<Double> RList = new ArrayList<>();
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 0; i < V; i++) {
            int C = in.nextInt();
            int N = in.nextInt();
            combNumbers = Math.pow(10, N);
            combVowels = Math.pow(5, (C-N));
            combOneVault = combNumbers * combVowels;
            System.err.println(combOneVault);
            
            if (i < R) {
                RList.add(combOneVault);
            } else {
               minIndex = RList.indexOf(Collections.min(RList));
               RList.set(minIndex, RList.get(minIndex) + combOneVault);
            }
        }
        maxIndex = RList.indexOf(Collections.max(RList));   
        solution = RList.get(maxIndex);
        System.out.printf("%.0f",solution);
    }
}
