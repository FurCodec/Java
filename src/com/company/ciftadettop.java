package com.company;

import java.util.Scanner;

public class ciftadettop {
    public static void main(String[] args){
        int adet2=0;
        int toplam=0;
        Scanner girdi=new Scanner(System.in);
        System.out.print("Büyük sayıyı giriniz:");
        int b=girdi.nextInt();
        System.out.print("Küçük sayıyı giriniz:");
        int k=girdi.nextInt();
        for (int i=k;i<=b;i++){
            if(i%2==0){
                adet2++;
                toplam=toplam+i;
            }
        }
        System.out.println(k+" ile "+b+" arasında "+adet2+" tane çift sayı vardır. Toplamları ise: "+toplam);
    }
}
