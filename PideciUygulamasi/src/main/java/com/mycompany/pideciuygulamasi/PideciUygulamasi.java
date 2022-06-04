/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pideciuygulamasi;
import java.util.Scanner;
/**
 *
 * @author AB
 */
public class PideciUygulamasi { // java ile veri yapılarını pekiştirmek amacıyla, queue yapisi kullanılarak bagli liste pide sirasi uygulamasi

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int secim = -1,n;
        
        System.out.println(" Kuyruk yapisinin eleman sayisi? "); n = scanner.nextInt();
        
        QueuePide kuyruk = new QueuePide(n); // kuyruk yapisi
        
        while( secim!=0 )
        {
            System.out.println("1- Yeni musteri ekle ");
            System.out.println("2- Satis yap ");
            System.out.println("3- Bekleyen musteriler ");
            System.out.println("4- Toplam gelir ");
            System.out.println("0- Cikis ");
            System.out.print(" Seciminiz : ");
            secim = scanner.nextInt();
        
            switch(secim)
            {
            case 1: kuyruk.enQueue(); break;
            case 2: kuyruk.deQueue(); break;
            case 3: kuyruk.print(); break;
            case 4: System.out.println("toplam gelir :" + kuyruk.toplamGelir); break;
            case 0: System.out.println("Cikis yaptiniz.");; break;
            default: System.out.println("Hatali işlem [0-4]"); break;
            }
        
            
        }
        
        
        
    }
}
