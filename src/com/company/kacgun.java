package com.company;

import java.util.Scanner;

public class kacgun {
    public static void main(String[] args){
        Scanner t=new Scanner (System.in);
        System.out.print("Büyük olan tarihin yılını giriniz:");
        int y = t.nextInt();
        System.out.print("Büyük olan tarihin ayını giriniz:");
        int a = t.nextInt();
        System.out.print("Büyük olan tarihin gününü giriniz:");
        int g = t.nextInt();
        System.out.print("Küçük olan tarihin yılını giriniz:");
        int y1 = t.nextInt();
        System.out.print("Küçük olan tarihin ayını giriniz:");
        int a1 = t.nextInt();
        System.out.print("Küçük olan tarihin gününü giriniz:");
        int g1 = t.nextInt();
        System.out.print("İki tarih arasındaki gün: "+(((y-y1)*365)+((a-a1)*30)+(g-g1)));
    }
}
