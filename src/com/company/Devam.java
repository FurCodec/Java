package com.company;

public class Devam {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.println("Mesaj" + i);
        }
        int i=0;
        while(i<10){
            System.out.println("Kesaj"+i);
            i++;
        }
        i=0;
        do{
            System.out.println("İkinci mesaj"+i);
            i++;
        }while(i<10);
    }
}
