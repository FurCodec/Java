package com.company;

import java.util.Scanner;

public class faktöriyel {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int f = girdi.nextInt();
        int sonuc=1;
        for (int i=2;i<=f;i++) {
            sonuc=sonuc*i;
        }
        System.out.println(sonuc);

    }
}
