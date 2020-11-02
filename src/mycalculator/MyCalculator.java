
package mycalculator;
import java.util.Scanner;
public class MyCalculator {

   
    public static void main(String[] args) {
      
        Scanner s = new Scanner(System.in);
        
        System.out.print("Input the first number: ");
        int num1 = s.nextInt();
        
        System.out.print("Input the second number: ");
        int num2 = s.nextInt();
       
        
        System.out.print("The sum is: "+ (num1+num2));
        System.out.println("");
    }
    
}
