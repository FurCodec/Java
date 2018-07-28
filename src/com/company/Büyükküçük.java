package com.company;

import java.util.Scanner;

public class Büyükküçük {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz:");
        int a = s.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        int b = s.nextInt();
        System.out.print("Üçüncü sayıyı giriniz:");
        int c = s.nextInt();
        if (a>b && a>c){
            if (b>c){
                System.out.println("En büyüğü:"+a+", En küçüğü:"+c);
            }
            else{
                System.out.println("En büyüğü:"+a+", En küçüğü:"+b);
            }
        }
        else if (b>a && b>c){
            if (a>c){
                System.out.println("En büyüğü:"+b+", En küçüğü:"+c);
            }
            else {
                System.out.println("En büyüğü:"+b+", En küçüğü:"+a);
            }
        }
        else{
            if(b>a){
                System.out.println("En büyüğü:"+c+", En küçüğü:"+a);
            }
            else{
                System.out.println("En büyüğü:"+c+", En küçüğü:"+b);
            }
        }
    }
}
