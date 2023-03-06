/** 
 * <h2>Stack.java/h2> 
 * <p>Description: Add additional methods to the Stack class, and print error messages where a stack underflow / stack overflow is detected</p> 
 * @author Alana Dubie
 * @version Homework 2, Intro to Stacks
 *
 *
 *
 *
 * Tests the Stack class.
 *
 * @author Alana Dubie
 * @version 2/11/2021
 */
public class Stack 
{
    /** The max integer value the array can hold is {@value} */
    public static final int MAX = 9;     

    //instance variables
    private int element[];               //creates an array
    private int top;                     //top position of array

    /**      
     * Full constructor initializes instance variables for a Stack.  
     *  
     *  Postcondition: array and top is initialized.      
     * 
     */
    public Stack()
    {
        //initializes array
        element = new int[MAX];
        top = -1;                //stack starts empty
    }
    
    //you must write the necessary Stack methods here

    /**
     * Adds item to the top and prints a message of the item value being "pushed"
     *
     * @param x the index value of the (Stack) array
     */
    public void push(int x) 
    {
        //if push() a full stack --> overflow, print out error message
        if (isFull())
        {
            System.out.println("Stack overflow in pop()");
        }

        //sets x as current top positon value in array
        element[++top] = x;

        //prints message of x being added to top position of array
        System.out.println("Pushing " + x + " to the top");

    }

    /**
     * Removes item from the top and returns the new top position value of (Stack) array
     *
     * @return popped value
     */
    public int pop() 
    {
        //if pop() an empty stack --> underflow, print out error message
        if (isEmpty())
        {
            System.out.println("Stack underflow in pop()");
        }

        //changes top position of array by decrementing the position by one: 
        int popped = element[top--];
        return popped;  //returns current top position value in array after being "popped off"

    }

    /**
     * Checks whether or not the Stack is empty.
     *
     * @return true if Stack is empty; false otherwise 
     */
    public boolean isEmpty()
    {
        if (top == -1)
        {
            //set to true if the value at the top of stack is set to -1 
            return true;
        }
        //set to false otherwise
        return false;
    }

    /**
     * Checks whether or not the Stack is Full.
     *
     * @return true if Stack is full; false otherwise 
     */
    public boolean isFull()
    {
        if (top >= element.length)
        {
            //set to true if the value at the top of stack is set to -1 
            return true;
        }
        //set to false otherwise
        return false;
    }
}
