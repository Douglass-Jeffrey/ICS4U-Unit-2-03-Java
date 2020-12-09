/*
* This program pushes a user input to a program with a class containing an 
* arraylist. The most recent input of the arraylist is then pushed back from
* that class into this program and is outputted, mimicking how the stack works.
* an input is now popped from the stack and returned to the user.
* Now it is impervious to any type of error
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-12-07
*/

// Import the Scanner class
import java.util.Scanner;

public class StackInput {

  /**
  * This program recieves input and adds values onto our pseudo-stack.
  */

  public static void main(String[] args) {

    // create scanner object
    Scanner userInput = new Scanner(System.in);

    // references MrCoxallStack file 
    MrCoxallStack clasStack = new MrCoxallStack();

    // ensures that user inputs only integer values
    try {
      System.out.println("Enter the amount of integers you wish to push: ");
      int stackNum = userInput.nextInt();
      
      // checks if inputs are valid
      if (stackNum < 1) {
        System.out.println("Invalid Input. Input only integers above 0");
      } else {
        for (int counter = 0; counter < stackNum; counter++) {
          // receive user input
          System.out.println("Enter an integer to push onto the stack ");
          int numberChosen = userInput.nextInt();
          System.out.println();

          // Pushes user input into arraylist in MrCoxallStack 
          clasStack.push(numberChosen);
        }

        // pops top number in stack
        System.out.println("Popped Num: " + clasStack.pop());
        // states current values located in stack
        System.out.println("Values in Stack: " + clasStack.currentStack());
      }
    } catch (Exception e) {
      System.out.println("Invalid Input");
    }
  }
}
