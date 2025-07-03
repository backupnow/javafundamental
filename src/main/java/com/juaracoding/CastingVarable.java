package com.juaracoding;


/*
IntelliJ IDEA 2025.1.2 (Community Edition)
Build #IC-251.26094.121, built on June 3, 2025
@Author HP Wildernes Dakhi
Java Developer
Created on 02/07/2025 17:34
@Last Modified 02/07/2025 17:34
Version 1.0
*/

public class CastingVarable {
    public static void main(String[] args) {

        System.out.println("--Implisit Casting--");
        short data1 = 457;
        double double_data1 = data1;
        System.out.println("short ke double : " + double_data1);

        char data2 = 'A';
        long long_data2 = data2;
        System.out.println("char ke long : " + long_data2);

        int data3 = 456;
        float float_data3 = data3;
        System.out.println("integer ke float : " + float_data3);

        byte data4 = 127;
        long long_data4 = data4;
        System.out.println("byte ke long : " + long_data4);

        float data5 = 565.3f;
        double double_data5 = data5;
        System.out.println("float ke double : " + double_data5);
        //-------------------------------------------
        System.out.println("\n--explicit Casting--");

        short a1 = 3;
        char chart_a = (char) a1;
        System.out.println("short to char : " + chart_a );

        long a2 = 246447;//ke byte
        byte byte_a = (byte) a2;
        int a3 = 34;//ke char
        char chart_a1 = (char) a3;
        char a4 = 1;//ke short
        short short_a = (short) a4;
        double a5 = 345.3;//ke float
        float float_a = (float) a5;

        //ini print option
        System.out.println("long ke byte : " + byte_a);
        System.out.println("int ke char : " + chart_a1);
        System.out.println("chart ke short : " + short_a);
        System.out.println("double ke float : " + float_a);


    }
}
