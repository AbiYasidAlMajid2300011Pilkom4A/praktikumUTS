package com.abiyasidalmajid2300011.utspbo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        int luasAlas, luasSelubungLimas, tinggi;
        
        System.out.println("Limas 1");
        LimasSegiEmpat limasSegiEmpat1 = new LimasSegiEmpat();
        System.out.println("Limas segi empat dengan luas alas : " + limasSegiEmpat1.getLuasAlas() + ", luas selubung limas : " + limasSegiEmpat1.getLuasSelubungLimas() + " dan tinggi : " + limasSegiEmpat1.getTinggi() + ". Luasnya : " + limasSegiEmpat1.getLuas() + ", sedangkan volumenya : " + limasSegiEmpat1.getVolume());
        
        System.out.println("");
        
        System.out.println("Limas 2");
        System.out.print("Masukkan luas alas: ");
        luasAlas = myInput.nextInt();
        System.out.print("Masukkan luas selubung limas: ");
        luasSelubungLimas = myInput.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = myInput.nextInt();
        
        LimasSegiEmpat limasSegiEmpat2 = new LimasSegiEmpat(luasAlas, luasSelubungLimas, tinggi);
        System.out.println("Limas segi empat dengan luas alas : " + limasSegiEmpat2.getLuasAlas() + ", luas selubung limas : " + limasSegiEmpat2.getLuasSelubungLimas() + " dan tinggi : " + limasSegiEmpat2.getTinggi() + ". Luasnya : " + limasSegiEmpat2.getLuas() + ", sedangkan volumenya : " + limasSegiEmpat2.getVolume());
        
        System.out.println("");
        
        System.out.println("Limas 3");
        System.out.print("Masukkan luas alas: ");
        luasAlas = myInput.nextInt();
        System.out.print("Masukkan luas selubung limas: ");
        luasSelubungLimas = myInput.nextInt();
        System.out.print("Masukkan tinggi: ");
        tinggi = myInput.nextInt();
        
        LimasSegiEmpat limasSegiEmpat3 = new LimasSegiEmpat();
        limasSegiEmpat3.setLuasAlas(luasAlas);
        limasSegiEmpat3.setLuasSelubungLimas(luasSelubungLimas);
        limasSegiEmpat3.setTinggi(tinggi);
        System.out.println("Limas segi empat dengan luas alas : " + limasSegiEmpat3.getLuasAlas() + ", luas selubung limas : " + limasSegiEmpat3.getLuasSelubungLimas() + " dan tinggi : " + limasSegiEmpat3.getTinggi() + ". Luasnya : " + limasSegiEmpat3.getLuas() + ", sedangkan volumenya : " + limasSegiEmpat3.getVolume());
    }    
}
