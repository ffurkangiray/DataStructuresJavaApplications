/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pideciuygulamasi;
import java.util.Scanner;
import org.w3c.dom.css.Counter;

/**
 *
 * @author AB
 */
public class QueuePide {
    
    Scanner scanner = new Scanner(System.in);
    
    NodePide front; // head
    NodePide rear; // tail
    int size; // kuyruk boyutu
    int count;

    public QueuePide( int size ) {
        this.size = size;
        count = 0;
        front = null;
        rear = null;    
    }
    
    int toplamGelir = 0;
    String isim;
    int adet;
    
    void enQueue()
    {
        if(isFull())
        {
            System.out.println(" kuyruk sirasi dolu!");
        }
        else
        {
            System.out.print("Musteri ismi : "); isim = scanner.nextLine();
            System.out.print("Pide sayisi : "); adet = scanner.nextInt();
            scanner.nextLine(); // alt satıra inmesi icin
            
            NodePide eleman = new NodePide(isim, adet);
            
            if( isEmpty() )
            {
                front = eleman;
                rear = eleman;
                System.out.println(" Kuyruk yapisi olusturuldu, ilk musteri siraya girdi. ");
            }
            else
            {
                rear.next = eleman;
                rear = eleman;
                System.out.println(rear.isim + " musteri siraya girdi.");
            }
            count++;
        }
    }
    
    void deQueue()
    {
        if( isEmpty() )
        {
            System.out.println(" pide sirasinda bekleyen musteri yok! ");
        }
        else
        {
            toplamGelir += front.ucret;
            System.out.println(front.isim + " " + front.adet + " adet pideisini aldi, toplam borcu " + front.ucret + " TL");
            front = front.next;
            count--;
        }
    }
    
    void print(){
        if( isEmpty() )
        {
            System.out.println("Bekleyen musteri yok.");
        }
        else
        {
            NodePide temp = front;
            System.out.print("bas <- ");
            
            while( temp != null )
            {
                System.out.print(temp.isim + " <- ");
                temp = temp.next;
            }
            
            System.out.print(" son.");
            System.out.println();
        }
    }
    
    
    boolean isFull()
    {
        return count == size;
    }
    
    boolean isEmpty()
    {
        return count == 0;
    }
    
    
    
}
