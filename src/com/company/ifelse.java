package com.company;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int not=s.nextInt();

        int i=15;
        if(i==10){
            System.out.println("i'nin değeri 10'dur.");
        }
        else if(i<10){
            System.out.println("i'nin değeri 10'dan küçüktür.");
        }
        else{
            System.out.println("i'nin değeri 10'dan farklıdır.");
        }
        System.out.println("kontrolsüz");
    }
}