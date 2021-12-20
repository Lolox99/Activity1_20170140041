/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Activity.satu;

/**
 *
 * @author AliFzaL
 */
public class Fruit {

    private String nama;
    private double harga;
    private double beli;
    private double bayar;
    private double total;
    private double diskon;

    
    public Fruit(String nama, double harga, double beli, double bayar, double total, double diskon) {
        this.nama = nama;
        this.harga = harga;
        this.beli = beli;
        this.bayar = bayar;
        this.total = total;
        this.diskon = diskon;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public double getTotal() {
        return total;
    }

    public double getDiskon() {
        return diskon;
    }

    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getBeli() {
        return beli;
    }

    public void setBeli(double beli) {
        this.beli = beli;
    }

    public double getBayar() {
        return bayar;
    }

    public void setBayar(double bayar) {
        this.bayar = bayar;
    }

    public double getDiskons() {
        double hargatotal;
        hargatotal = harga * beli;
        if (beli > 16000) {

            diskon = hargatotal * 10 / 100;
        } else if (beli > 25000) {
            diskon = hargatotal * 15 / 100;
        } else {
            diskon = 0;
        }
        return diskon;
    }

    public double getBayaran() {
        total = bayar - diskon;
        return total;
    }
}
