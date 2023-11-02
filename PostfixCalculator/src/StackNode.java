/*
CZ
11/9/23
FY
 */

// A class representing a node for a stack
public class StackNode<T> {

    private T data; // Data stored in the node
    private StackNode parent; // Reference to the parent node

    // Default constructor, creates a node without data or a parent reference
    public StackNode() {

    }

    // Constructor that sets the data of the node when created
    public StackNode(T data) {
        this.data = data;
    }

    // Constructor that sets data and a parent reference when created
    public StackNode(T data, StackNode parent) {
        this.data = data;
        this.parent = parent;
    }

    // Returns the data stored in the node
    public T getData() {
        return data;
    }

    // Sets the data for this node
    public void setData(T data) {
        this.data = data;
    }

    // Returns the parent node that this node is linked to
    public StackNode getParent() {
        return parent;
    }

    // Sets the parent node for this node
    public void setParent(StackNode n) {
        parent = n;
    }

    // Provides a string representation of the node by converting its data to a string
    public String toString() {
        return "Node: " + this.data.toString();
    }

    // Compares the data of the node with the data of another node 'n'
    public boolean equals(StackNode n) {
        return this.data.equals(n.getData());
    }
}