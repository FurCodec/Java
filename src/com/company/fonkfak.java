package com.company;

import java.util.Scanner;

public class fonkfak {
    public static int f(int x){
        int sonuc=1;
        for (int i=2;i<=x;i++){
            sonuc=sonuc*i;
        }
        return sonuc;
    }
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int m = girdi.nextInt();
        System.out.println("Girilen sayının faktöriyeli: "+f(m));
    }
}
