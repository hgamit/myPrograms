package hackerRank;

import java.util.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        double tipPercent = scan.nextInt(); // tip percentage
        double taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Write your calculation code here.
        
        double tip = (mealCost * (tipPercent/100));
        double tax = (mealCost * (taxPercent/100));
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(mealCost+tip+tax);
      
        System.out.print("The total meal cost is "+totalCost+" dollars.");
        // Print your result
    }
}