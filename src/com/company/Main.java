package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /*System.out.println("Merhab Dünya");
        System.out.println("Adım Furkan");
        int x = 10;
        int y;
        int sadi;
        sadi = 15;
        System.out.println("Merhaba Dünya"+sadi);
        String s;
        s = "Benim adım Furkan Koçman";
        double a = 3.14;
        System.out.println("Hello"+s);
        */
        // not alıyorum karedim
        /*
        ne yapayım kardeşim
        allah allah
         */
        /*String s = "Benim adım Furkan";
        s.toUpperCase();
        int ilkbosluk = s.indexOf(" ");
        String ilkkelime = s.substring(0,ilkbosluk);
        System.out.println("İlk kelime:"+ilkkelime);
        int sonbosluk = s.lastIndexOf(" ");
        String sonkelime = s.substring(sonbosluk);
        System.out.println("Son kelime:"+sonkelime);
        //ilk öğrendiğimiz boşluk bulup kelime yazdırma
        */
        /*int a [] = new int[5];
        a[3] = 8;
        System.out.println(""+a[3]);
        int b[] = {0,1,2,3,3,5};
        String str[] = {"ali","ayşe","fatms"};
        System.out.println(str[2]+a[3]+"nabersinniz");
        */

        // OKUNAN DEĞERİ EKRANA YAZDIRMA
        /*Scanner b = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = b.nextInt();
        System.out.println("Girdiğiniz sayi: "+sayi);*/
        Scanner ilksayi= new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        int a = ilksayi.nextInt();
        System.out.print("İkinci sayiyi giriniz:");
        int b = ilksayi.nextInt();
        System.out.println("Toplam "+(a+b));
        System.out.println("Fark:"+(a-b));
        System.out.println("Çarpım: "+(a*b));
        System.out.println("Bölüm: "+((float)a/(float)b));
        System.out.println("Kalan: "+(a%b));
    }
}
