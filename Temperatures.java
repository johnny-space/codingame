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
        int n = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String temps = in.nextLine(); // the n temperatures expressed as integers ranging from -273 to 5526
        
        // initial test if you get any temps values at all (testcase 6)
        if (temps == null || temps.isEmpty()) {
            System.out.println("0");
         
        // if you get initial temps values, run program (testcase 1-5)  
        } else if (temps != null || !temps.isEmpty()) {
            
            // String gets splitted by separator blank and stored in an array
            String[]  arrayString = temps.split(" ");
            
            // declatation and initiation of new integer array
            int[] arrayNumbers = new int[arrayString.length]; 
            
            // variables to be used in for loop
            int minValuePos = 5527; // see comment after String temps = in.nextLine();
            int minValueNeg = -273; // see comment after String temps = in.nextLine();
            int minValueTot = 5526;
            
            for(int i = 0;i < arrayString.length;i++)
            {
                // Strings werden in int umgewandelt
                arrayNumbers[i] = Integer.parseInt(arrayString[i]);
                
                // positive values               
                if (arrayNumbers[i] > 0 && arrayNumbers[i] < minValuePos) {
                    minValuePos = arrayNumbers[i];
                // negative values
                } else if (arrayNumbers[i] < 0 && arrayNumbers[i] > minValueNeg) {
                    minValueNeg = arrayNumbers[i];
                }
            }
            
            // positive or negativ value closer to 0?
            if ((0 - minValuePos) >= (0 - minValueNeg * (-1)) && minValuePos != 5526) {
                minValueTot = minValuePos;
            } else if ((0 - minValuePos) < (0 - minValueNeg * (-1)) && minValuePos != 5526) {
                minValueTot = minValueNeg;
            }
            System.out.println(minValueTot);
        }
    }
}
