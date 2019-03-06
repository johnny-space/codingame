import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTX = in.nextInt(); // Thor's starting X position
        int initialTY = in.nextInt(); // Thor's starting Y position

        int thorX = initialTX;
        int thorY = initialTY;
        
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            String directionX = "";
            String directionY = "";

            // drunter      
            if (thorY > lightY) {
                directionY = "N";
                thorY = thorY -1;    
            }
            
             // drüber      
            else if (thorY < lightY) {
                directionY = "S";
                thorY = thorY +1;  
            }            
            
            // rechts      
            if (thorX > lightX) {
                directionX = "W";
                thorX = thorX -1;    
            }            
            
            // links      
            else if (thorX < lightX) {
                directionX = "E";
                thorX = thorX +1;      
            }
            
            System.out.println(directionY + directionX);
            
            
            // Write an action using System.out.println()
            System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}
