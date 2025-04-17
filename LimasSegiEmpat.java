package com.abiyasidalmajid2300011.utspbo;

public class LimasSegiEmpat {
    private double luasAlas;
    private double luasSelubungLimas;
    private double tinggi;

    LimasSegiEmpat() {
        luasAlas = 1;
        luasSelubungLimas = 1;
        tinggi = 1;
    }
    
    LimasSegiEmpat(double luasAlas, double luasSelubungLimas, double tinggi) {
        this.luasAlas = luasAlas;
        this.luasSelubungLimas = luasSelubungLimas;
        this.tinggi = tinggi;
    }

    double getLuas() {
        return luasAlas + luasSelubungLimas;
    }

    double getVolume() {
        return (luasAlas * tinggi) / 3;
    }

    public double getLuasAlas() {
        return luasAlas;
    }

    public void setLuasAlas(double luasAlas) {
        this.luasAlas = luasAlas;
    }

    public double getLuasSelubungLimas() {
        return luasSelubungLimas;
    }

    public void setLuasSelubungLimas(double luasSelubungLimas) {
        this.luasSelubungLimas = luasSelubungLimas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}