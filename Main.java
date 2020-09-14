 import java.util.Scanner;

/**
 *this number will divide two numbers and will give you a remainder
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create the scanner for user input 
    Scanner input = new Scanner(System.in); 


    //ask user for both numbers 
    System.out.println("Please enter your first number, this will be what you want divided"); 

   int firstNumber = input.nextInt(); 

    System.out.println("please enter your second number, this is what you are going to divide by");
    
   int secondNumber = input.nextInt();

   final int PRODUCT = firstNumber / secondNumber;
   
   final int REMAINDER = firstNumber % secondNumber; 

   int productFinal = PRODUCT;
   int remainderFinal = REMAINDER;
   
   System.out.println(" your final product is " + productFinal + " with a remainder of " + remainderFinal );


  }
}
