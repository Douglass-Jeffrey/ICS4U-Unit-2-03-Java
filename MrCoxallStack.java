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
  private ArrayList<Integer> _stackAsArray = new ArrayList<Integer>();

  // Method for adding inputs to list
  public void push(int receivedNum) {
    _stackAsArray.add(receivedNum);
  }

  /**
   * pop method to return top number on stack and remove it.
   */

  public int pop() {
    int poppedNumber = this._stackAsArray.get(_stackAsArray.size() - 1);
    _stackAsArray.remove(_stackAsArray.size() - 1);
    return poppedNumber;
  }

  /**
   * Getter that tells the user all values in the stack.
   */

  public String currentStack() {
    String arrayVal = "Current ArrayList: ";
    for (int counter = 0; counter < _stackAsArray.size(); counter++) {
      arrayVal = arrayVal + _stackAsArray.get(counter) + ", ";
    }
    return arrayVal;
  }
}

