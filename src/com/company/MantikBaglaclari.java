package com.company;

import java.util.Scanner;

public class MantikBaglaclari {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Birinci(a) sayıyı giriniz:");
        int a = s.nextInt();
        System.out.print("İkinci(b) sayıyı giriniz:");
        int b = s.nextInt();
        System.out.print("Üçüncü(c) sayıyı giriniz:");
        int c = s.nextInt();
        if (b<a && a<c){
            System.out.println("a, b ve c arasında bir sayıdır.");
        }
        else if (c<a && a<b){
            System.out.println("a, b ve c arasında bir sayıdır.");
        }
        else {
            System.out.println("a, b ve c arasında bir sayı değildir.");
        }
        if (a>b || a>c){
            System.out.println("a, b veya c'den büyüktür.");
        }
        else {
            System.out.println("a, b veya c'den büyük değildir.");
        }
        if(a==b && a<c){
            System.out.println("a, b'ye eşit ve c'den küçüktür.");
        }
        else{
            System.out.println("a, b'ye eşit değildir ve c' den küçük değildir.");
        }
        if (a==b && a==c){
            System.out.println("a, b ve c birbirine eşittir.");
        }
        else {
            System.out.println("a, b ve c birbirine eşit değildir.");
        }
        /*
        * a , b ve c arasında bir sayı mı?
        * a, b veya c den büyük mü değil mi?
        * a, b ye eşit olup aynı zamanda c den küçük mü?
        * üç sayı birbirine eşit mi?
        * */
    }
}
