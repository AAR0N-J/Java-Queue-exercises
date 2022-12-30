/*
Title: DynamicQ.java
Abstract: makes a dynamic queue for characters which implements the methods for a character queue.
Author: Aaron Johnson
Date: 10-15-22
 */
public class DynamicQ implements InterCharQ{
    private char[] queue;

    // the put and get indices
    private int putLocation;
    private int getLocation;
    int size;

    public DynamicQ(int size) {
        queue = new char[size]; // allocate memory for queue
        putLocation = getLocation = 0;
        this.size = size;
    }

    // put a character into the queue
    public void put(char character) {
        if (putLocation == queue.length) {
            char[] oldQueue = queue;
            size = size*2;
            queue = new char[size];
            for (int i = 0; i < oldQueue.length; i++) {
                queue[i] = oldQueue[i];
            }
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
