/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.otoparkuygulamasi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
/**
 *
 * @author AB
 */
public class BagliListe { // cift yonlu dairesel bagli liste yapisi
    
    Scanner scanner = new Scanner(System.in);
    
    OtoNode head = null;
    OtoNode tail = null;
    
    OtoNode temp = head;
    OtoNode temp2 = temp;
    
    String plaka;
    String giris;
    String cikis;
    long dakika;
    long ucret;
    long toplamUcret;
    
    void ekle()
    {
        System.out.print("plaka           : "); plaka = scanner.nextLine();
        System.out.print("giris (ss:dd)   : "); giris = scanner.nextLine();
        
        OtoNode arac = new OtoNode(plaka, giris);
        
        if( head == null ) // otoparka ilk eklenen arac mı?
        {
            head = arac;
            tail = arac;
            
            head.next = tail;
            tail.prev = head;
            head.prev = tail;
            tail.next = head;
            System.out.println("arac otoparka girdi.");
        }
        else // listede baska arac varsa
        {
            arac.next = head;
            head.prev = arac;
            head = arac;
            
            head.prev = tail;
            tail.next = head;
            System.out.println("arac otoparka girdi.");
        }
    }
    
    void sil() throws ParseException
    {
        if( head == null )
        {
            System.out.println("otopark bos!");
        }
        else
        {
            System.out.print("plaka           : "); plaka = scanner.nextLine();
            System.out.print("cikis (ss:dd)   : "); cikis = scanner.nextLine();
            
            if( head == tail && head.plaka.equals(plaka)) // bir arac var ve head siliniyorsa
            {
                ucretHesapla(head,cikis);
                head = null;
                tail = null;
                System.out.println("arac cikisi yapildi. ");
                System.out.println("");
            }
            else if( head != tail && head.plaka.equals(plaka)) // birden fazla arac var ve head siliniyorsa
            {
                ucretHesapla(head,cikis);
                head = head.next;
                head.prev = tail;
                tail.next = head;
                System.out.println("arac cikisi yapildi. ");
            }
            else
            {
                temp = head;
                
                while( temp != tail )
                {
                    if( temp.plaka.equals(plaka))
                    {
                        ucretHesapla(temp,cikis);
                        
                        temp2.next = temp.next;
                        temp.next.prev = temp2;
                        System.out.println("arac cikisi yapildi. ");
                    }
                    
                    temp2 = temp;
                    temp = temp.next;
                }
                
                if( temp.plaka.equals(plaka))
                {
                    ucretHesapla(temp,cikis);

                    tail = temp2;
                    tail.next = head;
                    head.prev = tail;
                    
                    System.out.println("arac cikisi yapildi. ");
                }
            }
        
        }
    }
    
    void ucretHesapla( OtoNode temp3, String cikis2) throws ParseException // Dönüştürme hatası olup olmadığını kontrol ediyor
    {
        giris = temp3.giris;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm"); // hazır fonksiyon (dd.MM.yyyy) 'da tarih için kullanılır
        
        Date d1,d2;
        
        d1 = sdf.parse(giris); //
        d2 = sdf.parse(cikis);
        
        dakika = d2.getTime() - d1.getTime();
        dakika = dakika/60000;
        ucret = dakika/4;
        System.out.println("sure  : " + dakika + " dk ");
        System.out.println("ucret : " + ucret + " TL ");
        toplamUcret += ucret;
    }
    
    void yazdir()
    {
        if( head == null )
        {
            System.out.println("Otoparkta arac yok! ");
        }
        else
        {
            System.out.println("PLAKA\t\tGIRIS SAAT");
            temp = head;
            while( temp != tail )
            {
                System.out.println(temp.plaka + "\t\t" + temp.giris);
                temp = temp.next;
            }
            System.out.println(temp.plaka + "\t\t" + temp.giris); // son bir kez daha yazdir.
        }
    }
    
}
