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
        String MESSAGE = in.nextLine();
        System.err.println("MESSAGE= "+MESSAGE);
        String binary = "";
        StringBuilder binaryConcatenated = new StringBuilder();
        
        //to bytes
        byte[] bytes = MESSAGE.getBytes();
        System.err.println("bytes= "+Arrays.toString(bytes));
        
        //to binary
        for (int i = 0; i < bytes.length; i++) {
            binary = String.format("%7s", Integer.toBinaryString(bytes[i] & 0xFF)).replaceAll(" ","0");
            binaryConcatenated.append(binary);
        }
        System.err.println("binaryConcatenated= "+binaryConcatenated);
        
        //to blocks
        String[] blocks = binaryConcatenated.toString().split("(?<=(.))(?!\\1)");
        System.err.println("blocks= "+Arrays.toString(blocks));
        
        //to unary
        for (int j = 0; j < blocks.length; j++) {
            if (blocks[j].contains("1") == true) {
                System.out.print("0");
                System.out.print(" ");
                System.out.print("0".repeat(blocks[j].length()));
                if (j < blocks.length-1) { //to avoid trailing " "
                    System.out.print(" ");
                }
            } else {
                System.out.print("00");
                System.out.print(" ");
                System.out.print("0".repeat(blocks[j].length()));
                if (j < blocks.length-1) { //to avoid trailing " "
                    System.out.print(" ");
                }
            }
        }
    }
}
