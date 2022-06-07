 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ogrenciuygulamatree;

/**
 *
 * @author AB
 */
public class Node {
    int no;
    String ad;
    int not;
    Node left;
    Node right;

    public Node() {
        no = 0;
        ad = "";
        not = 0;
        left = null;
        right = null;
    }

    public Node(int no, String ad, int not) {
        this.no = no;
        this.ad = ad;
        this.not = not;
        left = null;
        right = null;
    }
    
    
    
    
     
}
