/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author  NIM   : A2.1900070
 *          NAMA  : Galih Permana
 *          KELAS : TI-1A
 */

public class Main {


    public static void main (String[] args){


//        do {
//            aksi
//        } while (kondisi);


        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;


        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 1) {
                kondisi = false;
            }

        }while(kondisi);

        System.out.println("ini adalah akhir program");
    }
}
