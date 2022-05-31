/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.otoparkuygulamasi;

/**
 *
 * @author AB
 */
public class OtoNode {
    String plaka;
    String giris;
    String cikis;
    long dakika;
    long ucret;
    
    OtoNode next;
    OtoNode prev;

    public OtoNode(String plaka, String giris) {
        this.plaka = plaka;
        this.giris = giris;
        this.next = null;
        this.prev = null;
    }
    
    
    
}
