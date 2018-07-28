package com.company;


import javax.swing.*;

public class Yazdir {
    public void main(String[] args){
        String yas = JOptionPane.showInputDialog(null,"Lütfen Yaşınızı Giriniz:");
        int sonuc;
        sonuc = Integer.parseInt(yas)*3;
        JOptionPane.showMessageDialog(null,"Yaşınız:" +sonuc);
    }
}