/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kurskayituygulamasi;

/**
 *
 * @author AB
 */
public class KursNode {
    String tc;
    String ad;
    String soyad;
    String mezunBolum;
    
    KursNode next;//gosterici

    public KursNode(String tc, String ad, String soyad, String mezunBolum) {
        this.tc = tc;
        this.ad = ad;
        this.soyad = soyad;
        this.mezunBolum = mezunBolum;
        next = null;
    }
    
    
    
}
