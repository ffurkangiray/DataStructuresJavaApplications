/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ogrencikayit;
import java.util.Scanner;

/**
 *
 * @author AB
 */
public class OgrenciKayit {

    public static void main(String[] args) {
        int secim = -1;
        //liste yapisinin nesne olarak olusturulması
        ogrListe bilBolum = new ogrListe();
        
        Scanner scanner = new Scanner(System.in);
        
        while(secim != 0)
        {
            System.out.println();
            System.out.println("Bilgisayar bolumu ogrenci kayit uygulamasi ");
            System.out.println("1- yeni kayit ");
            System.out.println("2- kayit sil ");
            System.out.println("3- kayitlari listele ");
            System.out.println("4- en basarili ogrenci bilgileri ");
            System.out.println("0- cikis ");
            System.out.print("seciminiz : "); // kullancıdan alınacağı için ln yok
            
            secim = scanner.nextInt();
            
            if(secim == 1)
                bilBolum.ekle();
            else if(secim == 2)
                bilBolum.sil();
            else if(secim == 3)
                bilBolum.yazdir();
            else if(secim == 4)
                bilBolum.enBasariliOgrenci();
            else if(secim == 0)
                System.out.println("programı sonlandirdiniz...");
            else
                System.out.println("hatali secim yaptiniz [0-4]");
        }
        
        
    }
}
