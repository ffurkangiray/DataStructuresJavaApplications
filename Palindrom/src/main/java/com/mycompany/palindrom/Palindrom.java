/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.palindrom;
import java.util.Scanner;
/**
 *
 * @author AB
 */
public class Palindrom {

    /*
    Queue ve Stack yapilarini kullanarak palindrom (bastan sona ve sondan basa okunusu ayni olan kelime) 
    kelime olup olmadigini bulma uygulamasi.
    */
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        Stack st = new Stack(100);
        Queue qu = new Queue(100);
        
        String kelime;
        System.out.println("kelime girin : "); kelime = scanner.nextLine();
        
        int n= kelime.length(); // kelime harf sayisi
        
        char [] harfler = kelime.toCharArray(); // alinan kelimeyi harf harf degiskene atadik
        
        int i=0;
        while(i<n)
        {
            st.push(harfler[i]);
            qu.enQueue(harfler[i]);
            
            i++;
        }
        
        boolean sonuc = true;
        
        while( !st.isEmpty() )
        {
            if( st.pop() != qu.deQueue() )
            {
                sonuc = false;
                break;
            }
        }
        
        if( sonuc )
            System.out.println(kelime + " palindromdur. ");
        else
            System.out.println(kelime + " palindrom degildir.");
                
        
    }
}
