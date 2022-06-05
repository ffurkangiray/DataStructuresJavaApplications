/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palindrom;

/**
 *
 * @author AB
 */
public class Queue {
    Node front;
    Node rear;
    int counter;
    int size;

    public Queue(int size) {
        front = null;
        rear = null;
        counter = 0;
        this.size = size;
    }
    
    void enQueue( char ch )
    {
        if( !isFull() )
        {
            Node eleman = new Node(ch);
            
            if( isEmpty() )
            {
                front = eleman;
                rear = eleman;
            }
            else
            {
                rear.next = eleman;
                rear = eleman;
            }
            counter++;
        }
    }
    
    char deQueue()
    {
        if( !isEmpty() )
        {
            char ch = front.harf;
            rear = front = front.next;
            counter--;
            return ch;
        }
        else
        {
            return '+';
        }
    }
    
    private boolean isEmpty()
    {
        return counter == 0;
    }
    
    private boolean isFull()
    {
        return counter == size;
    }
}
