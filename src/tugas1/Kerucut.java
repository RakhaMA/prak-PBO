/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author rakha mohammad
 */
public class Kerucut extends BangunRuang{
    int tinggi, jari, garis_pelukis;
    
    public Kerucut(int tinggi, int jari) {
        this.tinggi = tinggi;
        this.jari = jari;
        super.setWarna("Biru");
    }
    
    @Override
    double volume(){
        return Math.PI*jari*jari*tinggi*1/3;
    }
    
    @Override
    double luasPermukaan(){
        garis_pelukis = (jari^2+tinggi^2)^(1/2);
        return Math.PI*jari*(jari+garis_pelukis);
    }
    
    void tampilkan(){
        System.out.println("Volume Kerucut : " + volume());
        System.out.println("Luas Permukaan Kerucut : " + luasPermukaan());
        System.out.println("Warna : " + super.getWarna());
    }
}
