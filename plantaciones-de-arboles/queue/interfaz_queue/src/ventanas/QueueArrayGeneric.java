/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.ArrayList;

/**
 *
 * @author Erwin
 */
public class QueueArrayGeneric <T> {
    private static final int N = 10000000;
    private int front, rear, count;
    private ArrayList<T> qarray;
    //private T[] qarray;

    public QueueArrayGeneric() {
        this(N);
    }

    public QueueArrayGeneric(int n) {
         front = rear = count = 0;
         qarray= new ArrayList<T>();
        //qarray = (T[]) new Object[n];
    }

    public T dequeue() {
        T item = null;
        if (empty())
            System.out.println("Queue is empty: item not dequeued");
        else {
          item=qarray.get(front);
            //item = qarray[front];
            front = (front + 1) % N;
            count--;
        }
        return item;
    }

    public void enqueue(T item) {
        if (full())
            System.out.println("Queue is full: item not enqueued");
        else {
            //qarray[rear] = item;
            qarray.add(item);
            rear = (rear + 1) % N;
            count++;
        }
    }

    public boolean empty() {
        return count <= 0;
    }

    public boolean full() {
        return count >= N;
    }

    public int getCount() {
        return count;
    }   
    
}
