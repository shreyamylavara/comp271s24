/*
 * In the class below, write two methods:
 * 
 * First, method resize() to expand the existing array data by doubling its size.
 *
 * Second, method contains(String string) that returns true if String string already
 * exists in array data and false otherwise.
 *
 * Your code must have comments explaining what is done and why it is done in the
 * way you do it.
 *
 * DO NOT USE any tools that require to be imported, ie, do not use the import command.
 *
 * To save this assignment, make sure you commit your changes to your GitHub repository,
 * following the instructions in Sakai. IF YOU DO NOT COMMIT THE CHANGES, IT IS POSSIBLE THAT
 * YOUR WORK MAY BE LOST AND YOU MAY HAVE TO START ALL OVER AGAIN.
 */
public class DynamicArray {

    /** The underlying array for this object */
    private String[] data;

    /** Currently available position in array data */
    private int position;

    /** Constant with default size */
    private static final int DEFAULT_SIZE = 10;

    /**
     * Basic constructor for the object
     * @param size initial size of array data
     */
    public DynamicArray(int size) {
        this.data = new String[size];
        this.position = 0;
    } // basic constructor

    /** Default constructor */
    public DynamicArray() {
        this(DEFAULT_SIZE);
    } // default constructor

    /**
     * Adds a new item to array data after ensurig there is 
     * sufficient room by resizing the array if necessary.
     * @param string new item to add to array
     */
    public void add(String string) {
        // Make sure there is room in array data
        if (this.position == this.data.length) {
            resize();
        }
        // Now array has room for more elements.
        this.data[this.position] = string;
        this.position++;
    } // method add
    
//now we are going to resize the existing array by doubling it

public void resize() {
        // Create a new array with double the size
        String[] newData = new String[this.data.length * 2];
        newData = this.data ;

        
    } 

//using boolean to determine if it is true or false
    public boolean contains(String string) {
            // Return true if the string is found
            if (this.data.equals(string)) {
                return true;
            } //return false if the string isn't found

//now writing a method that returns the number of times the String String appears
    public int countOf(String string) {
    int count = 0; //this keeps track of the number of times string appears
        if (this.data.equals(string)) {
            count++;
        }
     return count ; //this returns the total count of the amount of times string appears
    }
}

