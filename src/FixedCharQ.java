/*
Title: FixedCharQ.java
Abstract: makes a fixed queue for characters which implements the methods for a character queue.
Author: Aaron Johnson
Date: 10-15-22
 */
public class FixedCharQ implements InterCharQ{
    private char[] queue;

    // the put and get indices
    private int putLocation;
    private int getLocation;

    public FixedCharQ(int size) {
        queue = new char[size]; // allocate memory for queue
        putLocation = getLocation = 0;
    }

    // put a character into the queue
    public void put(char character) {
        if (putLocation == queue.length) {
            System.out.println(" - Queue is full.");
            return;
        }
        queue[putLocation++] = character;
    }

    // get a character from the queue
    public char get() {
        if (getLocation == putLocation) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        return queue[getLocation++];
    }
}
