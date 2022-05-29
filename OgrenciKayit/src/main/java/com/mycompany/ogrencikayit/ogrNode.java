/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ogrencikayit;

/**
 *
 * @author AB
 */
public class ogrNode {
    int numara;
    String ad;
    String soyad;
    int vize;
    int fin;
    double ortalama;
    String durum;
    
    ogrNode next;
    
    //constructor elemanlarını kullanıcıdan almak zorunda
    public ogrNode(int numara, String ad,String soyad,int vize,int fin)
    {
        // super(); // kalıtım alındığında kullanılır
        this.numara = numara;
        this.ad = ad;
        this.soyad = soyad;
        this.vize = vize;
        this.fin = fin;
        
        // kendi içinde hesaplanan kısım
        ortalama = vize*0.4 + fin*0.6;
        
        if(ortalama >= 50)
            durum = "Gecti";
        else
            durum = "Kaldi";
        
        next = null; // tek yonlu oldugundan son next null oldu
    }
}
