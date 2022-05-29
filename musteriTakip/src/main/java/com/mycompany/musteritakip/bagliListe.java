/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musteritakip;
import com.sun.net.httpserver.Headers;
import java.util.Scanner;
/**
 *
 * @author AB
 */
public class bagliListe {
    
    Scanner scanner = new Scanner(System.in);
    
    musteriNode head = null;
    musteriNode tail = null;
    
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;
    
    void ekle()
    {
        System.out.println("musterinin bilgilerini giriniz.");
        System.out.print("numarasi : "); id = scanner.nextInt();
        scanner.nextLine(); //enter'i satır olarak algılama için kondu.
        System.out.print("ad : "); ad = scanner.nextLine();
        System.out.print("soyad : "); soyad = scanner.nextLine();
        System.out.print("telefon : "); tel = scanner.nextLine();
        System.out.print("adres : "); adres = scanner.nextLine();
        System.out.print("urun : "); urun = scanner.nextLine();
        
        musteriNode eleman = new musteriNode(id, ad, soyad, tel, adres, urun);
    
        if(head  == null)
        {
            head = eleman;
            tail = eleman;
            System.out.println("ilk musteri kayit edildi!");
        }
        else
        {
            eleman.next = head;
            head.prev = eleman;
            head = eleman;
            System.out.println(id + "numarali musteri kayit eidldi.");
        }
    }
    
    void sil()
    {   
        boolean sonuc = false;
        if(head == null)
        {
            System.out.println("Liste bos!!!");
        }
        else
        {
            System.out.println("Silinecek musteri numarasi  : "); id = scanner.nextInt();
            scanner.nextLine(); //enter'i satır olarak algılama için   
            
            if(head.next == null && head.id == id)
            {
                head = null;
                tail = null;
                System.out.println(id + "numarali musteri silindi.");
                sonuc = true;
            }
            else if(head.next != null && head.id == id)
            {
                head = head.next;
                head.prev = null;
                System.out.println(id + "numarali musteri silindi.");
                sonuc = true;
            }
            else if(tail.id == id) // son düğüm siliniyor
            {
                tail = tail.prev;
                tail.next = null;
                System.out.println(id + "numarali musteri silindi.");
                sonuc = true;
            }
            else // aradan eleman silme. Silinecek düğümü bulup bulduğumuz düğümün bir önceki ve bir sonrakini birbirine bağlayacağız.
            {
                musteriNode temp = head;
                while(temp!=null)
                {
                    if(temp.id == id)
                    {
                        temp.next.prev = temp.prev;
                        temp.prev.next = temp.next;
                        System.out.println(id + "numarali musteri silindi.");
                        sonuc = true;
                        break;
                    }
                    
                    temp = temp.next;
                }
            }
        }
    
       if(!sonuc)
            System.out.println(id + "numarali musteri listede yok"); 
    }
    
    void guncelle()
    {   
        boolean sonuc = false;
        if(head == null)
            System.out.println("Liste bos!!!");
        else
        {
            System.out.println("guncellenecek musteri numarasi  : "); id = scanner.nextInt();
            scanner.nextLine(); //enter'i satır olarak algılama için   
            
            musteriNode temp = head;
            while(temp!=null)
            {
                if(temp.id == id)
                {
                    System.out.println(id + " numarali musteri bilgileri : ");
                    System.out.println("ad           : " + temp.ad );
                    System.out.println("soyad        : " + temp.soyad );
                    System.out.println("telefon      : " + temp.tel );
                    System.out.println("adres        : " + temp.adres );
                    System.out.println("urun         : " + temp.urun );
                    
                    System.out.println("Urun bilgisini guncelleyiniz    : ");
                    temp.urun = scanner.nextLine();
                    System.out.println("urun bilgisi guncellendi.");
                    
                    sonuc = true;
                    break;
                }

                temp = temp.next;
            }
            
        }
    
       if(!sonuc)
            System.out.println(id + "numarali musteri listede yok"); 
    }
    
    void musteriAra()
    {   
        boolean sonuc = false;
        if(head == null)
            System.out.println("Liste bos!!!");
        else
        {
            System.out.println("Aradiginiz musteri numarasi  : "); id = scanner.nextInt();
            scanner.nextLine(); //enter'i satır olarak algılama için   
            
            musteriNode temp = head;
            while(temp!=null)
            {
                if(temp.id == id)
                {
                    System.out.println(id + " numarali musteri bilgileri : ");
                    System.out.println("ad           : " + temp.ad );
                    System.out.println("soyad        : " + temp.soyad );
                    System.out.println("telefon      : " + temp.tel );
                    System.out.println("adres        : " + temp.adres );
                    System.out.println("urun         : " + temp.urun );
                    
                    sonuc = true;
                    break;
                }

                temp = temp.next;
            }
            
        }
    
       if(!sonuc)
            System.out.println(id + "numarali musteri listede yok"); 
    }
    
    
    void yazdir()
    {   
        if(head == null)
            System.out.println("Liste bos!!!");
        else
        {
            System.out.print("Numara\tAd\tSoyad\tTelefon\tAdres\tUrun Adi\n"); //id = scanner.nextInt();
            
            musteriNode temp = head;
            while(temp!=null)
            {
                System.out.println(temp.id + "\t" + temp.ad + "\t" + temp.soyad + "\t" + temp.tel + "\t" + temp.adres + "\t" + temp.urun);
                
                temp = temp.next;
            }
            
        }
                                                    
    }
    
    
}
