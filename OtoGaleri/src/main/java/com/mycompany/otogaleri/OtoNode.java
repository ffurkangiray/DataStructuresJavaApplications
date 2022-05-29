/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.otogaleri;

/**
 *
 * @author AB
 */
public class OtoNode {  // tek yönlü dairesel bagli liste node(düğüm)yapısı
    
    String plaka;
    String marka;
    String model;
    String renk;
    int alisFiyat;
    int satisFiyat;
    String aciklama;

    OtoNode next;

    public OtoNode(String plaka, String marka, String model, String renk, int alisFiyat, String aciklama) {
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.alisFiyat = alisFiyat;
        this.satisFiyat = alisFiyat * 12/10;
        this.aciklama = aciklama;
        next = null;
    }
    
    
    
    
}
