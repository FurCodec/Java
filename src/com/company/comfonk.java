package com.company;

import java.util.Scanner;

public class comfonk {

    public static int f(int n) {
        int sonuc = 1;
        for (int i = 2; i <= n; i++) {
            sonuc = sonuc * i;
        }
        return sonuc;
    }


    public static void main(String[] args){
        Scanner girdi =new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        int n = girdi.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        int r = girdi.nextInt();
        System.out.print("Kombinasyon sonucu: "+f(n)/(f(r)*(f(n-r))));
    }
}
