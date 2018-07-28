package com.company;

import java.util.Scanner;

public class Fonksiyonlar {
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13
        int a = 1;
        int b = 1;
        int c;
        Scanner s = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int d = s.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<d-2;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}
