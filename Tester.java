/** 
 * <h2> Implement a stack using an array </h2> 
 * <p>Problem Statement:  Add additional methods to the Stack class, and print error messages where a stack underflow / stack overflow is detected.</p> 
 * <p>Algorithm:</p> 
 * <ol> 
 *   <li>Create a new Stack object <code>s</code>.</li> 
 *   <li>Create a for loop that will "push" Stack <code>s</code> up to five counts. </li>
 *   <li>Create a loop that will "pop" Stack <code>s</code> for each count, only while Stack <code>s</code> is NOT empty. </li> 
 *   <li>Include another Stack "pop" to test for Stack underflow error.</li> 
 * </ol> 
 * 
 * 
 * 
 * 
 * Tests the Tester class.
 *
 * @author Alana Dubie
 * @version 2/11/2021
 */
public class Tester 
{
    /**     
     * <p>Tests the Stack methods </p>  
     */
    public static void main() 
    {
        //creates a new stack
        Stack s = new Stack();

        for (int x = 1; x < 6; ++x)
            s.push(x);                     //adds items x to top of stack s

        while (!s.isEmpty())
            System.out.println(s.pop());   //prints removed items x from the top of stack s

        //test empty stack error    
        s.pop(); 

    }
}
