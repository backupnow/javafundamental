package com.juaracoding;


/*
IntelliJ IDEA 2025.1.2 (Community Edition)
Build #IC-251.26094.121, built on June 3, 2025
@Author HP Wildernes Dakhi
Java Developer
Created on 03/07/2025 1:06
@Last Modified 03/07/2025 1:06
Version 1.0
*/

import java.awt.*;

public class VariablePashing {

    public static void main(String[] args) {

        //Passing By Value
        int nilai = 20;// nilai awal
        int duplikatNilai = nilai;

        duplikatNilai = 100;//nilai akhir
        System.out.println(nilai);
        System.out.println(duplikatNilai);

        //Passing By Reference

        Rectangle kotak = new Rectangle(0, 0, 20, 30);
        Rectangle duplikatKotak = new Rectangle(kotak); // bikin duplikat asli, bukan referensi

        duplikatKotak.setSize(80, 90); // ubah ukuran duplikat saja

        System.out.println(kotak.getSize());           // hasil: java.awt.Dimension[width=20,height=30]
        System.out.println(duplikatKotak.getSize());   // hasil: java.awt.Dimension[width=80,height=90]
    }
}
