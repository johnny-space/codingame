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
        int W = in.nextInt();
        int H = in.nextInt();
        List<String> list = new ArrayList<String>();

        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < H; i++) {
            String line = in.nextLine();
            String str[] = line.split("");
            Collections.addAll(list, str);
        }

        for (int j = 0; j < W; j+=3){
            int shift = j + W;
            String start = "";
            
            for (int i = 0; i < H-2; i++) {
                if (i == 0) {
                    start = list.get(j);
                }
                boolean right = shift < W*H-1 && list.get(shift+1).contains("-");
                boolean left = shift >= 1 && list.get(shift-1).contains("-");
                
                if (right == true) {
                    shift += 3; 
                }
                else if (left == true) {
                    shift -= 3; 
                }
                shift += W;
            }
            System.out.println(start + list.get(shift));
        }
    }
}
