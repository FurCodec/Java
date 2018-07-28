package com.company;

public class Kitap {
    String kitap_adi;
    String yazar_adi;
    int sayfa_sayisi;

    public int sayfasayisiniver(){
        return sayfa_sayisi;
    }
    public void kitabigoruntule(){
        System.out.println("\nRapor");
        System.out.println("**********");
        System.out.println("Kitap Adı: "+kitap_adi);
        System.out.println("Yazar Adı: "+yazar_adi);
        System.out.println("Sayfa Sayısı: "+sayfa_sayisi);
    }
    public static void main(String[] args){
        Kitap kitap1= new Kitap();
        Kitap kitap2= new Kitap();

        kitap1.yazar_adi="İhsan Oktay Anaar";
        kitap1.kitap_adi="Puslu Kıtalar Adası";
        kitap1.sayfa_sayisi=238;

        kitap2.kitap_adi="Vadideki Zambak";
        kitap2.yazar_adi="Balzac";
        kitap2.sayfa_sayisi=150;

        kitap1.kitabigoruntule();
        kitap2.kitabigoruntule();
    }
}
