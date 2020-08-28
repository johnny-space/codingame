import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> result = new ArrayList<>();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String line = in.nextLine();
            if (line.contains("L") || line.contains("R")) { //path-case
                line.split("");
                long leftP = 0;
                long leftQ = 1;
                long midP = 1;
                long midQ = 1;
                long rightP = 1;
                long rightQ = 0;
                for (int j = 0; j < line.length(); j++) {
                    if (line.charAt(j) == 'L') {
                        rightP = midP;
                        rightQ = midQ;
                        midP = (leftP + midP);
                        midQ = (leftQ + midQ);
                    } else if (line.charAt(j) == 'R') {
                        leftP = midP;
                        leftQ = midQ;
                        midP = (rightP + midP);
                        midQ = (rightQ + midQ);
                    }
                }
                result.add(midP + "/" + midQ);
            } else { //number-case
                String[] parts = line.split("/");
                double leftP = 0;
                double leftQ = 1;
                double midP = 1;
                double midQ = 1;
                double rightP = 1;
                double rightQ = 0;
                double endP = Integer.parseInt(parts[0]);
                double endQ = Integer.parseInt(parts[1]);
                boolean foundIt = false;
                String direction = "";
                while (foundIt == false) {
                    if (leftP / leftQ < endP / endQ && endP / endQ < midP / midQ) {
                        rightP = midP;
                        rightQ = midQ;
                        midP = (leftP + midP);
                        midQ = (leftQ + midQ);
                        direction = direction + "L";
                    } else if (midP / midQ < endP / endQ && endP / endQ < rightP / rightQ) {
                        leftP = midP;
                        leftQ = midQ;
                        midP = (rightP + midP);
                        midQ = (rightQ + midQ);
                        direction = direction + "R";
                    } else {
                        foundIt = true;
                    }
                }
                result.add(direction);
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
