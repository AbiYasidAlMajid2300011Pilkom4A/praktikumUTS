package com.abiyasidalmajid2300011.utspbo;

import java.util.Random;

public class UTS_GJL_1 {

    public static void main(String[] args) {
        Random random = new Random();
        int noBulan = random.nextInt(12) + 1;
        String namaBulan = "";
        
        switch (noBulan) {
            case 1:
                namaBulan = "Januari";
                break;
            case 2:
                namaBulan = "Februari";
                break;
            case 3:
                namaBulan = "Maret";
                break;
            case 4:
                namaBulan = "April";
                break;
            case 5:
                namaBulan = "Mei";
                break;
            case 6:
                namaBulan = "Juni";
                break;
            case 7:
                namaBulan = "Juli";
                break;
            case 8:
                namaBulan = "Agustus";
                break;
            case 9:
                namaBulan = "September";
                break;
            case 10:
                namaBulan = "Oktober";
                break;
            case 11:
                namaBulan = "November";
                break;
            case 12:
                namaBulan = "Desember";
                break;
            default:
                System.out.println("Tidak valid.");
        }
        System.out.println("Bilangan yang didapat: " + noBulan);
        System.out.println(namaBulan + " adalah bulan ke-" + noBulan);
    }
}