
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukec
 */
public class SalesTax {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
                
                System.out.println("Please enter the amount of purchase");
                
                double purchasePrice = keyboard.nextDouble();
                
                double stateTax = purchasePrice * .04;
                
                double countyTax = purchasePrice * .02;
                
                double salesTax = stateTax + countyTax;
                
                double total = salesTax + purchasePrice; 
                
                    System.out.println("The amount of the purchase is " + purchasePrice);
                    
                    System.out.println("The state sales tax is " + stateTax);
                    
                    System.out.println("The county sales tax is " + countyTax);
                    
                    System.out.println("The total sales tax is " + salesTax);
                    
                    System.out.println("The total of the purchase with tax is " + total);
                
       
                        
                        
    }
}
