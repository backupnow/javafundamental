package com.juaracoding;

import java.awt.*;


/*
IntelliJ IDEA 2025.1.2 (Community Edition)
Build #IC-251.26094.121, built on June 3, 2025
@Author HP Wildernes Dakhi
Java Developer
Created on 01/07/2025 19:50
@Last Modified 01/07/2025 19:50
Version 1.0
*/

public class Variable {
    public static void main(String[] args){

        byte minRequest = 10;
        short maxProductIncart= 300;
        int stock = 99000;
        /*
         * integer total hanya 10digit
         * */
        int price = 10500000; // rule max price <2m
        long total = 3000000000l;// pake l krn long
        System.out.println(price);
        float rating = 4.9f;
        double saldo =300000.50;// tanpa d di belakang masih bisa
        System.out.println("Rating = "+rating);
        System.out.printf("%.2f\n",rating);

        System.out.println("-------------");
        char a = 'A';// hanya 1 karaakter utk tipe data char
        char predikat = 'A';

        String path = "C:\\Users\\HP>";// in contoh di kopi di cmd maka slases jadi 2 otomotis jika di paste ke intelij
        System.out.println(path);//kalo di hapus garis 1 maka error

        boolean stockTersedia = true;
        boolean stockTersedia2 = false;

        String firstName = "Juara";
        String lastName = "Coding";
        System.out.println(firstName+" "+lastName);

        byte age = 100;

        // implicit casting
        short data1 = 100;
        double dataDouble = data1;
        System.out.println(dataDouble);
        char data2 = 'Z';
        int data3 = data2;
        System.out.println(data3);

        // hitung total bayar setelah diskon
        float discount = 0.19f;
        double totalPayment = price - (price * discount);
        System.out.printf("Total Payment = %.2f\n",totalPayment);

        // explicit casting
        long dataLong = 4000000000L;
        int dataInt = (int) dataLong;
        System.out.println(dataInt);
        int roundedTotalSaldo = (int) saldo;
        System.out.println(roundedTotalSaldo);

        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;
        System.out.println(umur);
        System.out.println(duplikatUmur);

        Rectangle kotak = new Rectangle(0, 0, 20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);
        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());

    }

}
