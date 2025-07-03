package com.juaracoding;


/*
IntelliJ IDEA 2025.1.2 (Community Edition)
Build #IC-251.26094.121, built on June 3, 2025
@Author HP Wildernes Dakhi
Java Developer
Created on 02/07/2025 19:42
@Last Modified 02/07/2025 19:42
Version 1.0
*/

public class Operator {
    public static void main(String[] args) {

        //operator aritmatika
        int a = 10;
        a += 5;
        System.out.println(a);

        int b = 10;
        b += b + 5;// b = b + b + 5
        System.out.println(b);

        int f = 1;
        f <<= 2;
        System.out.println("Hasil operasi : " + f);

        // operator perbandingan
        boolean angka = 5 < 4;
        System.out.println(angka);

        // operator bitwise
        int result = 10 & 12;
        System.out.println(result);

        //right sift
        int num = 60;
        System.out.println(num << 5);

        // Implementasi Operator
        int x = 10;
        int y = 5;
        boolean hasil;

        hasil = x == y;
        System.out.println("Apakah x == y ? : " + hasil);

        hasil = x > y;
        System.out.println("Apakah x > y ? : " + hasil);

        hasil = x != y;
        System.out.println("Apakah x != y ? : " + hasil);

        hasil = x < y;
        System.out.println("Apakah x < y ? : " + hasil);

        hasil = x <= y;
        System.out.println("Apakah x <= y ? : " + hasil);

        hasil = x >= y;
        System.out.println("Apakah x >= y ? : " + hasil);
    }
}
