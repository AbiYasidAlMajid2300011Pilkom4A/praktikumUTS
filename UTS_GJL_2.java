package com.abiyasidalmajid2300011.utspbo;

import java.util.Scanner;

public class UTS_GJL_2 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        int inputBilangan;
        int jmlPositif = 0;
        int jmlNegatif = 0;
        int jmlBilangan = 0;
        double jmlNilai = 0;
        double rataRata;
        
        System.out.print("Masukkan bilangan integer, program berhenti saat input nilai 0: ");
        
        while (true) {            
            inputBilangan = myInput.nextInt();
            
            if (inputBilangan == 0) {
                break;
            }
            
            if (inputBilangan > 0) {
                jmlPositif++;
            } else {
                jmlNegatif++;
            }
            jmlNilai += inputBilangan;
            jmlBilangan++;
        }
        
        rataRata = jmlNilai / jmlBilangan;
        System.out.println("Jumlah bilangan positif: " + jmlPositif);
        System.out.println("Jumlah bilangan negatif: " + jmlNegatif);
        System.out.println("Nilai total: " + jmlNilai);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}