/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ogrencikayit;
import java.util.Scanner;
/**
 *
 * @author AB
 */
public class ogrListe {
    //liste yapisi
    //liste yapisinin global değişkenleri 
    ogrNode head = null;
    ogrNode tail = null;
    ogrNode temp = null;
    ogrNode temp2 = null;
    
    //liste yapisinin global degiskenleri
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;
    
    //kullanıcıdan alınacağı için bu nesne oluşturuldu
    Scanner scanner = new Scanner(System.in);
    
    
    //fonksiyonlar
    void ekle()
    {
        System.out.println("Bilgisayar bolumune kayit olacak ogrenci bilgilerini giriniz : ");  
        System.out.println("numara : "); numara = scanner.nextInt();
        scanner.nextLine();
        System.out.println("ad : "); ad = scanner.nextLine();
        System.out.println("soyad : "); soyad = scanner.nextLine();
        System.out.println("vize : "); vize = scanner.nextInt();
        System.out.println("final : "); fin = scanner.nextInt();
        
        ogrNode eleman = new ogrNode(numara,ad,soyad,vize,fin);
        
        if(head==null)
        {
            head = eleman;
            tail = eleman;
            System.out.println("Bilgisayar bolumune kayit olacak ogrencilerin liste yapisi olusturuldu.");
        }
        else
        { // basa ekleme şeklinde oluşturuldu
            eleman.next = head;
            head = eleman;
            System.out.println(numara + "numarali ogrenci bolume kayit edildi.");
        }
    }    
     
    void sil()
    {
        if(head==null)
        {
            System.out.println("liste bos, silinecek ogrenci yok!!!");
        }
        else
        {
            System.out.println("silmek istediginiz ogrencinin numarasini giriniz : ");
            numara = scanner.nextInt();

            if(numara == head.numara && head.next==null)
            {
                head = null;
                tail = null;
                System.out.println(numara + "numarali ogrenci silindi, listede kayıtlı ogrenci kalmadi.");
            }
            else if(numara == head.numara && head.next!=null)
            {
                head = head.next;
                System.out.println(numara + "numarali ogrenci silindi ");
            }
            else
            {
                temp = head;
                temp2 = head;
                while(temp.next!=null)
                {
                    if(numara == temp.numara)
                    {
                        temp2.next = temp.next;
                        System.out.println(numara + "numarali ogrenci silindi.");
                    }

                    temp2 = temp;
                    temp = temp.next;
                }

                //tail silinmesi için while dışında kalan indeks işlemi
                if(numara == temp.numara)
                {
                    temp2.next = null;
                    tail = temp2;
                    System.out.println(numara + "numarali ogrenci silindi.");
                }
            }
        }
    }
    
    void yazdir()
    {
        if(head==null)
        {
            System.out.println("Liste bos!!!");
        }
        else
        {
            temp = head;
            while(temp!=null)
            {
                System.out.println(temp.numara + "numarali ogrenci bilgileri");
                System.out.println("******************************");
                System.out.println("ad        : " + temp.ad );
                System.out.println("soyad     : " + temp.soyad );
                System.out.println("vize      : " + temp.vize );
                System.out.println("fin       : " + temp.fin );
                System.out.println("ortalama  : " + temp.ortalama );
                System.out.println("durum     : " + temp.durum );
                System.out.println("*******************************");
                
                temp = temp.next;
            }
        }
    }
    
        void enBasariliOgrenci()
    {
        if(head==null)
        {
            System.out.println("Liste bos!!!");
        }
        else
        {
            temp = head;
            double buyuk = temp.ortalama;
            while(temp!=null)
            {
                if(buyuk < temp.ortalama)
                {
                    buyuk = temp.ortalama;
                    
                    numara = temp.numara;
                    ad = temp.ad;
                    soyad = temp.soyad;
                    vize = temp.vize;
                    fin = temp.fin;
                    ortalama = temp.ortalama;
                    durum = temp.durum;
                }
                
                temp = temp.next;
            }
            
            System.out.println("en basarili ogrenci bilgileri");
            System.out.println("******************************");
            System.out.println("ad        : " + ad );
            System.out.println("soyad     : " + soyad );
            System.out.println("vize      : " + vize );
            System.out.println("fin       : " + fin );
            System.out.println("ortalama  : " + ortalama );
            System.out.println("durum     : " + durum );
            System.out.println("*******************************");

        }
    }
}
