/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.otogaleri;
import java.util.Scanner;

/**
 *
 * @author AB
 */
public class BagliListe { // tek yonlu bagli liste
    Scanner scanner = new Scanner(System.in);
    
    OtoNode head = null; // 2 global Node
    OtoNode tail = null;
    
    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyat;
    int satisFiyat;
    String aciklama;
    
    void ekle()     // kullanıcı oto bilgisi girişi
    {
        System.out.print("galeriye eklenecek otomobilin bilgilerini giriniz. ");
        System.out.println();
        System.out.print("plaka       : "); plaka = scanner.nextLine();
        System.out.print("marka       : "); marka = scanner.nextLine();
        System.out.print("model       : "); model = scanner.nextLine();
        System.out.print("renk        : "); renk = scanner.nextLine();
        System.out.print("alisFiyat   : "); alisFiyat = scanner.nextInt();
        scanner.nextLine();
        System.out.print("aciklama    : "); aciklama = scanner.nextLine();
        
        OtoNode arac = new OtoNode(plaka, marka, model, renk, alisFiyat, aciklama);
        
        if(head == null)
        {
            head = arac;
            tail = arac;
            tail.next = head;
            System.out.println(plaka + " plakali arac otogaleriye eklendi.");
        }
        else
        {
            arac.next = head;
            head = arac;
            tail.next = head;
            System.out.println(plaka + " plakali arac otogaleriye eklendi.");
        }
    }
    
    void sil()      // satış işlemi
    {
        if(head == null) // otogaleride arac yok
            System.out.println("Otogaleride arac yok.");
        else
        {   
            System.out.println("satisini yaptiginiz otomobilin plakasi : "); plaka = scanner.nextLine();
            
            if( head == tail && head.plaka.equals(plaka)) // otogaleride bir arac var
            {
                System.out.println( plaka + " plakali arac " + head.satisFiyat + " TL'ye satildi. "); // silme isleminden önce yazdirilmali
                head = null;
                tail = null;
            }
            else if( head != tail && head.plaka.equals(plaka) ) //2 elemanlının başındaki silindi.
            {
                System.out.println( plaka + " plakali arac " + head.satisFiyat + " TL'ye satildi. ");
                head = head.next;
                tail = head;
            }
            else
            {
                OtoNode temp = head;
                OtoNode temp2 = head;
                
                while(temp != tail) // son düğüme kadar git // son düğüme kadar gitmediğinden while dışına bir kez daha if tanımlandı.(Son eleman için)
                {
                    if( temp.plaka.equals(plaka))
                    {
                        System.out.println(plaka + "plakali arac" + temp.satisFiyat + " TL'ye satildi. ");
                        temp2.next = temp.next; // temp aradan çıkmış oldu.
                    }
                }
                if( temp.plaka.equals(plaka))
                {
                    System.out.println(plaka + "plakali arac" + temp.satisFiyat + " TL'ye satildi. "); // temp silme isleminden önce yazdirdik.
                    tail = temp2;
                    tail.next = head;
                }
                
            }
        }
    }
    
    void yazdir()   // arac bilgilerini yazddırma
    {
        if(head == null)
        {
            System.out.println("Otogaleride arac yok.");
        }
        else
        {
            System.out.println("Plaka\tMarka\tModel\tRenk\taFiyat\tsFiyat\tAciklama ");
            
            OtoNode temp = head;
            
            while(temp != tail) // son düğüme girmiyor tail için if ekliyoruz.
            {
                System.out.println(temp.plaka + "\t" + temp.marka + "\t" + temp.model + "\t" + temp.renk + "\t" + temp.alisFiyat + "\t" + temp.satisFiyat + "\t" + temp.aciklama);
                temp = temp.next;
            }
            System.out.println(temp.plaka + "\t" + temp.marka + "\t" + temp.model + "\t" + temp.renk + "\t" + temp.alisFiyat + "\t" + temp.satisFiyat + "\t" + temp.aciklama);
            
        }
    }
    
    void aracAra()
    {
        if(head == null)
        {
            System.out.println("Otogaleride arac yok. ");
        }
        else
        {
            boolean sonuc = false;
            System.out.println("aradiginiz aracin plakasi : "); plaka = scanner.nextLine();
            OtoNode temp = head;
            OtoNode temp2 = head;
            
            while( temp != tail )
            {
                if( temp.plaka.equals(plaka))
                {
                    temp2 = temp;
                    sonuc = true;
                }
                
                temp = temp.next;
            }
            if( temp.plaka.equals(plaka)) // while'ın ulaşamadığı son eleman için tekrar
            {
                temp2 = temp;
                sonuc = true;
            }
            
            if(sonuc == false)
                System.out.println(plaka + "plakali arac otogaleride yok.");
            else
            {
                System.out.println(plaka + "plakali arac bilgileri : ");
                System.out.println("marka       :" + temp2.marka );
                System.out.println("model       :" + temp2.model );
                System.out.println("renk        :" + temp2.renk );
                System.out.println("alisfiyat   :" + temp2.alisFiyat );
                System.out.println("satisfiyat  :" + temp2.satisFiyat );
                System.out.println("aciklama    :" + temp2.aciklama );
            }
                    
            
            
        }
    }

}

