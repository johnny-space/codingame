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
        int N = in.nextInt(); // Number of elements which make up the association table.
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        HashMap<String, String> tableMap = new HashMap<String, String>(); 
        
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            EXT = EXT.toLowerCase( );
            tableMap.put(EXT,MT);
            //System.err.println(tableMap);
        }
        
        //System.err.println("##################");

        in.nextLine();
        
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            FNAME = FNAME.toLowerCase();
            //System.err.println("FNAME " + FNAME);
            
            int p=FNAME.lastIndexOf(".");
            String e=FNAME.substring(p+1);
            
            
            if( p==-1 || !e.matches("\\w+") ){
                System.out.println("UNKNOWN");
            } else {
                if (tableMap.get(e) != null) {
                    System.out.println(tableMap.get(e)); 
                } else {
                    System.out.println("UNKNOWN");
                }
            }
        }   
    }
}
