package com.abiyasidalmajid2300011.utspbo;

import java.util.Scanner;

public class UTS_GJL_3 {
    public static int sumDigits(long n) {
        int jmlDigit = 0;
        
        while (n > 0) {            
            jmlDigit += n % 10;
            n /= 10;
        }
        return jmlDigit;
    }
        
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan bulat: ");
        long n = myInput.nextLong();
        System.out.println("Jumlah hitung digit: " + sumDigits(n));
    }    
}