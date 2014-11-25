/**
 * 
 */
package Lab04;
import java.util.Scanner;
import java.util.*;
/**
 * @author Amanda X
 *
 */
public class IntWrapper {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input an integer: ");
        
        //variables
        Integer userInput = scan.nextInt();
        
        String binary, octal, hex, dec1, dec2;
        Integer max, min, intDec1, intDec2,sum ;
        
        // changing userInput into binary, octal, and hex
        binary = Integer.toBinaryString(userInput);
        octal = Integer.toOctalString(userInput);
        hex = Integer.toHexString(userInput);
        
        //printing out
        System.out.println("Binary: "+ binary);
        System.out.println("Octal: "+ octal);
        System.out.println("Hex: " + hex);
        
        // find out max and min possible java values
        max = Integer.MAX_VALUE;
        min = Integer.MIN_VALUE;
        
        //printing
        System.out.println("Integer Max Value: " + max);
        System.out.println("Integer Min Value: " + min);
        
        //taking in two integers as strings, converting them to ints
        System.out.print("Enter two decimal integers (space inbetween): ");
        dec1 = scan.next();
        dec2 = scan.next();
        intDec1 = Integer.parseInt(dec1);
        intDec2 = Integer.parseInt(dec2);
        sum = intDec1 + intDec2;
        
        // printing out 
        
        System.out.println("Two decimals added together:" + sum);
        
       
        
    }

}
