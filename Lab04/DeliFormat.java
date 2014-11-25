/**
 * 
 */
package Lab04;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;
/**
 * @author Amanda X
 *
 */
public class DeliFormat {
    public static void main(String[] args){
        final double OUNCES_PER_POUND = 16.0;
        
        double pricePerPound;
        double weightOunces;
        double weight;
        double totalPrice;
        
        Scanner scan = new Scanner(System.in);
        
        NumberFormat money = NumberFormat.getCurrencyInstance();
        
        DecimalFormat fmt = new DecimalFormat("#.##");
        
        System.out.println("Welcome to CS Deli! ! \n ");
        System.out.print("Enter the price per pound of your item: ");
        pricePerPound = scan.nextDouble();
        
        System.out.print("Enter the weight(ounces)");
        weightOunces = scan.nextDouble();
        
        //convert ounces to pounds / compute total
        weight = weightOunces / OUNCES_PER_POUND;
        totalPrice = pricePerPound * weight;
        
        System.out.println("***** CSDeli *****");
        System.out.println();
        System.out.println("Unit Price: " + money.format(pricePerPound));
        System.out.println("Weight: " + fmt.format(weight) + " pounds");
        System.out.println();
        System.out.println("Total: " + money.format(totalPrice));
    }

}
