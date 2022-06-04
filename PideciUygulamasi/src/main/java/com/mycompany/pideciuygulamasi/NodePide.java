/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pideciuygulamasi;

/**
 *
 * @author AB
 */
public class NodePide {
    String isim;
    int adet;
    int ucret;
    NodePide next;

    public NodePide(String isim, int adet) {
        this.isim = isim;
        this.adet = adet;
        ucret = adet*4;
        next = null;
    }
    
    
    
}
