package com.abiyasidalmajid2300011.utspbo;

public class Main {

    public static void main(String[] args) {
        LimasSegiEmpat limasSegiEmpat1 = new LimasSegiEmpat();
        System.out.println("Limas segi empat dengan luas alas : " + limasSegiEmpat1.getLuasAlas() + ", luas selubung limas : " + limasSegiEmpat1.getLuasSelubungLimas() + " dan tinggi : " + limasSegiEmpat1.getTinggi() + ". Luasnya : " + limasSegiEmpat1.getLuas() + ", sedangkan volumenya : " + limasSegiEmpat1.getVolume());
        
        LimasSegiEmpat limasSegiEmpat2 = new LimasSegiEmpat(30, 40, 50);
        System.out.println("Limas segi empat dengan luas alas : " + limasSegiEmpat2.getLuasAlas() + ", luas selubung limas : " + limasSegiEmpat2.getLuasSelubungLimas() + " dan tinggi : " + limasSegiEmpat2.getTinggi() + ". Luasnya : " + limasSegiEmpat2.getLuas() + ", sedangkan volumenya : " + limasSegiEmpat2.getVolume());
    
        LimasSegiEmpat limasSegiEmpat3 = new LimasSegiEmpat();
        limasSegiEmpat3.setLuasAlas(25);
        limasSegiEmpat3.setLuasSelubungLimas(35);
        limasSegiEmpat3.setTinggi(45);
        System.out.println("Limas segi empat dengan luas alas : " + limasSegiEmpat3.getLuasAlas() + ", luas selubung limas : " + limasSegiEmpat3.getLuasSelubungLimas() + " dan tinggi : " + limasSegiEmpat3.getTinggi() + ". Luasnya : " + limasSegiEmpat3.getLuas() + ", sedangkan volumenya : " + limasSegiEmpat3.getVolume());
    }    
}