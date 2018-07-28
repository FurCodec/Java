package com.company;

import java.util.Scanner;

public class tarihkod {
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        System.out.print("Günü giriniz:");
        int g =t.nextInt();
        System.out.print("Ayı giriniz:");
        int a =t.nextInt();
        System.out.print("Yılı giriniz:");
        int y =t.nextInt();
        System.out.println("Gün Ay Yıl: "+g+"."+a+"."+y);
        System.out.println("Ay Gün Yıl: "+a+"."+g+"."+y);
        System.out.println("Yıl Ay Gün: "+y+"."+a+"."+g);
    }
}
