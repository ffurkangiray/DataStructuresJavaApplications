/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musteritakip;

/**
 *
 * @author AB
 */
public class musteriNode { // çify yonlu dogrusal baglı liste
    int id;
    String ad;
    String soyad;
    String tel;
    String adres;
    String urun;
   
    musteriNode next;
    musteriNode prev;
    
    public musteriNode(int id, String ad, String soyad, String tel, String adres, String urun)
    {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tel = tel;
        this.adres = adres;
        this.urun = urun;
        next = null;
        prev = null;
    }
}
