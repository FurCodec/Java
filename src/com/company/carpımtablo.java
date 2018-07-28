package com.company;

import java.util.Scanner;

public class carpımtablo {
    public static void main(String[] args){
        Scanner g=new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int t=g.nextInt();
        int sonuc;
        if(t>0 && t<=10){

            for (int i=1;i<=10;i++){
                sonuc=t*i;
                System.out.println(t+"*"+i+"="+sonuc);
            }
            System.out.println();
        }
        else{
            System.out.println("Lütfen 1-10 arasında bir sayı giriniz!");

        }
    }

}
