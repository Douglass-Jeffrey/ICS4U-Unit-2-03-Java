/* 
* This class creates an arraylist that will recieve input from  class
*
* @author  Douglass Jeffrey
* @version 1.0
* @since   2020-12-07
*/

// Import the ArrayList class
import java.util.ArrayList;

public class MrCoxallStack {
    
  // Creates arraylist that will act as a stack
  private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();

  // Method for adding inputs to list
  public void push(int receivedNum) {
    stackAsArray.add(receivedNum);
  }

  /**
   * pop method to return top number on stack and remove it.
   */

  public int pop() {
    if (this.stackAsArray.size() == 0) {
      throw null;
    } else {
      int poppedNumber = this.stackAsArray.get(stackAsArray.size() - 1);
      stackAsArray.remove(stackAsArray.size() - 1);
      return poppedNumber;
    }
  }

  /**
   * Getter that tells the user all values in the stack.
   */

  public String currentStack() {
    String arrayVal = "Current ArrayList: ";
    for (int counter = 0; counter < stackAsArray.size(); counter++) {
      arrayVal = arrayVal + stackAsArray.get(counter) + ", ";
    }
    return arrayVal;
  }
}

