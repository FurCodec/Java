package com.company;

import java.util.Scanner;

public class Deneme {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Adınızı giriniz:");
        String m=s.nextLine();
        String ilkharf=m.substring(0,1);
        System.out.println(ilkharf);
    }
}
