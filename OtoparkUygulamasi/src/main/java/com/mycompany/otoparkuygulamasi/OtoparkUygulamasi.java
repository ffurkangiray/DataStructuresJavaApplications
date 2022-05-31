/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.otoparkuygulamasi;

import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author AB
 */
public class OtoparkUygulamasi {

    public static void main(String[] args) throws ParseException{ // dönüştürme hatasi için kullanılır
        
        Scanner scanner = new Scanner(System.in);
        
        BagliListe liste = new BagliListe();
        int secim = -1;
        
        while(secim != 0)
        {
            System.out.println("1- otoparka arac girisi");
            System.out.println("2- otoparktan arac cikisi");
            System.out.println("3- otoparktaki araclari listele");
            System.out.println("4- toplam gelir (TL) ");
            System.out.println("0- cikis ");
            System.out.println(" seciminiz : "); secim = scanner.nextInt();
            
            switch(secim)
            {
                case 1: liste.ekle(); break;
                case 2: liste.sil(); break;
                case 3: liste.yazdir();break;
                case 4: System.out.println("Toplam Ucret: " + liste.toplamUcret); break;
                case 0: System.out.println("Cikis Yaptiniz."); break;
                default: System.out.println("Hatali giris yaptiniz [0-4] ");break;
            }
        }
    }
}
