package com.company;

public class kolondeneme {
    static int f(int x){
        return 5*x+10;
    }
    public static void main(String[] args) {
        for (int a =1;a<=5;a++){
            if (a%5==0){
                System.out.println(""+a);
            }
        }
        for(int i=1;i<100;i*=2){
            System.out.println(""+i);
        }
        System .out.println(f(5));
    }

}
