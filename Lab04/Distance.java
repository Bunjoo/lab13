/**
 * 
 */
package Lab04;
import java.util.Scanner;
/**
 * @author Amanda X
 *
 */
public class Distance {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        //Variables
        double x1,x2,y1,y2;
        double distance;
        
        //User input
        System.out.println("Enter the coordinates of the first point (put a space between them.)" );
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        
        System.out.println("Enter the coordinates of the second point.");
        x2= scan.nextDouble();
        y2= scan.nextDouble();
        
        //compute
        distance = Math.sqrt(Math.pow(x1-x2,2)+ Math.pow(y1-y2,2));
        
        //Print
        System.out.println();
        System.out.println("The distance between point A and point B is: " + distance);
    }

}
