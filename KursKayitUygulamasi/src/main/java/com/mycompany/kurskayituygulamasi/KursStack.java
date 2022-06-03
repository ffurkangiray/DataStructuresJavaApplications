/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kurskayituygulamasi;
import java.util.Scanner;
/**
 *
 * @author AB
 */
public class KursStack {
    
    Scanner scanner = new Scanner(System.in);
    KursNode top; // head gibi dusunulebilir
    
    int kontenjan;
    int sayac;

    public KursStack(int kontenjan) {
        this.kontenjan = kontenjan;
        sayac = 0;
        top = null;
    }
    
    String tc;
    String ad;
    String soyad;
    String mezunBolum;
    
    void ekle() // push fonksiyonu
    {
        System.out.println("kursa kayit edilecek kisi bilgileri : ");
        System.out.println("tc no : "); tc = scanner.nextLine();
        System.out.println("ad : "); ad = scanner.nextLine();
        System.out.println("soyad : "); soyad = scanner.nextLine();
        System.out.println("mezun oldugu bolum : "); mezunBolum = scanner.nextLine();
        
        KursNode eleman = new KursNode(tc, ad, soyad, mezunBolum);// bilgileri aldik dugum olusturarak stack icerisine ekliyoruz
        
        if( isFull() )
        {
            System.out.println("kurs kontenjani dolu. Yrni kayit alamiyoruz!");
        }
        else
        {
            if( isEmpty() )
            {
                top = eleman;
                System.out.println(top.tc + "numarali kisi kursa ilk kayit olarak eklendi.");
            }
            else
            {
                eleman.next = top;
                top = eleman;
                System.out.println(top.tc + " numarali kisi kursa eklendi.");
            }
            sayac++; // kontenjana gelince kayit almamak icin
        }
    }
    
    void sil() // pop fonksiyonu
    {
        if( isEmpty() )
        {
            System.out.println("kursta kayitli kimse yoktur.");
        }
        else
        {
            System.out.println(top.tc + " numarali kisi silindi.");
            top = top.next;
            sayac--;
        }
    }
    
    void yazdir()
    {
        if( isEmpty() )
        {
            System.out.println("kursa kayitli kimse yoktur.");
        }
        else
        {
            KursNode temp = top;
            System.out.println("Kursta  kayitli kisi listesi ");
            System.out.println("TCNo\tAd\tSoyad\tMezun Bolum");
            while( temp != null ) // null = stack'e ilk kayit edilen en alttaki dugumun gostericisi null'u gosterir.
            {
                System.out.println(temp.tc + "\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.mezunBolum);
                temp = temp.next;
            }
        }
    }
    
    void enSonKayitOlanKisi()
    {
        if( isEmpty() )
        {
            System.out.println("kursta kayitli kimse yok!");
        }
        else
        {
            System.out.println("kursa kayit olan en son kisi");
            System.out.println(top.tc + "\t" + top.ad + "\t" + top.soyad + "\t" + top.mezunBolum);
        }
    }
    
    void kalanKontenjanSayisi()
    {
        System.out.println("toplam kayitli kisi sayisi  : " + sayac);
        System.out.println("kalan kontenjan sayisi      : " + ( kontenjan - sayac ) );
    }
    
    private boolean isFull()
    {
        return sayac == kontenjan; // sayac kontenjana esit oldugunda 1 dondurur.
    }
    
    private boolean isEmpty()
    {
        return sayac == 0;
    }
}
