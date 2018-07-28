package com.company;


    public class ucgenyıldız {

    String kitap_adi;
    String yazar_adi;
    int sayfa_sayisi;

    public int sayfasayisiver(){
        return sayfa_sayisi;
    }
    public void kitapgoruntule(){
        System.out.println("\nRapor");
        System.out.println("**********");
        System.out.println("Kitap Adı: "+kitap_adi);
        System.out.println("Yazar Adı: "+yazar_adi);
        System.out.println("Sayfa Sayısı: "+sayfa_sayisi);
        System.out.println("\n");
    }

    public static void main(String[] args){
        Kitap kitap1 = new Kitap();
        Kitap kitap2 = new Kitap();

        kitap1.kitap_adi="Puslu Kıtalar Adası";
        kitap1.yazar_adi="İhsan Oktar Anar";
        kitap1.sayfa_sayisi=238;

        kitap2.kitap_adi="Vadidedi Zambak";
        kitap2.yazar_adi="Balzac";
        kitap2.sayfa_sayisi=307;

        kitap1.kitabigoruntule();
        kitap2.kitabigoruntule();

    }
}
