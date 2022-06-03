/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kurskayituygulamasi;
import java.util.Scanner;
/**
 *
 * @author AB
 */
public class KursKayitUygulamasi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n,secim = -1;
        
        System.out.println("Kursa kayit edilecek kisi sayisi?"); n = scanner.nextInt();
        
        KursStack bilgisayarKursListesi = new KursStack(n);
        
        while( secim != 0 )
        {
            System.out.println("1- kursa yeni kayit ");
            System.out.println("2- en son kaydi sil ");
            System.out.println("3- kursta kayitli kisiler ");
            System.out.println("4- en son kayitli kisi bilgileri ");
            System.out.println("5- kalan kontenjan bilgileri");
            System.out.println("0- cikis ");
            System.out.println("Seciminiz : "); secim = scanner.nextInt();
                    
            switch(secim)
            {
                case 1: bilgisayarKursListesi.ekle(); break;
                case 2: bilgisayarKursListesi.sil(); break;
                case 3: bilgisayarKursListesi.yazdir(); break;
                case 4: bilgisayarKursListesi.enSonKayitOlanKisi(); break;
                case 5: bilgisayarKursListesi.kalanKontenjanSayisi(); break;
                case 0: System.out.println("Cikis yaptiniz"); break;
                default : System.out.println("Hatali giris yaptiniz [0-5]"); break;
                    
            }
        }
        
    }
}
