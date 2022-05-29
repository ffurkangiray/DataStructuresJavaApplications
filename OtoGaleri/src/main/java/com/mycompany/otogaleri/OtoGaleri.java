/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.otogaleri;
import java.util.Scanner;

/**
 * Bir oto galericinin elindeki araçların özelliklerini 
 * ve alma-satma durumlarını tek yönlü dairesel 
 * bagli liste yapısına uygun olarak uygulaması
 * @author FurkanGiray
 */
public class OtoGaleri { 
  

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        BagliListe liste = new BagliListe();
        
        int secim = -1;
        while( secim != 0)
        {
            System.out.println("1- Ekle ");
            System.out.println("2- Sil ");
            System.out.println("3- Yazdir ");
            System.out.println("4- Ara ");
            System.out.println("0- Cikis ");
            System.out.println("Seciminiz : ");
            secim = scanner.nextInt();
            
            switch(secim)
            {
                case 1: liste.ekle(); break;
                case 2: liste.sil();break;
                case 3: liste.yazdir();break;
                case 4: liste.aracAra();break;
                case 0: System.out.println("Cikis Yaptiniz "); break;
                default : System.out.println("Hatali secim [0 - 4]"); break;
            }
        }
    }
}
