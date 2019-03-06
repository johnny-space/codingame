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
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();
        
        //splits the T (=Text to solve) in single signs
        String[] singleSign = T.split("");

        // ht = Map to take the hole alphabet in the ASCII representation provided by ROW
        Map<Integer, String> ht = new HashMap<Integer, String>();
        String s;
        
        int key = 0; //Key in ht
        
        //Position (key) of every Letter in Hashmap ht in first Row (H=1)
        int positionLetterA = 0;
        int positionLetterB = 1;
        int positionLetterC = 2;
        int positionLetterD = 3;
        int positionLetterE = 4;
        int positionLetterF = 5;
        int positionLetterG = 6;
        int positionLetterH = 7;
        int positionLetterI = 8;
        int positionLetterJ = 9;
        int positionLetterK = 10;
        int positionLetterL = 11;
        int positionLetterM = 12;
        int positionLetterN = 13;
        int positionLetterO = 14;
        int positionLetterP = 15;
        int positionLetterQ = 16;
        int positionLetterR = 17;
        int positionLetterS = 18;
        int positionLetterT = 19;
        int positionLetterU = 20;
        int positionLetterV = 21;
        int positionLetterW = 22;
        int positionLetterX = 23;
        int positionLetterY = 24;
        int positionLetterZ = 25;
        int positionLetterQuestionmark = 26;
        
        List<String> solveList = new ArrayList<>(); //List to take the solution string

        
        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            String[] splitAfterLChars = ROW.split(ROW.format("(?<=\\G.{%1$d})", L));//Regex splits every L signs
            
            int keyMax = (i + 1) * 27; //every run of splitAfterLChars produces an array with 27 elements (A-Z+?)
            int valueInArrayPosition = 0; //key must moutn from 0 to H*27, valueInArrayPosition always from 0-26
            
            while (key < keyMax)  {
                ht.put(key, splitAfterLChars[valueInArrayPosition]);
                key += 1;
                valueInArrayPosition +=1;
            }
            
            for(int j = 0; j < singleSign.length; j++) {
                
                switch (singleSign[j]) {
                
                    case "A":
                        s = ht.get(positionLetterA + (i*27));
                        solveList.add(s);
                        break;
                    case "B":
                        s = ht.get(positionLetterB + (i*27));
                        solveList.add(s);
                        break;
                    case "C":
                        s = ht.get(positionLetterC + (i*27));
                        solveList.add(s);
                        break;
                    case "D":
                        s = ht.get(positionLetterD + (i*27));
                        solveList.add(s);
                        break;
                    case "E":
                        s = ht.get(positionLetterE + (i*27));
                        solveList.add(s);
                        break;
                    case "F":
                        s = ht.get(positionLetterF + (i*27));
                        solveList.add(s);
                        break;
                    case "G":
                        s = ht.get(positionLetterG + (i*27));
                        solveList.add(s);
                        break;
                    case "H":
                        s = ht.get(positionLetterH + (i*27));
                        solveList.add(s);
                        break;
                    case "I":
                        s = ht.get(positionLetterI + (i*27));
                        solveList.add(s);
                        break;
                    case "J":
                        s = ht.get(positionLetterJ + (i*27));
                        solveList.add(s);
                        break;
                    case "K":
                        s = ht.get(positionLetterK + (i*27));
                        solveList.add(s);
                        break;
                    case "L":
                        s = ht.get(positionLetterL + (i*27));
                        solveList.add(s);
                        break;
                    case "M":
                        s = ht.get(positionLetterM + (i*27));
                        solveList.add(s);
                        break;
                    case "N":
                        s = ht.get(positionLetterN + (i*27));
                        solveList.add(s);
                        break;
                    case "O":
                        s = ht.get(positionLetterO + (i*27));
                        solveList.add(s);
                        break;
                    case "P":
                        s = ht.get(positionLetterP + (i*27));
                        solveList.add(s);
                        break;
                    case "Q":
                        s = ht.get(positionLetterQ + (i*27));
                        solveList.add(s);
                        break;
                    case "R":
                        s = ht.get(positionLetterR + (i*27));
                        solveList.add(s);
                        break;
                    case "S":
                        s = ht.get(positionLetterS + (i*27));
                        solveList.add(s);
                        break;
                    case "T":
                        s = ht.get(positionLetterT + (i*27));
                        solveList.add(s);
                        break;
                    case "U":
                        s = ht.get(positionLetterU + (i*27));
                        solveList.add(s);
                        break;
                    case "V":
                        s = ht.get(positionLetterV + (i*27));
                        solveList.add(s);
                        break;
                    case "W":
                        s = ht.get(positionLetterW + (i*27));
                        solveList.add(s);
                        break;
                    case "X":
                        s = ht.get(positionLetterX + (i*27));
                        solveList.add(s);
                        break;
                    case "Y":
                        s = ht.get(positionLetterY + (i*27));
                        solveList.add(s);
                        break;
                    case "Z":
                        s = ht.get(positionLetterZ + (i*27));
                        solveList.add(s);
                        break;
                    case "?":
                        s = ht.get(positionLetterQuestionmark + (i*27));
                        solveList.add(s);
                        break;
                    case "@":
                        s = ht.get(positionLetterQuestionmark + (i*27));
                        solveList.add(s);
                        break;
                    case " ":
                        s = ht.get(positionLetterQuestionmark + (i*27));
                        solveList.add(s);
                        break;
                    case "!":
                        s = ht.get(positionLetterQuestionmark + (i*27));
                        solveList.add(s);
                        break;
                    case ",":
                        s = ht.get(positionLetterQuestionmark + (i*27));
                        solveList.add(s);
                        break;
                    case ".":
                        s = ht.get(positionLetterQuestionmark + (i*27));
                        solveList.add(s);
                        break;
                    case "a":
                        s = ht.get(positionLetterA + (i*27));
                        solveList.add(s);
                        break;
                    case "b":
                        s = ht.get(positionLetterB + (i*27));
                        solveList.add(s);
                        break;
                    case "c":
                        s = ht.get(positionLetterC + (i*27));
                        solveList.add(s);
                        break;
                    case "d":
                        s = ht.get(positionLetterD + (i*27));
                        solveList.add(s);
                        break;
                    case "e":
                        s = ht.get(positionLetterE + (i*27));
                        solveList.add(s);
                        break;
                    case "f":
                        s = ht.get(positionLetterF + (i*27));
                        solveList.add(s);
                        break;
                    case "g":
                        s = ht.get(positionLetterG + (i*27));
                        solveList.add(s);
                        break;
                    case "h":
                        s = ht.get(positionLetterH + (i*27));
                        solveList.add(s);
                        break;
                    case "i":
                        s = ht.get(positionLetterI + (i*27));
                        solveList.add(s);
                        break;
                    case "j":
                        s = ht.get(positionLetterJ + (i*27));
                        solveList.add(s);
                        break;
                    case "k":
                        s = ht.get(positionLetterK + (i*27));
                        solveList.add(s);
                        break;
                    case "l":
                        s = ht.get(positionLetterL + (i*27));
                        solveList.add(s);
                        break;
                    case "m":
                        s = ht.get(positionLetterM + (i*27));
                        solveList.add(s);
                        break;
                    case "n":
                        s = ht.get(positionLetterN + (i*27));
                        solveList.add(s);
                        break;
                    case "o":
                        s = ht.get(positionLetterO + (i*27));
                        solveList.add(s);
                        break;
                    case "p":
                        s = ht.get(positionLetterP + (i*27));
                        solveList.add(s);
                        break;
                    case "q":
                        s = ht.get(positionLetterQ + (i*27));
                        solveList.add(s);
                        break;
                    case "r":
                        s = ht.get(positionLetterR + (i*27));
                        solveList.add(s);
                        break;
                    case "s":
                        s = ht.get(positionLetterS + (i*27));
                        solveList.add(s);
                        break;
                    case "t":
                        s = ht.get(positionLetterT + (i*27));
                        solveList.add(s);
                        break;
                    case "u":
                        s = ht.get(positionLetterU + (i*27));
                        solveList.add(s);
                        break;
                    case "v":
                        s = ht.get(positionLetterV + (i*27));
                        solveList.add(s);
                        break;
                    case "w":
                        s = ht.get(positionLetterW + (i*27));
                        solveList.add(s);
                        break;
                    case "x":
                        s = ht.get(positionLetterX + (i*27));
                        solveList.add(s);
                        break;
                    case "y":
                        s = ht.get(positionLetterY + (i*27));
                        solveList.add(s);
                        break;
                    case "z":
                        s = ht.get(positionLetterZ + (i*27));
                        solveList.add(s);
                        break;
                }
            }
            solveList.add(System.getProperty("line.separator")); //End of H line
            
        }
        //finaly the sulution!
        int length = solveList.size();
        for(int k = 0; k < length; k++) {
            String s1 = solveList.get(k);
            System.out.print(s1);
        }
    }
}
