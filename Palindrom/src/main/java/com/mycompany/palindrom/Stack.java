/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.palindrom;

/**
 *
 * @author AB
 */
public class Stack {
    Node top; // head
    int size;
    int counter;

    public Stack( int size ) {
        this.size = size;
        counter = 0;
        top = null;
    }
    
    void push( char ch ) // push ile harf eklenecek
    {
        if( !isFull() )
        {
            Node eleman = new Node(ch);
            
            if( isEmpty() )
            {
                top = eleman;
            }
            else
            {
                eleman.next = top;
                top = eleman;
            }
            counter++;
            
        }
        
    }
    
    char pop()
    {
        if( ! isEmpty() )
        {
            char ch = top.harf;
            top = top.next;
            counter--;
            return ch;
        }
        else
            return '+';
    }
    
    boolean isEmpty()
    {
        return counter == 0;
    }
    
    boolean isFull()
    {
        return counter == size;
    }
    
}
