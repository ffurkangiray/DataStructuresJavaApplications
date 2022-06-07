/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ogrenciuygulamatree;
import java.util.Scanner;
import javax.accessibility.AccessibleRole;
/**
 *
 * @author AB
 */
public class OgrenciUygulamaTree { // ogrenci kaydi tutan agac yapisi ile ekleme,silme islemleri
// uygulama ogrenci numarasina gore agaca yerlestirme/silme islemi uyguluyor
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no,not;
        String ad;
        
        Tree ogr = new Tree();
        
        int secim = menu();
        
        while( secim!=0 )
        {
            switch(secim)
            {
            case 1: System.out.println("Eklenecek ogrenci bilgilerini giriniz");
            System.out.print("Numara  : "); no= scanner.nextInt();
            System.out.print("Ad      : "); ad= scanner.next();
            System.out.print("Notu    : "); not = scanner.nextInt();
            ogr.root = ogr.insert(ogr.root, no,ad,not);
            System.out.println(no + " numarali ogrenci eklendi.");
            break;
            
            case 2: System.out.println("silinecek ogrenci numarasi : "); no = scanner.nextInt();
            ogr.root = ogr.delete(ogr.root, no);
            System.out.println(no + "numarali ogrenci silindi.");
            break;
            
            case 3: System.out.println("No\t" + "AD\t" + "NOT");
            ogr.inOrder(ogr.root); break;
            
            case 0: System.out.println(" Programi sonlandirdiniz. ");  break;
            
            default: System.out.println("hatali secim yaptiniz "); break;
            }
            
            secim = menu();
        }
        
    }
    
    private static int menu()
    {
        int secim;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n1- ekle");
        System.out.println("2- sil");
        System.out.println("3- yazdir");
        System.out.println("0- cikis");
        System.out.println("Seciminiz : ");
        
        secim = scanner.nextInt();
        
        return secim;
    }
    
    
}
