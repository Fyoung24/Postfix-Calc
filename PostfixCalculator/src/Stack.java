/*
CZ
11/9/23
FY
 */

public class Stack<T> {

    // The instance variables to maintain the stack state
    private int size;
    private StackNode top;

    // A constructor to initialize an empty stack
    public Stack() {
        // The stack is initially empty
    }

    // A method for pushing an element onto the stack
    public void push(T data) {
        size++;  // Increases the size of the stack
        StackNode n = new StackNode(data, top);  // Creates a new node
        top = n;  // Sets the new node as the top
    }

    // A method for popping and returning the top element from the stack
    public T pop() {
        size--;  // Decreases the size of the stack
        StackNode oldTop = top;  // Gets the current top node
        top = top.getParent();  // Updates the top to the previous node
        return (T) oldTop.getData();  // Returns the data of the removed element
    }

    // A method for peeking at the top element without removing it
    public T peek() {
        return (T) top.getData();  // Returns the data of the top element
    }

    // A method for checking if the stack is empty
    public boolean isEmpty() {
        if (size == 0) {
            return true;  // The stack is empty
        } else {
            return false;  // The stack is not empty
        }
    }

    // A method for getting the current size of the stack
    public int size() {
        return size;  // Returns the size of the stack
    }
}
