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
        int N = in .nextInt();
        List < String > invalid = new ArrayList < String > ();

        if ( in .hasNextLine()) { in .nextLine();
        }
        for (int i = 0; i < N; i++) {
            String ISBN = in .nextLine();
            int length = String.valueOf(ISBN).length();
            
            switch (length) {
                case 10:
                    int modISBN10 = 11;
                    int productISBN10 = 0;
                    int startMult = 10;
                    int intSingleChar = 0;
                    for (int j = 0; j < 9; j++) {
                        String singleChar = ISBN.substring(j, j + 1);
                        try {
                            intSingleChar = Integer.parseInt(singleChar);
                        } catch (Exception e) {
                            break;
                        }
                        productISBN10 = productISBN10 + intSingleChar * (startMult);
                        startMult -= 1;
                    }
                    int remainder = 0;
                    remainder = modISBN10 - (productISBN10 % modISBN10);
                    String lastChar = ISBN.substring(9, 10);
                    try {
                        int intLastChar = Integer.parseInt(lastChar);
                        boolean valid = (remainder == intLastChar);
                        if (valid == false && remainder != modISBN10) {
                            Collections.addAll(invalid, ISBN);
                        }
                    } catch (Exception e) {
                        if (remainder != 10) {
                            Collections.addAll(invalid, ISBN);
                        }
                        break;
                    }
                    break;
                case 13:
                    int modISBN13 = 10;
                    int productISBN13 = 0;
                    int k = 1;
                    int intSingleChar13 = 0;
                    for (int j = 0; j < 11; j += 2) {
                        String singleChar = ISBN.substring(j, j + 1);
                        try {
                            intSingleChar13 = Integer.parseInt(singleChar);
                        } catch (Exception e) {
                            break;
                        }
                        productISBN13 = productISBN13 + intSingleChar13 * (1);
                        singleChar = ISBN.substring(k, k + 1);
                        try {
                            intSingleChar13 = Integer.parseInt(singleChar);
                        } catch (Exception e) {
                            break;
                        }
                        productISBN13 = productISBN13 + intSingleChar13 * (3);
                        k += 2;
                    }
                    int remainder13 = 0;
                    remainder13 = modISBN13 - (productISBN13 % modISBN13);
                    String lastChar13 = ISBN.substring(12, 13);
                    try {
                        int intLastChar13 = Integer.parseInt(lastChar13);
                        boolean valid13 = (remainder13 == intLastChar13);
                        if (valid13 == false && remainder13 != modISBN13) {
                            Collections.addAll(invalid, ISBN);
                        }
                    } catch (Exception e) {
                        Collections.addAll(invalid, ISBN);
                        break;
                    }
                    break;
                default:
                    Collections.addAll(invalid, ISBN);
                    break;
            }
        }
        System.out.println(invalid.size() + " invalid:");
        for (int i = 0; i < invalid.size(); i++) {
            System.out.println(invalid.get(i));
        }
    }
}
