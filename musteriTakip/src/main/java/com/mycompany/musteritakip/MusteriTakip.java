/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.musteritakip;
import java.util.Scanner;
import javax.xml.transform.OutputKeys;

/**
 *
 * @author AB
 */
public class MusteriTakip {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        bagliListe liste = new bagliListe();
        
        int secim =-1;
        while(secim!=0){
            System.out.println("1- ekle");
            System.out.println("2- sil");
            System.out.println("3- guncelle");
            System.out.println("4- musteri ara");
            System.out.println("5- yazdir");
            System.out.println("6- cikis");
            System.out.println("seciminiz : "); 
            secim = scanner.nextInt();
            scanner.nextLine();
            
            switch(secim)
            {
                case 1  : liste.ekle(); break;
                case 2  : liste.sil(); break;
                case 3  : liste.guncelle();break;
                case 4  : liste.musteriAra();break;
                case 5  : liste.yazdir();break;
                case 0  : System.out.println("cikis yaptiniz. ");; break;
                default  : System.out.println("hatali secim yaptiniz. (0-5 arasi sec.)"); break;
            }
        }
        
        
        
        
    }
}
