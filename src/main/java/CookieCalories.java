
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
public class CookieCalories {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the number of cookies eaten");
        
        int cookies = keyboard.nextInt();
        
        int calories = cookies * 75;
        
        System.out.println("The total amount of calories consumed is " + calories);
        
    }
}
