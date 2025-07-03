package com.juaracoding;


/*
IntelliJ IDEA 2025.1.2 (Community Edition)
Build #IC-251.26094.121, built on June 3, 2025
@Author HP Wildernes Dakhi
Java Developer
Created on 02/07/2025 20:13
@Last Modified 02/07/2025 20:13
Version 1.0
*/

public class Percabangan {
    public static void main(String[] args) {

        if (true) {
            System.out.println("Statement");
        }
        System.out.println("Next Statement");


        int num = 10;
        if (num % 2 == 1) {// bilangan % 2 artinya sisa pembagian bilangan tersebut dengan 2.
            // jika sisa pembagian 0 maka = genap, jika sisa 1 maka ganjil
            System.out.println("bilangan ganjil");
        } else {
            System.out.println("bilangan genap");

        }

        int maxPembeli = 5;
        if (maxPembeli > 3) {
            System.out.println("stock disable\n");
        } else {
            System.out.println("beli / sesua stock");
        }


        //harga minimal beli 10.500.000
        int hargaMinimal = 10500000;
        int totalPembelian = 50000000; // Misal user cuma belanja 5 juta
        // jika totalPembelian = 0 isinya maka : hasilnya di else paling bawah
        if (totalPembelian > 0) {
            if (totalPembelian >= hargaMinimal) {
                System.out.println("Lanjutkan belanja");
            } else {
                System.out.println("Keranjang tidak bisa di klik");
                System.out.println("Minimal pembelian: Rp " + hargaMinimal);
            }
        } else {
            System.out.println("Pembelian tidak valid.");
        }

        // coding trainer
        // jika stok habis tombol add to cart tidak dapat di klik alias disable
        int stock = 2;
        if (stock >= 1) { // 1 >= 1
            System.out.println("button add to cart clickable");
        } else {
            System.out.println("button add to cart disable");
        }

        // contoh pembelian stock di sable
        // if majemuk tipe ekspedisi kargo, reguler, express, instant
        String pilihTipeEkspedisi = "KARGO";
        int hargaEkspedisi = 0;
        if(pilihTipeEkspedisi.toLowerCase().equals("kargo")){
            hargaEkspedisi = 28000;
        } else if (pilihTipeEkspedisi == "reguler") {
            hargaEkspedisi = 40000;
        } else if (pilihTipeEkspedisi == "express") {
            hargaEkspedisi = 50000;
        } else if (pilihTipeEkspedisi == "instant") {
            hargaEkspedisi = 55000;
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("Ekspedisi = "+pilihTipeEkspedisi);
        System.out.println("Harga = "+hargaEkspedisi);


        int price = 1500000,stockReady = 5, minReq = 2, jmlPembelian = 4;// jika jmlPembelian melebihi maka disalbe
        // nested if
        System.out.println("---");
       // stocReady = 5;
       // minReq = 2;
        //jmlPembelian = 4;
        if(jmlPembelian >= minReq){
            if(jmlPembelian <= stockReady){
                System.out.println(jmlPembelian+" = Stock Sesuai");
                System.out.println("Subtotal = Rp. "+(jmlPembelian * price));
                System.out.println("Lanjutkan checkout");
                System.out.println("button add to cart clickable");
            } else {
                System.out.println("Maksimal pembelian "+stockReady+" item");
                System.out.println("button add to cart disable");
            }
        } else {
            System.out.println("Jumlah minimal pembelian "+minReq+" item");
            System.out.println("button add to cart disable");// klik keranjangnya aktif jika terpenuhi
        }
    }
}
