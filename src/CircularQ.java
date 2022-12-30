/*
Title: CircularQ.java
Abstract: makes a circular queue for characters which implements the methods for a character queue.
Author: Aaron Johnson
Date: 10-15-22
 */
public class CircularQ implements InterCharQ{
    private char[] queue;

    // the put and get indices
    private int putLocation;

    public CircularQ(int size) {
        queue = new char[size]; // allocate memory for queue
        putLocation = 0;
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
        if (putLocation == 0) {
            System.out.println(" - Queue is empty.");
            return (char) 0;
        }
        char first = queue[0];
        for (int i = 0; i < putLocation-1; i++) {
            queue[i] = queue[i+1];
        }
        putLocation--;
        return first;
    }
}
